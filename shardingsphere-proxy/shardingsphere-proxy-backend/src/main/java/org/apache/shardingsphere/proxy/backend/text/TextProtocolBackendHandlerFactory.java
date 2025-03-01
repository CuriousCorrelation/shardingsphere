/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.proxy.backend.text;

import com.google.common.base.Strings;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.distsql.parser.statement.DistSQLStatement;
import org.apache.shardingsphere.distsql.parser.statement.ral.QueryableRALStatement;
import org.apache.shardingsphere.distsql.parser.statement.rql.RQLStatement;
import org.apache.shardingsphere.infra.binder.SQLStatementContextFactory;
import org.apache.shardingsphere.infra.binder.statement.SQLStatementContext;
import org.apache.shardingsphere.infra.binder.type.TableAvailable;
import org.apache.shardingsphere.infra.database.type.DatabaseType;
import org.apache.shardingsphere.infra.executor.check.SQLCheckEngine;
import org.apache.shardingsphere.infra.rule.ShardingSphereRule;
import org.apache.shardingsphere.mode.metadata.MetaDataContexts;
import org.apache.shardingsphere.parser.rule.SQLParserRule;
import org.apache.shardingsphere.proxy.backend.communication.SQLStatementDatabaseHolder;
import org.apache.shardingsphere.proxy.backend.context.ProxyContext;
import org.apache.shardingsphere.proxy.backend.session.ConnectionSession;
import org.apache.shardingsphere.proxy.backend.text.admin.DatabaseAdminBackendHandlerFactory;
import org.apache.shardingsphere.proxy.backend.text.data.DatabaseBackendHandlerFactory;
import org.apache.shardingsphere.proxy.backend.text.database.DatabaseOperateBackendHandlerFactory;
import org.apache.shardingsphere.proxy.backend.text.distsql.DistSQLBackendHandlerFactory;
import org.apache.shardingsphere.proxy.backend.text.extra.ExtraTextProtocolBackendHandler;
import org.apache.shardingsphere.proxy.backend.text.skip.SkipBackendHandler;
import org.apache.shardingsphere.proxy.backend.text.transaction.TransactionBackendHandlerFactory;
import org.apache.shardingsphere.spi.ShardingSphereServiceLoader;
import org.apache.shardingsphere.sql.parser.sql.common.statement.SQLStatement;
import org.apache.shardingsphere.sql.parser.sql.common.statement.dal.FlushStatement;
import org.apache.shardingsphere.sql.parser.sql.common.statement.dcl.DCLStatement;
import org.apache.shardingsphere.sql.parser.sql.common.statement.ddl.CreateDatabaseStatement;
import org.apache.shardingsphere.sql.parser.sql.common.statement.ddl.DropDatabaseStatement;
import org.apache.shardingsphere.sql.parser.sql.common.statement.dml.EmptyStatement;
import org.apache.shardingsphere.sql.parser.sql.common.statement.tcl.TCLStatement;
import org.apache.shardingsphere.sql.parser.sql.common.util.SQLUtil;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.mysql.dal.MySQLShowCreateUserStatement;
import org.apache.shardingsphere.transaction.utils.AutoCommitUtils;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Text protocol backend handler factory.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TextProtocolBackendHandlerFactory {
    
    static {
        ShardingSphereServiceLoader.register(ExtraTextProtocolBackendHandler.class);
    }
    
    /**
     * Create new instance of text protocol backend handler.
     *
     * @param databaseType database type
     * @param sql SQL to be executed
     * @param sqlStatementSupplier optional SQL statement supplier
     * @param connectionSession connection session
     * @return created instance
     * @throws SQLException SQL exception
     */
    @SuppressWarnings("unchecked")
    public static TextProtocolBackendHandler newInstance(final DatabaseType databaseType, final String sql, final Supplier<Optional<SQLStatement>> sqlStatementSupplier,
                                                         final ConnectionSession connectionSession) throws SQLException {
        String trimSQL = SQLUtil.trimComment(sql);
        if (Strings.isNullOrEmpty(trimSQL)) {
            return new SkipBackendHandler(new EmptyStatement());
        }
        SQLStatement sqlStatement = sqlStatementSupplier.get().orElseGet(() -> {
            SQLParserRule sqlParserRule = ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getGlobalRuleMetaData().getSingleRule(SQLParserRule.class);
            return sqlParserRule.getSQLParserEngine(getProtocolType(databaseType, connectionSession).getType()).parse(sql, false);
        });
        databaseType.handleRollbackOnly(connectionSession.getTransactionStatus().isRollbackOnly(), sqlStatement);
        checkUnsupportedSQLStatement(sqlStatement);
        if (sqlStatement instanceof DistSQLStatement) {
            if (connectionSession.getTransactionStatus().isInTransaction() && !(sqlStatement instanceof RQLStatement || sqlStatement instanceof QueryableRALStatement)) {
                throw new UnsupportedOperationException("Non-query dist sql is not supported within a transaction");
            }
            return DistSQLBackendHandlerFactory.newInstance((DistSQLStatement) sqlStatement, connectionSession);
        }
        handleAutoCommit(sqlStatement, connectionSession);
        SQLStatementContext<?> sqlStatementContext = SQLStatementContextFactory.newInstance(ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getDatabases(),
                sqlStatement, connectionSession.getDefaultDatabaseName());
        Optional<TextProtocolBackendHandler> backendHandler = DatabaseAdminBackendHandlerFactory.newInstance(databaseType, sqlStatementContext, connectionSession, sql);
        if (backendHandler.isPresent()) {
            return backendHandler.get();
        }
        // TODO optimize SQLStatementDatabaseHolder
        if (sqlStatementContext instanceof TableAvailable) {
            ((TableAvailable) sqlStatementContext).getTablesContext().getDatabaseName().ifPresent(SQLStatementDatabaseHolder::set);
        }
        Optional<ExtraTextProtocolBackendHandler> extraHandler = findExtraTextProtocolBackendHandler(sqlStatement);
        if (extraHandler.isPresent()) {
            return extraHandler.get();
        }
        Optional<TextProtocolBackendHandler> databaseOperateHandler = findDatabaseOperateBackendHandler(sqlStatement, connectionSession);
        if (databaseOperateHandler.isPresent()) {
            return databaseOperateHandler.get();
        }
        String databaseName = sqlStatementContext.getTablesContext().getDatabaseName().isPresent()
                ? sqlStatementContext.getTablesContext().getDatabaseName().get()
                : connectionSession.getDatabaseName();
        SQLCheckEngine.check(sqlStatementContext, Collections.emptyList(),
                getRules(databaseName), databaseName, ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getDatabases(), connectionSession.getGrantee());
        if (sqlStatement instanceof TCLStatement) {
            return TransactionBackendHandlerFactory.newInstance((SQLStatementContext<TCLStatement>) sqlStatementContext, sql, connectionSession);
        }
        backendHandler = DatabaseAdminBackendHandlerFactory.newInstance(databaseType, sqlStatementContext, connectionSession);
        return backendHandler.orElseGet(() -> DatabaseBackendHandlerFactory.newInstance(sqlStatementContext, sql, connectionSession));
    }
    
    private static DatabaseType getProtocolType(final DatabaseType defaultDatabaseType, final ConnectionSession connectionSession) {
        String databaseName = connectionSession.getDatabaseName();
        return Strings.isNullOrEmpty(databaseName) || !ProxyContext.getInstance().databaseExists(databaseName)
                ? defaultDatabaseType
                : ProxyContext.getInstance().getContextManager().getMetaDataContexts().getMetaData().getDatabases().get(databaseName).getProtocolType();
    }
    
    private static void handleAutoCommit(final SQLStatement sqlStatement, final ConnectionSession connectionSession) throws SQLException {
        if (AutoCommitUtils.needOpenTransaction(sqlStatement)) {
            connectionSession.getBackendConnection().handleAutoCommit();
        }
    }
    
    private static Optional<ExtraTextProtocolBackendHandler> findExtraTextProtocolBackendHandler(final SQLStatement sqlStatement) {
        for (ExtraTextProtocolBackendHandler each : ShardingSphereServiceLoader.getServiceInstances(ExtraTextProtocolBackendHandler.class)) {
            if (each.accept(sqlStatement)) {
                return Optional.of(each);
            }
        }
        return Optional.empty();
    }
    
    private static Optional<TextProtocolBackendHandler> findDatabaseOperateBackendHandler(final SQLStatement sqlStatement, final ConnectionSession connectionSession) throws SQLException {
        if (sqlStatement instanceof CreateDatabaseStatement || sqlStatement instanceof DropDatabaseStatement) {
            return Optional.of(DatabaseOperateBackendHandlerFactory.newInstance(sqlStatement, connectionSession));
        }
        return Optional.empty();
    }
    
    private static Collection<ShardingSphereRule> getRules(final String databaseName) {
        MetaDataContexts contexts = ProxyContext.getInstance().getContextManager().getMetaDataContexts();
        if (Strings.isNullOrEmpty(databaseName) || !ProxyContext.getInstance().databaseExists(databaseName)) {
            return contexts.getMetaData().getGlobalRuleMetaData().getRules();
        }
        Collection<ShardingSphereRule> result;
        result = new LinkedList<>(contexts.getMetaData().getDatabases().get(databaseName).getRuleMetaData().getRules());
        result.addAll(contexts.getMetaData().getGlobalRuleMetaData().getRules());
        return result;
    }
    
    private static void checkUnsupportedSQLStatement(final SQLStatement sqlStatement) {
        if (sqlStatement instanceof DCLStatement || sqlStatement instanceof FlushStatement || sqlStatement instanceof MySQLShowCreateUserStatement) {
            throw new UnsupportedOperationException("Unsupported operation");
        }
    }
}
