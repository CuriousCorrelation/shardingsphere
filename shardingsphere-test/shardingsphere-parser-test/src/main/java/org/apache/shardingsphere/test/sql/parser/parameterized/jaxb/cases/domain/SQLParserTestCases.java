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

package org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain;

import com.google.common.base.Preconditions;
import lombok.Getter;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.CommonStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.SQLParserTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.AlterResourceGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.BinlogStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.CacheIndexStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.CheckTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ChecksumTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.CloneStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.CreateResourceGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.DelimiterStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.DropResourceGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ExplainStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.FlushStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.HelpStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.InstallComponentStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.InstallPluginStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.KillStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.LoadIndexInfoStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.OptimizeTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.RepairTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ResetPersistStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ResetStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.SetParameterStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.SetResourceGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowBinlogEventsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowCharacterSetStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowCollationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowColumnsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowCreateTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowCreateTriggerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowCreateUserStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowDatabasesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowEventsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowFunctionStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowIndexStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowOpenTablesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowProcedureCodeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowProcedureStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowRelaylogEventsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowReplicaStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowReplicasStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowSlaveHostsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowSlaveStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowTableStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowTablesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowTriggersStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShowVariablesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.ShutdownStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.UninstallComponentStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.UninstallPluginStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dal.UseStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.AlterLoginStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.AlterRoleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.AlterUserStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.CreateLoginStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.CreateRoleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.CreateUserStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.DenyUserStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.DropLoginStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.DropRoleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.DropUserStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.GrantStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.ReassignOwnedStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.RenameUserStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.RevertStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.RevokeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.SetDefaultRoleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.SetPasswordStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.SetRoleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dcl.SetUserStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterAggregateStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterAnalyticViewStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterAttributeDimensionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterCollationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterConversionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterDatabaseDictionaryStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterDatabaseLinkStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterDatabaseStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterDefaultPrivilegesTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterDimensionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterDirectoryStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterDomainStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterExtensionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterFlashbackArchiveStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterForeignDataWrapperTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterForeignTableTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterFunctionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterIndexStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterLanguageStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterLibraryStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterMaterializedViewStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterMaterializedZonemapStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterOperatorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterOutlineStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterPackageStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterProcedureStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterPublicationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterRoutineStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterPolicyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterSchemaStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterSequenceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterServerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterServiceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterSessionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterSynonymStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterSystemStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterTextSearchStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterTriggerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterTypeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterViewStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AlterInmemoryJoinGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AnalyzeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AssociateStatisticsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.AuditStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CloseStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.ClusterStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CommentStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateAccessMethodStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateAggregateStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateCastStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateCollationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateContextStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateControlFileStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateConversionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateDatabaseLinkStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateDatabaseStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateDimensionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateDirectoryStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateDiskgroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateDomainStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateEditionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateExtensionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateFlashbackArchiveStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateFunctionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateIndexStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateInmemoryJoinGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateLanguageStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateLockdownProfileStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreatePFileStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateProcedureStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreatePublicationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateRestorePointStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateRollbackSegmentStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateSPFileStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateSchemaStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateSequenceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateServerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateServiceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateSynonymStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateTablespaceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateTextSearchStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateTriggerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateTypeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CreateViewStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.CursorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DeclareStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DisassociateStatisticsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DiscardStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropAccessMethodStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropAggregateStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropCastStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropCollationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropConversionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropDatabaseLinkStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropDatabaseStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropDimensionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropDirectoryStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropDiskgroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropDomainStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropEditionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropEventTriggerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropExtensionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropFlashbackArchiveStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropForeignDataWrapperStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropForeignTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropFunctionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropIndexStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropInmemoryJoinGroupStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropLanguageStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropLockdownProfileStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropMaterializedViewStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropOperatorClassStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropOperatorFamilyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropOperatorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropOutlineStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropOwnedStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropPackageStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropPolicyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropProcedureStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropPublicationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropRestorePointStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropRollbackSegmentStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropRoutineStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropSchemaStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropSequenceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropServerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropServiceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropStatisticsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropSubscriptionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropSynonymStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropTextSearchStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropTriggerStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropTypeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.DropViewStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.FetchStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.FlashbackDatabaseStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.FlashbackTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.MoveStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.NoAuditStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.NotifyStmtStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.PreparedStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.PurgeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.RefreshMatViewStmtStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.RenameStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.RenameTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.TruncateStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.UnlistenStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.AddShardingHintDatabaseValueStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.AddShardingHintTableValueStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.AlterInstanceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.AlterSQLParserRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.AlterTrafficRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ApplyDistSQLStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ClearHintStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ClearReadwriteSplittingHintStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ClearShardingHintStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.CountInstanceRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.CreateTrafficRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.DiscardDistSQLStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.DropTrafficRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ExportDatabaseConfigurationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ImportDatabaseConfigurationStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.LabelInstanceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ParseStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.PrepareDistSQLStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.PreviewStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.RefreshTableMetadataStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.SetReadwriteSplittingHintStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.SetShardingHintDatabaseValueStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.SetVariableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowAuthorityRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowInstanceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowReadwriteSplittingHintStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowReadwriteSplittingReadResourcesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowSQLParserRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowScalingListStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowShardingHintStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowTableMetadataStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowTrafficRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowTransactionRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.ShowVariableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.UnlabelInstanceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.ApplyScalingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.CheckScalingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.DropScalingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.ResetScalingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.RestoreScalingSourceWritingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.ShowScalingCheckAlgorithmsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.ShowScalingStatusStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.StartScalingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.StopScalingSourceWritingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.ral.scaling.StopScalingStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDatabaseDiscoveryConstructionRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDatabaseDiscoveryDefinitionRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDatabaseDiscoveryHeartbeatStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDatabaseDiscoveryTypeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDefaultShardingStrategyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterDefaultSingleTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterEncryptRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterReadwriteSplittingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterResourceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShadowAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShadowRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingAutoTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingBindingTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingBroadcastTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingKeyGeneratorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.AlterShardingTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.DisableShardingScalingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.alter.EnableShardingScalingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.AddResourceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateDatabaseDiscoveryConstructionRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateDatabaseDiscoveryDefinitionRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateDatabaseDiscoveryHeartbeatStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateDatabaseDiscoveryTypeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateDefaultShadowAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateDefaultShardingStrategyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateDefaultSingleTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateEncryptRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateReadwriteSplittingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShadowAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShadowRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingAuditorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingAutoTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingBindingTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingBroadcastTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingKeyGeneratorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingScalingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.create.CreateShardingTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropDataBaseDiscoveryHeartbeatStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropDataBaseDiscoveryRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropDataBaseDiscoveryTypeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropDefaultShardingStrategyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropDefaultSingleTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropEncryptRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropReadwriteSplittingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropResourceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShadowAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShadowRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingBindingTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingBroadcastTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingKeyGeneratorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingScalingRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rdl.drop.DropShardingTableRuleStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.CountDatabaseRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowDataBaseDiscoveryRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowDefaultShardingStrategyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowEncryptRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowReadwriteSplittingRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowRulesUsedResourceStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShadowAlgorithmsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShadowRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShadowTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingAlgorithmsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingAuditorsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingBindingTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingBroadcastTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingKeyGeneratorsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingScalingRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingTableNodesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingTableRulesUsedAlgorithmStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowShardingTableRulesUsedKeyGeneratorStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowSingleTableRulesStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowSingleTableStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowUnusedShardingAlgorithmsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.distsql.rql.ShowUnusedShardingKeyGeneratorsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.CallStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.CheckpointStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.CopyStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.DeleteStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.DoStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.InsertStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.MergeStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.SelectStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.dml.UpdateStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.BeginTransactionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.CommitStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.LockStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.PrepareTransactionTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.RollbackStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.SavepointStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.SetAutoCommitStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.SetConstraintsStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.SetTransactionStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.UnlockStatementTestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.tcl.XATestCase;
import org.apache.shardingsphere.test.sql.parser.parameterized.jaxb.cases.domain.statement.ddl.ListenStatementTestCase;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * SQL parser test cases.
 */
@XmlRootElement(name = "sql-parser-test-cases")
@Getter
public final class SQLParserTestCases {
    
    @XmlElement(name = "select")
    private final List<SelectStatementTestCase> selectTestCases = new LinkedList<>();
    
    @XmlElement(name = "update")
    private final List<UpdateStatementTestCase> updateTestCases = new LinkedList<>();
    
    @XmlElement(name = "delete")
    private final List<DeleteStatementTestCase> deleteTestCases = new LinkedList<>();
    
    @XmlElement(name = "insert")
    private final List<InsertStatementTestCase> insertTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-table")
    private final List<CreateTableStatementTestCase> createTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-edition")
    private final List<CreateEditionStatementTestCase> createEditionTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-table")
    private final List<AlterTableStatementTestCase> alterTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "rename-table")
    private final List<RenameTableStatementTestCase> renameTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-table")
    private final List<DropTableStatementTestCase> dropTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-text-search")
    private final List<DropTextSearchStatementTestCase> dropTextSearchTestCases = new LinkedList<>();
    
    @XmlElement(name = "truncate")
    private final List<TruncateStatementTestCase> truncateTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-edition")
    private final List<DropEditionStatementTestCase> dropEditionTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-outline")
    private final List<DropOutlineStatementTestCase> dropOutlineTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-outline")
    private final List<AlterOutlineStatementTestCase> alterOutlineTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-index")
    private final List<CreateIndexStatementTestCase> createIndexTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-index")
    private final List<AlterIndexStatementTestCase> alterIndexTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-index")
    private final List<DropIndexStatementTestCase> dropIndexTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-constraints")
    private final List<SetConstraintsStatementTestCase> setConstraintsTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-transaction")
    private final List<SetTransactionStatementTestCase> setTransactionTestCases = new LinkedList<>();
    
    @XmlElement(name = "begin-transaction")
    private final List<BeginTransactionStatementTestCase> beginTransactionTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-auto-commit")
    private final List<SetAutoCommitStatementTestCase> setAutoCommitTestCases = new LinkedList<>();
    
    @XmlElement(name = "commit")
    private final List<CommitStatementTestCase> commitTestCases = new LinkedList<>();
    
    @XmlElement(name = "rollback")
    private final List<RollbackStatementTestCase> rollbackTestCases = new LinkedList<>();
    
    @XmlElement(name = "savepoint")
    private final List<SavepointStatementTestCase> savepointTestCases = new LinkedList<>();
    
    @XmlElement(name = "grant")
    private final List<GrantStatementTestCase> grantTestCases = new LinkedList<>();
    
    @XmlElement(name = "revoke")
    private final List<RevokeStatementTestCase> revokeTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-user")
    private final List<CreateUserStatementTestCase> createUserTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-user")
    private final List<AlterUserStatementTestCase> alterUserTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-user")
    private final List<DropUserStatementTestCase> dropUserTestCases = new LinkedList<>();
    
    @XmlElement(name = "rename-user")
    private final List<RenameUserStatementTestCase> renameUserTestCases = new LinkedList<>();
    
    @XmlElement(name = "deny-user")
    private final List<DenyUserStatementTestCase> denyUserTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-login")
    private final List<CreateLoginStatementTestCase> createLoginTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-login")
    private final List<AlterLoginStatementTestCase> alterLoginTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-login")
    private final List<DropLoginStatementTestCase> dropLoginTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-role")
    private final List<CreateRoleStatementTestCase> createRoleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-role")
    private final List<AlterRoleStatementTestCase> alterRoleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-role")
    private final List<DropRoleStatementTestCase> dropRoleTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-default-role")
    private final List<SetDefaultRoleStatementTestCase> setDefaultRoleTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-role")
    private final List<SetRoleStatementTestCase> setRoleTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-password")
    private final List<SetPasswordStatementTestCase> setPasswordTestCases = new LinkedList<>();
    
    @XmlElement(name = "use")
    private final List<UseStatementTestCase> useTestCases = new LinkedList<>();
    
    @XmlElement(name = "describe")
    private final List<ExplainStatementTestCase> describeTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-databases")
    private final List<ShowDatabasesStatementTestCase> showDatabasesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-tables")
    private final List<ShowTablesStatementTestCase> showTablesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-function-status")
    private final List<ShowFunctionStatusStatementTestCase> showFunctionStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-procedure-status")
    private final List<ShowProcedureStatusStatementTestCase> showProcedureStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-procedure-code")
    private final List<ShowProcedureCodeStatementTestCase> showProcedureCodeTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-relaylog-events")
    private final List<ShowRelaylogEventsStatementTestCase> showRelaylogEventsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-slave-hosts")
    private final List<ShowSlaveHostsStatementTestCase> showSlaveHostsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-columns")
    private final List<ShowColumnsStatementTestCase> showColumnsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-create-table")
    private final List<ShowCreateTableStatementTestCase> showCreateTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-create-trigger")
    private final List<ShowCreateTriggerStatementTestCase> showCreateTriggerTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-resource-group")
    private final List<AlterResourceGroupStatementTestCase> alterResourceGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-resource-group")
    private final List<CreateResourceGroupStatementTestCase> createResourceGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-resource-group")
    private final List<DropResourceGroupStatementTestCase> dropResourceGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "binlog")
    private final List<BinlogStatementTestCase> binlogTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-create-user")
    private final List<ShowCreateUserStatementTestCase> showCreateUserTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-table-status")
    private final List<ShowTableStatusStatementTestCase> showTableStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-index")
    private final List<ShowIndexStatementTestCase> showIndexTestCases = new LinkedList<>();
    
    @XmlElement(name = "show")
    private final List<ShowStatementTestCase> showTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-parameter")
    private final List<SetParameterStatementTestCase> setParameterTestCases = new LinkedList<>();
    
    @XmlElement(name = "common")
    private final List<CommonStatementTestCase> commonTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-function")
    private final List<AlterFunctionStatementTestCase> alterFunctionTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-database")
    private final List<AlterDatabaseStatementTestCase> alterDatabaseTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-dimension")
    private final List<AlterDimensionStatementTestCase> alterDimensionTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-procedure")
    private final List<AlterProcedureStatementTestCase> alterProcedureTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-publication")
    private final List<AlterPublicationStatementTestCase> alterPublicationTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-policy")
    private final List<AlterPolicyStatementTestCase> alterPolicyTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-routine")
    private final List<AlterRoutineStatementTestCase> alterRoutineTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-server")
    private final List<AlterServerStatementTestCase> alterServerTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-session")
    private final List<AlterSessionStatementTestCase> alterSessionTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-synonym")
    private final List<AlterSynonymStatementTestCase> alterSynonymTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-type")
    private final List<AlterTypeStatementTestCase> alterTypeTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-rule")
    private final List<AlterRuleStatementTestCase> alterRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-directory")
    private final List<AlterDirectoryStatementTestCase> alterDirectoryTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-system")
    private final List<AlterSystemStatementTestCase> alterSystemTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-database")
    private final List<CreateDatabaseStatementTestCase> createDatabaseTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-database-link")
    private final List<CreateDatabaseLinkStatementTestCase> createDatabaseLinkTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-database-link")
    private final List<DropDatabaseLinkStatementTestCase> dropDatabaseLinkTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-database-link")
    private final List<AlterDatabaseLinkStatementTestCase> alterDatabaseLinkTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-database-dictionary")
    private final List<AlterDatabaseDictionaryStatementTestCase> alterDatabaseDictionaryTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-view")
    private final List<AlterViewStatementTestCase> alterViewTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-package")
    private final List<AlterPackageStatementTestCase> alterPackageTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-package")
    private final List<DropPackageStatementTestCase> dropPackageTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-dimension")
    private final List<CreateDimensionStatementTestCase> createDimensionTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-function")
    private final List<CreateFunctionStatementTestCase> createFunctionTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-procedure")
    private final List<CreateProcedureStatementTestCase> createProcedureTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-server")
    private final List<CreateServerStatementTestCase> createServerTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-trigger")
    private final List<CreateTriggerStatementTestCase> createTriggerTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-view")
    private final List<CreateViewStatementTestCase> createViewTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-synonym")
    private final List<CreateSynonymStatementTestCase> createSynonymTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-aggregate")
    private final List<CreateAggregateStatementTestCase> createAggregateTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-publication")
    private final List<CreatePublicationStatementTestCase> createPublicationTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-synonym")
    private final List<DropSynonymStatementTestCase> dropSynonymTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-directory")
    private final List<CreateDirectoryStatementTestCase> createDirectoryTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-domain")
    private final List<CreateDomainStatementTestCase> createDomainTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-rule")
    private final List<CreateRuleStatementTestCase> createRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-type")
    private final List<CreateTypeStatementTestCase> createTypeTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-extension")
    private final List<CreateExtensionStatementTestCase> createExtensionTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-extension")
    private final List<AlterExtensionStatementTestCase> alterExtensionTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-extension")
    private final List<DropExtensionStatementTestCase> dropExtensionTestCases = new LinkedList<>();
    
    @XmlElement(name = "declare")
    private final List<DeclareStatementTestCase> declareTestCases = new LinkedList<>();
    
    @XmlElement(name = "discard")
    private final List<DiscardStatementTestCase> discardTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-database")
    private final List<DropDatabaseStatementTestCase> dropDatabaseTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-dimension")
    private final List<DropDimensionStatementTestCase> dropDimensionTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-directory")
    private final List<DropDirectoryStatementTestCase> dropDirectoryTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-function")
    private final List<DropFunctionStatementTestCase> dropFunctionTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-group")
    private final List<DropGroupStatementTestCase> dropGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-policy")
    private final List<DropPolicyStatementTestCase> dropPolicyTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-procedure")
    private final List<DropProcedureStatementTestCase> dropProcedureTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-routine")
    private final List<DropRoutineStatementTestCase> dropRoutineTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-rule")
    private final List<DropRuleStatementTestCase> dropRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-statistics")
    private final List<DropStatisticsStatementTestCase> dropStatisticsTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-publication")
    private final List<DropPublicationStatementTestCase> dropPublicationTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-subscription")
    private final List<DropSubscriptionStatementTestCase> dropSubscriptionTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-server")
    private final List<DropServerStatementTestCase> dropServerTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-trigger")
    private final List<DropTriggerStatementTestCase> dropTriggerTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-trigger")
    private final List<AlterTriggerStatementTestCase> alterTriggerTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-event-trigger")
    private final List<DropEventTriggerStatementTestCase> dropEventTriggerTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-domain")
    private final List<DropDomainStatementTestCase> dropDomainTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-triggers")
    private final List<ShowTriggersStatementTestCase> showTriggerTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-view")
    private final List<DropViewStatementTestCase> dropViewTestCases = new LinkedList<>();
    
    @XmlElement(name = "call")
    private final List<CallStatementTestCase> callProcedureTestCases = new LinkedList<>();
    
    @XmlElement(name = "do")
    private final List<DoStatementTestCase> doTestCases = new LinkedList<>();
    
    @XmlElement(name = "copy")
    private final List<CopyStatementTestCase> copyTestCases = new LinkedList<>();
    
    @XmlElement(name = "xa")
    private final List<XATestCase> xaTestCases = new LinkedList<>();
    
    @XmlElement(name = "merge")
    private final List<MergeStatementTestCase> mergeTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sequence")
    private final List<CreateSequenceStatementTestCase> createSequenceTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sequence")
    private final List<AlterSequenceStatementTestCase> alterSequenceTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-sequence")
    private final List<DropSequenceStatementTestCase> dropSequenceTestCases = new LinkedList<>();
    
    @XmlElement(name = "analyze")
    private final List<AnalyzeStatementTestCase> analyzeTestCases = new LinkedList<>();
    
    @XmlElement(name = "associate-statistics")
    private final List<AssociateStatisticsStatementTestCase> associateStatisticsTestCases = new LinkedList<>();
    
    @XmlElement(name = "disassociate-statistics")
    private final List<DisassociateStatisticsStatementTestCase> disassociateStatisticsTestCases = new LinkedList<>();
    
    @XmlElement(name = "audit")
    private final List<AuditStatementTestCase> auditTestCases = new LinkedList<>();
    
    @XmlElement(name = "no-audit")
    private final List<NoAuditStatementTestCase> noAuditTestCases = new LinkedList<>();
    
    @XmlElement(name = "comment")
    private final List<CommentStatementTestCase> commentTestCases = new LinkedList<>();
    
    @XmlElement(name = "flashback-database")
    private final List<FlashbackDatabaseStatementTestCase> flashbackDatabaseTestCases = new LinkedList<>();
    
    @XmlElement(name = "flashback-table")
    private final List<FlashbackTableStatementTestCase> flashbackTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "purge")
    private final List<PurgeStatementTestCase> purgeTestCases = new LinkedList<>();
    
    @XmlElement(name = "rename")
    private final List<RenameStatementTestCase> renameTestCases = new LinkedList<>();
    
    @XmlElement(name = "add-resource")
    private final List<AddResourceStatementTestCase> addResourceTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-resource")
    private final List<AlterResourceStatementTestCase> alterResourceTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-database-discovery-definition-rule")
    private final List<AlterDatabaseDiscoveryDefinitionRuleStatementTestCase> alterDatabaseDiscoveryDefinitionRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-database-discovery-construction-rule")
    private final List<AlterDatabaseDiscoveryConstructionRuleStatementTestCase> alterDataBaseDiscoveryConstructionRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-encrypt-rule")
    private final List<AlterEncryptRuleStatementTestCase> alterEncryptRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-readwrite-splitting-rule")
    private final List<AlterReadwriteSplittingRuleStatementTestCase> alterReadwriteSplittingRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sharding-binding-table-rules")
    private final List<AlterShardingBindingTableRulesStatementTestCase> alterShardingBindingTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sharding-broadcast-table-rules")
    private final List<AlterShardingBroadcastTableRulesStatementTestCase> alterShardingBroadcastTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sharding-auto-table-rule")
    private final List<AlterShardingAutoTableRuleStatementTestCase> alterShardingAutoTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sharding-table-rule")
    private final List<AlterShardingTableRuleStatementTestCase> alterShardingTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-database-discovery-definition-rule")
    private final List<CreateDatabaseDiscoveryDefinitionRuleStatementTestCase> createDatabaseDiscoveryDefinitionRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-database-discovery-construction-rule")
    private final List<CreateDatabaseDiscoveryConstructionRuleStatementTestCase> createDataBaseDiscoveryConstructionRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-database-discovery-type")
    private final List<CreateDatabaseDiscoveryTypeStatementTestCase> createDatabaseDiscoveryTypeTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-database-discovery-heartbeat")
    private final List<CreateDatabaseDiscoveryHeartbeatStatementTestCase> createDatabaseDiscoveryHeartbeatTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-database-discovery-heartbeat")
    private final List<AlterDatabaseDiscoveryHeartbeatStatementTestCase> alterDatabaseDiscoveryHeartbeatTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-database-discovery-type")
    private final List<AlterDatabaseDiscoveryTypeStatementTestCase> alterDatabaseDiscoveryTypeTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-encrypt-rule")
    private final List<CreateEncryptRuleStatementTestCase> createEncryptRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-readwrite-splitting-rule")
    private final List<CreateReadwriteSplittingRuleStatementTestCase> createReadwriteSplittingRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-binding-table-rule")
    private final List<CreateShardingBindingTableRulesStatementTestCase> createShardingBindingTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-broadcast-table-rule")
    private final List<CreateShardingBroadcastTableRulesStatementTestCase> createShardingBroadcastTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-auto-table-rule")
    private final List<CreateShardingAutoTableRuleStatementTestCase> createShardingAutoTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-table-rule")
    private final List<CreateShardingTableRuleStatementTestCase> createShardingTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-database-discovery-rule")
    private final List<DropDataBaseDiscoveryRuleStatementTestCase> dropDataBaseDiscoveryRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-database-discovery-type")
    private final List<DropDataBaseDiscoveryTypeStatementTestCase> dropDataBaseDiscoveryTypeTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-database-discovery-heartbeat")
    private final List<DropDataBaseDiscoveryHeartbeatStatementTestCase> dropDataBaseDiscoveryHeartbeatTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-encrypt-rule")
    private final List<DropEncryptRuleStatementTestCase> dropEncryptRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-readwrite-splitting-rule")
    private final List<DropReadwriteSplittingRuleStatementTestCase> dropReadwriteSplittingRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-resource")
    private final List<DropResourceStatementTestCase> dropResourceTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-sharding-binding-table-rules")
    private final List<DropShardingBindingTableRulesStatementTestCase> dropShardingBindingTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-sharding-broadcast-table-rules")
    private final List<DropShardingBroadcastTableRulesStatementTestCase> dropShardingBroadcastTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-sharding-table-rule")
    private final List<DropShardingTableRuleStatementTestCase> dropShardingTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-db-discovery-rules")
    private final List<ShowDataBaseDiscoveryRulesStatementTestCase> showDataBaseDiscoveryRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-encrypt-rules")
    private final List<ShowEncryptRulesStatementTestCase> showEncryptRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-readwrite-splitting-rules")
    private final List<ShowReadwriteSplittingRulesStatementTestCase> showReadwriteSplittingRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-binding-table-rules")
    private final List<ShowShardingBindingTableRulesStatementTestCase> showShardingBindingTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-broadcast-table-rules")
    private final List<ShowShardingBroadcastTableRulesStatementTestCase> showShardingBroadcastTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-algorithms")
    private final List<ShowShardingAlgorithmsStatementTestCase> showShardingAlgorithmsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-auditors")
    private final List<ShowShardingAuditorsStatementTestCase> showShardingAuditorsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-table-rules")
    private final List<ShowShardingTableRulesStatementTestCase> showShardingTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-table-rule")
    private final List<ShowShardingTableRulesStatementTestCase> showShardingTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-scaling-list")
    private final List<ShowScalingListStatementTestCase> showScalingListTestCases = new LinkedList<>();
    
    @XmlElement(name = "check-scaling")
    private final List<CheckScalingStatementTestCase> checkScalingTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-scaling-status")
    private final List<ShowScalingStatusStatementTestCase> showScalingStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-scaling-check-algorithms")
    private final List<ShowScalingCheckAlgorithmsStatementTestCase> showScalingCheckAlgorithmsTestCases = new LinkedList<>();
    
    @XmlElement(name = "stop-scaling-source-writing")
    private final List<StopScalingSourceWritingStatementTestCase> stopScalingSourceWritingTestCases = new LinkedList<>();
    
    @XmlElement(name = "restore-scaling-source-writing")
    private final List<RestoreScalingSourceWritingStatementTestCase> restoreScalingSourceWritingTestCases = new LinkedList<>();
    
    @XmlElement(name = "apply-scaling")
    private final List<ApplyScalingStatementTestCase> applyScalingTestCases = new LinkedList<>();
    
    @XmlElement(name = "reset-scaling")
    private final List<ResetScalingStatementTestCase> resetScalingTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-scaling")
    private final List<DropScalingStatementTestCase> dropScalingTestCases = new LinkedList<>();
    
    @XmlElement(name = "stop-scaling")
    private final List<StopScalingStatementTestCase> stopScalingTestCases = new LinkedList<>();
    
    @XmlElement(name = "start-scaling")
    private final List<StartScalingStatementTestCase> startScalingTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-scaling-rule")
    private final List<CreateShardingScalingRuleStatementTestCase> createShardingScalingRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-sharding-scaling-rule")
    private final List<DropShardingScalingRuleStatementTestCase> dropShardingScalingRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "enable-sharding-scaling-rule")
    private final List<EnableShardingScalingRuleStatementTestCase> enableShardingScalingRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "disable-sharding-scaling-rule")
    private final List<DisableShardingScalingRuleStatementTestCase> disableShardingScalingRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-scaling-rules")
    private final List<ShowShardingScalingRulesStatementTestCase> showShardingScalingRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "preview-sql")
    private final List<PreviewStatementTestCase> previewTestCases = new LinkedList<>();
    
    @XmlElement(name = "parse-sql")
    private final List<ParseStatementTestCase> parseStatementAsserts = new LinkedList<>();
    
    @XmlElement(name = "show-variable")
    private final List<ShowVariableStatementTestCase> showVariableTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-variable")
    private final List<SetVariableStatementTestCase> setVariableTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-readwrite-splitting-hint-source")
    private final List<SetReadwriteSplittingHintStatementTestCase> setReadwriteSplittingHintTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-sharding-hint-database-value")
    private final List<SetShardingHintDatabaseValueStatementTestCase> setShardingHintDatabaseValueTestCases = new LinkedList<>();
    
    @XmlElement(name = "add-sharding-hint-database-value")
    private final List<AddShardingHintDatabaseValueStatementTestCase> addShardingHintDatabaseValueTestCases = new LinkedList<>();
    
    @XmlElement(name = "add-sharding-hint-table-value")
    private final List<AddShardingHintTableValueStatementTestCase> addShardingHintTableValueTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-readwrite-splitting-hint-source")
    private final List<ShowReadwriteSplittingHintStatusStatementTestCase> showReadwriteSplittingHintStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-hint-status")
    private final List<ShowShardingHintStatusStatementTestCase> showShardingHintStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "clear-readwrite-splitting-hint-source")
    private final List<ClearReadwriteSplittingHintStatementTestCase> clearReadwriteSplittingHintTestCases = new LinkedList<>();
    
    @XmlElement(name = "clear-sharding-hint")
    private final List<ClearShardingHintStatementTestCase> clearShardingHintTestCases = new LinkedList<>();
    
    @XmlElement(name = "clear-hint")
    private final List<ClearHintStatementTestCase> clearHintTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-shadow-rule")
    private final List<CreateShadowRuleStatementTestCase> createShadowRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-shadow-rule")
    private final List<DropShadowRuleStatementTestCase> dropShadowRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-shadow-rule")
    private final List<AlterShadowRuleStatementTestCase> alterShadowRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-shadow-algorithm")
    private final List<AlterShadowAlgorithmStatementTestCase> alterShadowAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-shadow-algorithm")
    private final List<CreateShadowAlgorithmStatementTestCase> createShadowAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-shadow-rules")
    private final List<ShowShadowRulesStatementTestCase> showShadowRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-shadow-algorithms")
    private final List<ShowShadowAlgorithmsStatementTestCase> showShadowAlgorithmsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-shadow-table-rules")
    private final List<ShowShadowTableRulesStatementTestCase> showShadowTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-shadow-algorithm")
    private final List<DropShadowAlgorithmStatementTestCase> dropShadowAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-service")
    private final List<CreateServiceStatementTestCase> createServiceTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-service")
    private final List<AlterServiceStatementTestCase> alterServiceTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-service")
    private final List<DropServiceStatementTestCase> dropServiceTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-schema")
    private final List<CreateSchemaStatementTestCase> createSchemaTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-schema")
    private final List<AlterSchemaStatementTestCase> alterSchemaTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-schema")
    private final List<DropSchemaStatementTestCase> dropSchemaTestCases = new LinkedList<>();
    
    @XmlElement(name = "install-component")
    private final List<InstallComponentStatementTestCase> installComponentTestCases = new LinkedList<>();
    
    @XmlElement(name = "flush")
    private final List<FlushStatementTestCase> flushTestCases = new LinkedList<>();
    
    @XmlElement(name = "install-plugin")
    private final List<InstallPluginStatementTestCase> installPluginTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-instance")
    private final List<ShowInstanceStatementTestCase> showInstanceTestCases = new LinkedList<>();
    
    @XmlElement(name = "count-instance-rules")
    private final List<CountInstanceRulesStatementTestCase> countInstanceRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "clone")
    private final List<CloneStatementTestCase> cloneTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-readwrite-splitting-read-resources")
    private final List<ShowReadwriteSplittingReadResourcesStatementTestCase> showReadwriteSplittingReadResourcesTestCases = new LinkedList<>();
    
    @XmlElement(name = "uninstall-component")
    private final List<UninstallComponentStatementTestCase> uninstallComponentTestCases = new LinkedList<>();
    
    @XmlElement(name = "uninstall-plugin")
    private final List<UninstallPluginStatementTestCase> uninstallPluginTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-single-table")
    private final List<ShowSingleTableStatementTestCase> showSingleTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-single-table-rules")
    private final List<ShowSingleTableRulesStatementTestCase> showSingleTableRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-table-nodes")
    private final List<ShowShardingTableNodesStatementTestCase> showShardingTableNodesTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-resource-group")
    private final List<SetResourceGroupStatementTestCase> setResourceGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "optimize-table")
    private final List<OptimizeTableStatementTestCase> optimizeTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "repair-table")
    private final List<RepairTableStatementTestCase> repairTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-algorithm")
    private final List<CreateShardingAlgorithmStatementTestCase> createShardingAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-key-generator")
    private final List<CreateShardingKeyGeneratorStatementTestCase> createShardingKeyGeneratorTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-sharding-auditor")
    private final List<CreateShardingAuditorStatementTestCase> createShardingAuditorTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-default-sharding-strategy")
    private final List<CreateDefaultShardingStrategyStatementTestCase> createDefaultShardingStrategyTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-default-sharding-strategy")
    private final List<AlterDefaultShardingStrategyStatementTestCase> alterDefaultShardingStrategyTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-default-shadow-algorithm")
    private final List<CreateDefaultShadowAlgorithmStatementTestCase> createDefaultShadowAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-replicas")
    private final List<ShowReplicasStatementTestCase> showReplicasTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-replica-status")
    private final List<ShowReplicaStatusStatementTestCase> showReplicaStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-slave-status")
    private final List<ShowSlaveStatusStatementTestCase> showSlaveStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sharding-algorithm")
    private final List<AlterShardingAlgorithmStatementTestCase> alterShardingAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sharding-key-generator")
    private final List<AlterShardingKeyGeneratorStatementTestCase> alterShardingKeyGeneratorTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-sharding-key-generator")
    private final List<DropShardingKeyGeneratorStatementTestCase> dropShardingKeyGeneratorTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-default-sharding-strategy")
    private final List<DropDefaultShardingStrategyStatementTestCase> dropDefaultShardingStrategyTestCases = new LinkedList<>();
    
    @XmlElement(name = "reset")
    private final List<ResetStatementTestCase> resetTestCases = new LinkedList<>();
    
    @XmlElement(name = "reset-persist")
    private final List<ResetPersistStatementTestCase> resetPersistTestCases = new LinkedList<>();
    
    @XmlElement(name = "cache-index")
    private final List<CacheIndexStatementTestCase> cacheIndexTestCases = new LinkedList<>();
    
    @XmlElement(name = "load-index")
    private final List<LoadIndexInfoStatementTestCase> loadIndexInfoTestCases = new LinkedList<>();
    
    @XmlElement(name = "kill")
    private final List<KillStatementTestCase> killTestCases = new LinkedList<>();
    
    @XmlElement(name = "shutdown")
    private final List<ShutdownStatementTestCase> shutdownTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-default-single-table")
    private final List<CreateDefaultSingleTableRuleStatementTestCase> createDefaultSingleTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-default-single-table")
    private final List<AlterDefaultSingleTableRuleStatementTestCase> alterDefaultSingleTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-default-single-table")
    private final List<DropDefaultSingleTableRuleStatementTestCase> dropDefaultSingleTableRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-open-tables")
    private final List<ShowOpenTablesStatementTestCase> showOpenTablesTestCases = new LinkedList<>();
    
    @XmlElement(name = "check-table")
    private final List<CheckTableStatementTestCase> checkTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "checksum-table")
    private final List<ChecksumTableStatementTestCase> checksumTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-status")
    private final List<ShowStatusStatementTestCase> showStatusTestCases = new LinkedList<>();
    
    @XmlElement(name = "refresh-table-metadata")
    private final List<RefreshTableMetadataStatementTestCase> refreshTableMetadataTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-events")
    private final List<ShowEventsStatementTestCase> showEventsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-character-set")
    private final List<ShowCharacterSetStatementTestCase> showCharacterSetTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-collation")
    private final List<ShowCollationStatementTestCase> showCollationTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-variables")
    private final List<ShowVariablesStatementTestCase> showVariablesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-key-generators")
    private final List<ShowShardingKeyGeneratorsStatementTestCase> showShardingKeyGeneratorsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-default-sharding-strategy")
    private final List<ShowDefaultShardingStrategyStatementTestCase> showDefaultShardingStrategyTestCases = new LinkedList<>();
    
    @XmlElement(name = "delimiter")
    private final List<DelimiterStatementTestCase> delimiterTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sql-parser-rule")
    private final List<ShowSQLParserRuleStatementTestCase> showSQLParserRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-authority-rule")
    private final List<ShowAuthorityRuleStatementTestCase> showAuthorityRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-transaction-rule")
    private final List<ShowTransactionRuleStatementTestCase> showTransactionRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-traffic-rules")
    private final List<ShowTrafficRulesStatementTestCase> showTrafficRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-traffic-rule")
    private final List<CreateTrafficRuleStatementTestCase> createTrafficRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-traffic-rule")
    private final List<AlterTrafficRuleStatementTestCase> alterTrafficRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-sql-parser-rule")
    private final List<AlterSQLParserRuleStatementTestCase> alterSQLParserRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-traffic-rule")
    private final List<DropTrafficRuleStatementTestCase> dropTrafficRuleTestCases = new LinkedList<>();
    
    @XmlElement(name = "label-instance")
    private final List<LabelInstanceStatementTestCase> labelTestCases = new LinkedList<>();
    
    @XmlElement(name = "unlabel-instance")
    private final List<UnlabelInstanceStatementTestCase> unlabelTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-instance")
    private final List<AlterInstanceStatementTestCase> alterInstanceTestCases = new LinkedList<>();
    
    @XmlElement(name = "prepare-distsql")
    private final List<PrepareDistSQLStatementTestCase> prepareDistSQLTestCases = new LinkedList<>();
    
    @XmlElement(name = "apply-distsql")
    private final List<ApplyDistSQLStatementTestCase> applyDistSQLTestCases = new LinkedList<>();
    
    @XmlElement(name = "discard-distsql")
    private final List<DiscardDistSQLStatementTestCase> discardDistSQLTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-table-metadata")
    private final List<ShowTableMetadataStatementTestCase> showTableMetadataTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-conversion")
    private final List<CreateConversionStatementTestCase> createConversionTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-cast")
    private final List<CreateCastStatementTestCase> createCastTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-conversion")
    private final List<DropConversionStatementTestCase> dropConversionTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-domain")
    private final List<AlterDomainStatementTestCase> alterDomainTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-aggregate")
    private final List<AlterAggregateStatementTestCase> alterAggregateTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-conversion")
    private final List<AlterConversionStatementTestCase> alterConversionTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-collation")
    private final List<AlterCollationStatementTestCase> alterCollationTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-default-privileges")
    private final List<AlterDefaultPrivilegesTestCase> alterDefaultPrivilegesTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-foreign-data-wrapper")
    private final List<AlterForeignDataWrapperTestCase> alterForeignDataWrapperTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-foreign-table")
    private final List<AlterForeignTableTestCase> alterForeignTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-foreign-table")
    private final List<DropForeignTableStatementTestCase> dropForeignTableTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-group")
    private final List<AlterGroupStatementTestCase> alterGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-materialized-view")
    private final List<AlterMaterializedViewStatementTestCase> alterMaterializedViewTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-operator")
    private final List<AlterOperatorStatementTestCase> alterOperatorTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-text-search")
    private final List<CreateTextSearchStatementTestCase> createTextSearchTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-text-search")
    private final List<AlterTextSearchStatementTestCase> alterTextSearchTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-language")
    private final List<CreateLanguageStatementTestCase> createLanguageTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-language")
    private final List<AlterLanguageStatementTestCase> alterLanguageTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-language")
    private final List<DropLanguageStatementTestCase> dropLanguageTestCases = new LinkedList<>();
    
    @XmlElement(name = "help")
    private final List<HelpStatementTestCase> helpTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-unused-sharding-algorithms")
    private final List<ShowUnusedShardingAlgorithmsStatementTestCase> showUnusedShardingAlgorithmsTestCases = new LinkedList<>();
    
    @XmlElement(name = "count-database-rules")
    private final List<CountDatabaseRulesStatementTestCase> countDatabaseRulesTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-unused-sharding-key-generators")
    private final List<ShowUnusedShardingKeyGeneratorsStatementTestCase> showUnusedShardingKeyGeneratorsTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-binlog-events")
    private final List<ShowBinlogEventsStatementTestCase> showBinlogEventsTestCases = new LinkedList<>();
    
    @XmlElement(name = "listen")
    private final List<ListenStatementTestCase> listenTestCases = new LinkedList<>();
    
    @XmlElement(name = "notify")
    private final List<NotifyStmtStatementTestCase> notifyTestCases = new LinkedList<>();
    
    @XmlElement(name = "refresh-materialized-view")
    private final List<RefreshMatViewStmtStatementTestCase> refreshMatViewStmtStatementTestCases = new LinkedList<>();
    
    @XmlElement(name = "unlisten")
    private final List<UnlistenStatementTestCase> unlistenTestCases = new LinkedList<>();
    
    @XmlElement(name = "lock")
    private final List<LockStatementTestCase> lockTestCases = new LinkedList<>();
    
    @XmlElement(name = "unlock")
    private final List<UnlockStatementTestCase> unlockTestCases = new LinkedList<>();
    
    @XmlElement(name = "export-database-config")
    private final List<ExportDatabaseConfigurationStatementTestCase> exportDatabaseConfigurationTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-rules-used-resource")
    private final List<ShowRulesUsedResourceStatementTestCase> showRulesUsedResourceTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-table-rules-used-algorithm")
    private final List<ShowShardingTableRulesUsedAlgorithmStatementTestCase> showShardingTableRulesUsedAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "show-sharding-table-rules-used-key-generator")
    private final List<ShowShardingTableRulesUsedKeyGeneratorStatementTestCase> showShardingTableRulesUsedKeyGeneratorTestCases = new LinkedList<>();
    
    @XmlElement(name = "prepared")
    private final List<PreparedStatementTestCase> preparedTestCases = new LinkedList<>();
    
    @XmlElement(name = "set-user")
    private final List<SetUserStatementTestCase> setUserTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-sharding-algorithm")
    private final List<DropShardingAlgorithmStatementTestCase> dropShardingAlgorithmTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-owned")
    private final List<DropOwnedStatementTestCase> dropOwnedTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-tablespace")
    private final List<CreateTablespaceStatementTestCase> createTablespaceTestCases = new LinkedList<>();
    
    @XmlElement(name = "import-database-config")
    private final List<ImportDatabaseConfigurationStatementTestCase> importDatabaseConfigurationTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-operator")
    private final List<DropOperatorStatementTestCase> dropOperatorTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-materialized-view")
    private final List<DropMaterializedViewStatementTestCase> dropMaterializedViewTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-cast")
    private final List<DropCastStatementTestCase> dropCastTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-aggregate")
    private final List<DropAggregateStatementTestCase> dropAggregateTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-collation")
    private final List<DropCollationStatementTestCase> dropCollationTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-foreign-data-wrapper")
    private final List<DropForeignDataWrapperStatementTestCase> dropForeignDataWrapperTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-type")
    private final List<DropTypeStatementTestCase> dropTypeTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-operator-class")
    private final List<DropOperatorClassStatementTestCase> dropOperatorClassTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-operator-family")
    private final List<DropOperatorFamilyStatementTestCase> dropOperatorFamilyTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-access-method")
    private final List<DropAccessMethodStatementTestCase> dropAccessMethodTestCases = new LinkedList<>();
    
    @XmlElement(name = "revert")
    private final List<RevertStatementTestCase> revertTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-analytic-view")
    private final List<AlterAnalyticViewStatementTestCase> alterAnalyticViewTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-attribute-dimension")
    private final List<AlterAttributeDimensionStatementTestCase> alterAttributeDimensionTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-context")
    private final List<CreateContextStatementTestCase> createContextTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-spfile")
    private final List<CreateSPFileStatementTestCase> createSPFileTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-pfile")
    private final List<CreatePFileStatementTestCase> createPFileTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-control-file")
    private final List<CreateControlFileStatementTestCase> createControlFileTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-flashback-archive")
    private final List<CreateFlashbackArchiveStatementTestCase> createFlashbackArchiveTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-flashback-archive")
    private final List<AlterFlashbackArchiveStatementTestCase> alterFlashbackArchiveTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-flashback-archive")
    private final List<DropFlashbackArchiveStatementTestCase> dropFlashbackArchiveTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-diskgroup")
    private final List<CreateDiskgroupStatementTestCase> createDiskgroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-diskgroup")
    private final List<DropDiskgroupStatementTestCase> dropDiskgroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-rollback-segment")
    private final List<CreateRollbackSegmentStatementTestCase> createRollbackSegmentTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-rollback-segment")
    private final List<DropRollbackSegmentStatementTestCase> dropRollbackSegmentTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-lockdown-profile")
    private final List<CreateLockdownProfileStatementTestCase> createLockdownProfileTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-lockdown-profile")
    private final List<DropLockdownProfileStatementTestCase> dropLockdownProfileTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-inmemory-join-group")
    private final List<CreateInmemoryJoinGroupStatementTestCase> createInmemoryJoinGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-inmemory-join-group")
    private final List<AlterInmemoryJoinGroupStatementTestCase> alterInmemoryJoinGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-inmemory-join-group")
    private final List<DropInmemoryJoinGroupStatementTestCase> dropInmemoryJoinGroupTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-restore-point")
    private final List<CreateRestorePointStatementTestCase> createRestorePointTestCases = new LinkedList<>();
    
    @XmlElement(name = "drop-restore-point")
    private final List<DropRestorePointStatementTestCase> dropRestorePointTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-library")
    private final List<AlterLibraryStatementTestCase> alterLibraryTestCases = new LinkedList<>();
    
    @XmlElement(name = "alter-materialized-zonemap")
    private final List<AlterMaterializedZonemapStatementTestCase> alterMaterializedZonemapTestCases = new LinkedList<>();
    
    @XmlElement(name = "cursor")
    private final List<CursorStatementTestCase> cursorTestCases = new LinkedList<>();
    
    @XmlElement(name = "close")
    private final List<CloseStatementTestCase> closeTestCases = new LinkedList<>();
    
    @XmlElement(name = "move")
    private final List<MoveStatementTestCase> moveTestCases = new LinkedList<>();
    
    @XmlElement(name = "fetch")
    private final List<FetchStatementTestCase> fetchTestCases = new LinkedList<>();
    
    @XmlElement(name = "checkpoint")
    private final List<CheckpointStatementTestCase> checkpointTestCases = new LinkedList<>();
    
    @XmlElement(name = "cluster")
    private final List<ClusterStatementTestCase> clusterStatementTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-access-method")
    private final List<CreateAccessMethodStatementTestCase> createAccessMethodTestCases = new LinkedList<>();
    
    @XmlElement(name = "create-collation")
    private final List<CreateCollationStatementTestCase> createCollationStatementTestCases = new LinkedList<>();
    
    @XmlElement(name = "prepare-transaction")
    private final List<PrepareTransactionTestCase> prepareTransactionTestCases = new LinkedList<>();
    
    @XmlElement(name = "reassign-owned")
    private final List<ReassignOwnedStatementTestCase> reassignOwnedStatementTestCases = new LinkedList<>();
    
    /**
     * Get all SQL parser test cases.
     *
     * @return all SQL parser test cases
     */
    // CHECKSTYLE:OFF
    public Map<String, SQLParserTestCase> getAllSQLParserTestCases() {
        Map<String, SQLParserTestCase> result = new HashMap<>();
        putAll(selectTestCases, result);
        putAll(updateTestCases, result);
        putAll(deleteTestCases, result);
        putAll(insertTestCases, result);
        putAll(createTableTestCases, result);
        putAll(createEditionTestCases, result);
        putAll(alterTableTestCases, result);
        putAll(dropTableTestCases, result);
        putAll(dropTextSearchTestCases, result);
        putAll(truncateTestCases, result);
        putAll(dropEditionTestCases, result);
        putAll(dropOutlineTestCases, result);
        putAll(alterOutlineTestCases, result);
        putAll(createIndexTestCases, result);
        putAll(alterIndexTestCases, result);
        putAll(dropIndexTestCases, result);
        putAll(setConstraintsTestCases, result);
        putAll(setTransactionTestCases, result);
        putAll(beginTransactionTestCases, result);
        putAll(setAutoCommitTestCases, result);
        putAll(commitTestCases, result);
        putAll(rollbackTestCases, result);
        putAll(savepointTestCases, result);
        putAll(grantTestCases, result);
        putAll(revokeTestCases, result);
        putAll(createUserTestCases, result);
        putAll(alterUserTestCases, result);
        putAll(dropUserTestCases, result);
        putAll(renameUserTestCases, result);
        putAll(denyUserTestCases, result);
        putAll(createLoginTestCases, result);
        putAll(alterLoginTestCases, result);
        putAll(dropLoginTestCases, result);
        putAll(createRoleTestCases, result);
        putAll(alterRoleTestCases, result);
        putAll(dropRoleTestCases, result);
        putAll(setDefaultRoleTestCases, result);
        putAll(setRoleTestCases, result);
        putAll(setPasswordTestCases, result);
        putAll(useTestCases, result);
        putAll(describeTestCases, result);
        putAll(showDatabasesTestCases, result);
        putAll(showTablesTestCases, result);
        putAll(showFunctionStatusTestCases, result);
        putAll(showProcedureStatusTestCases, result);
        putAll(showRelaylogEventsTestCases, result);
        putAll(showSlaveHostsTestCases, result);
        putAll(showProcedureCodeTestCases, result);
        putAll(showColumnsTestCases, result);
        putAll(showCreateTableTestCases, result);
        putAll(showCreateTriggerTestCases, result);
        putAll(showCreateUserTestCases, result);
        putAll(showTableStatusTestCases, result);
        putAll(showIndexTestCases, result);
        putAll(showTestCases, result);
        putAll(setParameterTestCases, result);
        putAll(commonTestCases, result);
        putAll(alterFunctionTestCases, result);
        putAll(alterServerTestCases, result);
        putAll(alterSessionTestCases, result);
        putAll(alterSynonymTestCases, result);
        putAll(alterTypeTestCases, result);
        putAll(alterRuleTestCases, result);
        putAll(alterRoutineTestCases, result);
        putAll(alterDirectoryTestCases, result);
        putAll(alterSystemTestCases, result);
        putAll(alterProcedureTestCases, result);
        putAll(alterPublicationTestCases, result);
        putAll(alterPolicyTestCases, result);
        putAll(alterDatabaseTestCases, result);
        putAll(alterDimensionTestCases, result);
        putAll(createViewTestCases, result);
        putAll(createSynonymTestCases, result);
        putAll(createAggregateTestCases, result);
        putAll(createPublicationTestCases, result);
        putAll(dropSynonymTestCases, result);
        putAll(createDirectoryTestCases, result);
        putAll(createTriggerTestCases, result);
        putAll(createServerTestCases, result);
        putAll(createProcedureTestCases, result);
        putAll(createFunctionTestCases, result);
        putAll(createDatabaseTestCases, result);
        putAll(createDatabaseLinkTestCases, result);
        putAll(dropDatabaseLinkTestCases, result);
        putAll(alterDatabaseDictionaryTestCases, result);
        putAll(alterDatabaseLinkTestCases, result);
        putAll(alterViewTestCases, result);
        putAll(alterPackageTestCases, result);
        putAll(dropPackageTestCases, result);
        putAll(createDimensionTestCases, result);
        putAll(dropDimensionTestCases, result);
        putAll(dropDirectoryTestCases, result);
        putAll(dropViewTestCases, result);
        putAll(dropTriggerTestCases, result);
        putAll(alterTriggerTestCases, result);
        putAll(dropEventTriggerTestCases, result);
        putAll(showTriggerTestCases, result);
        putAll(dropServerTestCases, result);
        putAll(dropPolicyTestCases, result);
        putAll(dropProcedureTestCases, result);
        putAll(dropRoutineTestCases, result);
        putAll(dropRuleTestCases, result);
        putAll(dropStatisticsTestCases, result);
        putAll(dropPublicationTestCases, result);
        putAll(dropSubscriptionTestCases, result);
        putAll(dropFunctionTestCases, result);
        putAll(dropGroupTestCases, result);
        putAll(dropDatabaseTestCases, result);
        putAll(callProcedureTestCases, result);
        putAll(doTestCases, result);
        putAll(copyTestCases, result);
        putAll(xaTestCases, result);
        putAll(mergeTestCases, result);
        putAll(createSequenceTestCases, result);
        putAll(alterSequenceTestCases, result);
        putAll(dropSequenceTestCases, result);
        putAll(analyzeTestCases, result);
        putAll(associateStatisticsTestCases, result);
        putAll(disassociateStatisticsTestCases, result);
        putAll(auditTestCases, result);
        putAll(noAuditTestCases, result);
        putAll(commentTestCases, result);
        putAll(flashbackDatabaseTestCases, result);
        putAll(flashbackTableTestCases, result);
        putAll(purgeTestCases, result);
        putAll(renameTestCases, result);
        putAll(addResourceTestCases, result);
        putAll(alterResourceTestCases, result);
        putAll(alterDatabaseDiscoveryDefinitionRuleTestCases, result);
        putAll(alterDataBaseDiscoveryConstructionRuleTestCases, result);
        putAll(alterEncryptRuleTestCases, result);
        putAll(alterReadwriteSplittingRuleTestCases, result);
        putAll(alterShardingBindingTableRulesTestCases, result);
        putAll(alterShardingBroadcastTableRulesTestCases, result);
        putAll(alterShardingAutoTableRuleTestCases, result);
        putAll(createDatabaseDiscoveryDefinitionRuleTestCases, result);
        putAll(createDataBaseDiscoveryConstructionRuleTestCases, result);
        putAll(createDatabaseDiscoveryTypeTestCases, result);
        putAll(createDatabaseDiscoveryHeartbeatTestCases, result);
        putAll(alterDatabaseDiscoveryHeartbeatTestCases, result);
        putAll(alterDatabaseDiscoveryTypeTestCases, result);
        putAll(createEncryptRuleTestCases, result);
        putAll(createReadwriteSplittingRuleTestCases, result);
        putAll(createShardingBindingTableRulesTestCases, result);
        putAll(createShardingBroadcastTableRulesTestCases, result);
        putAll(createShardingAutoTableRuleTestCases, result);
        putAll(dropDataBaseDiscoveryRuleTestCases, result);
        putAll(dropDataBaseDiscoveryTypeTestCases, result);
        putAll(dropDataBaseDiscoveryHeartbeatTestCases, result);
        putAll(dropResourceTestCases, result);
        putAll(dropEncryptRuleTestCases, result);
        putAll(dropReadwriteSplittingRuleTestCases, result);
        putAll(dropShardingBindingTableRulesTestCases, result);
        putAll(dropShardingBroadcastTableRulesTestCases, result);
        putAll(dropShardingTableRuleTestCases, result);
        putAll(showDataBaseDiscoveryRulesTestCases, result);
        putAll(showEncryptRulesTestCases, result);
        putAll(showReadwriteSplittingRulesTestCases, result);
        putAll(showShardingBindingTableRulesTestCases, result);
        putAll(showShardingBroadcastTableRulesTestCases, result);
        putAll(showShardingAlgorithmsTestCases, result);
        putAll(showShardingAuditorsTestCases, result);
        putAll(showShardingTableRulesTestCases, result);
        putAll(showShardingTableRuleTestCases, result);
        putAll(showScalingListTestCases, result);
        putAll(checkScalingTestCases, result);
        putAll(showScalingStatusTestCases, result);
        putAll(showScalingCheckAlgorithmsTestCases, result);
        putAll(stopScalingSourceWritingTestCases, result);
        putAll(restoreScalingSourceWritingTestCases, result);
        putAll(applyScalingTestCases, result);
        putAll(resetScalingTestCases, result);
        putAll(dropScalingTestCases, result);
        putAll(stopScalingTestCases, result);
        putAll(startScalingTestCases, result);
        putAll(createShardingScalingRuleTestCases, result);
        putAll(dropShardingScalingRuleTestCases, result);
        putAll(enableShardingScalingRuleTestCases, result);
        putAll(disableShardingScalingRuleTestCases, result);
        putAll(showShardingScalingRulesTestCases, result);
        putAll(showVariableTestCases, result);
        putAll(setVariableTestCases, result);
        putAll(previewTestCases, result);
        putAll(parseStatementAsserts, result);
        putAll(setReadwriteSplittingHintTestCases, result);
        putAll(setShardingHintDatabaseValueTestCases, result);
        putAll(addShardingHintDatabaseValueTestCases, result);
        putAll(addShardingHintTableValueTestCases, result);
        putAll(showReadwriteSplittingHintStatusTestCases, result);
        putAll(showShardingHintStatusTestCases, result);
        putAll(clearReadwriteSplittingHintTestCases, result);
        putAll(clearShardingHintTestCases, result);
        putAll(clearHintTestCases, result);
        putAll(createShadowRuleTestCases, result);
        putAll(dropShadowRuleTestCases, result);
        putAll(alterShadowRuleTestCases, result);
        putAll(alterShadowAlgorithmTestCases, result);
        putAll(showShadowRulesTestCases, result);
        putAll(showShadowTableRulesTestCases, result);
        putAll(showShadowAlgorithmsTestCases, result);
        putAll(dropShadowAlgorithmTestCases, result);
        putAll(createServiceTestCases, result);
        putAll(alterServiceTestCases, result);
        putAll(dropServiceTestCases, result);
        putAll(createSchemaTestCases, result);
        putAll(alterSchemaTestCases, result);
        putAll(dropSchemaTestCases, result);
        putAll(installComponentTestCases, result);
        putAll(flushTestCases, result);
        putAll(installPluginTestCases, result);
        putAll(showInstanceTestCases, result);
        putAll(countInstanceRulesTestCases, result);
        putAll(cloneTestCases, result);
        putAll(showReadwriteSplittingReadResourcesTestCases, result);
        putAll(uninstallComponentTestCases, result);
        putAll(alterResourceGroupTestCases, result);
        putAll(createResourceGroupTestCases, result);
        putAll(dropResourceGroupTestCases, result);
        putAll(binlogTestCases, result);
        putAll(uninstallPluginTestCases, result);
        putAll(showSingleTableTestCases, result);
        putAll(showSingleTableRulesTestCases, result);
        putAll(showShardingTableNodesTestCases, result);
        putAll(setResourceGroupTestCases, result);
        putAll(optimizeTableTestCases, result);
        putAll(repairTableTestCases, result);
        putAll(createShardingAlgorithmTestCases, result);
        putAll(createShardingKeyGeneratorTestCases, result);
        putAll(createShardingAuditorTestCases, result);
        putAll(createDefaultShardingStrategyTestCases, result);
        putAll(alterDefaultShardingStrategyTestCases, result);
        putAll(createShardingTableRuleTestCases, result);
        putAll(alterShardingTableRuleTestCases, result);
        putAll(resetTestCases, result);
        putAll(resetPersistTestCases, result);
        putAll(showReplicasTestCases, result);
        putAll(showReplicaStatusTestCases, result);
        putAll(showSlaveStatusTestCases, result);
        putAll(alterShardingAlgorithmTestCases, result);
        putAll(alterShardingKeyGeneratorTestCases, result);
        putAll(killTestCases, result);
        putAll(createDefaultShadowAlgorithmTestCases, result);
        putAll(cacheIndexTestCases, result);
        putAll(loadIndexInfoTestCases, result);
        putAll(createShadowAlgorithmTestCases, result);
        putAll(createDefaultSingleTableRuleTestCases, result);
        putAll(alterDefaultSingleTableRuleTestCases, result);
        putAll(dropDefaultSingleTableRuleTestCases, result);
        putAll(shutdownTestCases, result);
        putAll(showOpenTablesTestCases, result);
        putAll(showStatusTestCases, result);
        putAll(checkTableTestCases, result);
        putAll(checksumTableTestCases, result);
        putAll(refreshTableMetadataTestCases, result);
        putAll(showEventsTestCases, result);
        putAll(showCharacterSetTestCases, result);
        putAll(showCollationTestCases, result);
        putAll(showVariablesTestCases, result);
        putAll(showShardingKeyGeneratorsTestCases, result);
        putAll(showDefaultShardingStrategyTestCases, result);
        putAll(dropShardingKeyGeneratorTestCases, result);
        putAll(dropDefaultShardingStrategyTestCases, result);
        putAll(delimiterTestCases, result);
        putAll(dropDomainTestCases, result);
        putAll(showSQLParserRuleTestCases, result);
        putAll(createDomainTestCases, result);
        putAll(createRuleTestCases, result);
        putAll(showAuthorityRuleTestCases, result);
        putAll(showTransactionRuleTestCases, result);
        putAll(showTrafficRulesTestCases, result);
        putAll(createTrafficRulesTestCases, result);
        putAll(alterTrafficRulesTestCases, result);
        putAll(alterSQLParserRuleTestCases, result);
        putAll(createTypeTestCases, result);
        putAll(createConversionTestCases, result);
        putAll(createCastTestCases, result);
        putAll(dropConversionTestCases, result);
        putAll(alterDomainTestCases, result);
        putAll(alterAggregateTestCases, result);
        putAll(alterConversionTestCases, result);
        putAll(alterCollationTestCases, result);
        putAll(alterDefaultPrivilegesTestCases, result);
        putAll(alterForeignDataWrapperTestCases, result);
        putAll(alterForeignTableTestCases, result);
        putAll(dropForeignTableTestCases, result);
        putAll(alterGroupTestCases, result);
        putAll(alterMaterializedViewTestCases, result);
        putAll(alterOperatorTestCases, result);
        putAll(createTextSearchTestCases, result);
        putAll(alterTextSearchTestCases, result);
        putAll(createLanguageTestCases, result);
        putAll(alterLanguageTestCases, result);
        putAll(dropLanguageTestCases, result);
        putAll(showTableMetadataTestCases, result);
        putAll(dropTrafficRuleTestCases, result);
        putAll(labelTestCases, result);
        putAll(unlabelTestCases, result);
        putAll(alterInstanceTestCases, result);
        putAll(prepareDistSQLTestCases, result);
        putAll(applyDistSQLTestCases, result);
        putAll(discardDistSQLTestCases, result);
        putAll(helpTestCases, result);
        putAll(showUnusedShardingAlgorithmsTestCases, result);
        putAll(showUnusedShardingKeyGeneratorsTestCases, result);
        putAll(renameTableTestCases, result);
        putAll(showBinlogEventsTestCases, result);
        putAll(createExtensionTestCases, result);
        putAll(countDatabaseRulesTestCases, result);
        putAll(alterExtensionTestCases, result);
        putAll(dropExtensionTestCases, result);
        putAll(declareTestCases, result);
        putAll(discardTestCases, result);
        putAll(lockTestCases, result);
        putAll(unlockTestCases, result);
        putAll(exportDatabaseConfigurationTestCases, result);
        putAll(showRulesUsedResourceTestCases, result);
        putAll(preparedTestCases, result);
        putAll(showShardingTableRulesUsedAlgorithmTestCases, result);
        putAll(showShardingTableRulesUsedKeyGeneratorTestCases, result);
        putAll(setUserTestCases, result);
        putAll(dropShardingAlgorithmTestCases, result);
        putAll(createTablespaceTestCases, result);
        putAll(importDatabaseConfigurationTestCases, result);
        putAll(dropOwnedTestCases, result);
        putAll(dropOperatorTestCases, result);
        putAll(dropMaterializedViewTestCases, result);
        putAll(dropCastTestCases, result);
        putAll(dropAggregateTestCases, result);
        putAll(dropCollationTestCases, result);
        putAll(dropForeignDataWrapperTestCases, result);
        putAll(dropTypeTestCases, result);
        putAll(dropOperatorClassTestCases, result);
        putAll(dropOperatorFamilyTestCases, result);
        putAll(dropAccessMethodTestCases, result);
        putAll(revertTestCases, result);
        putAll(alterAnalyticViewTestCases, result);
        putAll(alterAttributeDimensionTestCases, result);
        putAll(createContextTestCases, result);
        putAll(createSPFileTestCases, result);
        putAll(createPFileTestCases, result);
        putAll(createControlFileTestCases, result);
        putAll(createFlashbackArchiveTestCases, result);
        putAll(alterFlashbackArchiveTestCases, result);
        putAll(dropFlashbackArchiveTestCases, result);
        putAll(createDiskgroupTestCases, result);
        putAll(dropDiskgroupTestCases, result);
        putAll(createRollbackSegmentTestCases, result);
        putAll(dropRollbackSegmentTestCases, result);
        putAll(listenTestCases, result);
        putAll(notifyTestCases, result);
        putAll(refreshMatViewStmtStatementTestCases, result);
        putAll(unlistenTestCases, result);
        putAll(createLockdownProfileTestCases, result);
        putAll(dropLockdownProfileTestCases, result);
        putAll(createInmemoryJoinGroupTestCases, result);
        putAll(alterInmemoryJoinGroupTestCases, result);
        putAll(dropInmemoryJoinGroupTestCases, result);
        putAll(createRestorePointTestCases, result);
        putAll(dropRestorePointTestCases, result);
        putAll(alterLibraryTestCases, result);
        putAll(alterMaterializedZonemapTestCases, result);
        putAll(cursorTestCases, result);
        putAll(closeTestCases, result);
        putAll(moveTestCases, result);
        putAll(fetchTestCases, result);
        putAll(checkpointTestCases, result);
        putAll(clusterStatementTestCases, result);
        putAll(createAccessMethodTestCases, result);
        putAll(createCollationStatementTestCases, result);
        putAll(prepareTransactionTestCases, result);
        putAll(reassignOwnedStatementTestCases, result);
        return result;
    }
    // CHECKSTYLE:ON
    
    private void putAll(final List<? extends SQLParserTestCase> sqlParserTestCases, final Map<String, SQLParserTestCase> target) {
        Map<String, SQLParserTestCase> sqlParserTestCaseMap = getSQLParserTestCases(sqlParserTestCases);
        Collection<String> sqlParserTestCaseIds = new HashSet<>(sqlParserTestCaseMap.keySet());
        sqlParserTestCaseIds.retainAll(target.keySet());
        Preconditions.checkState(sqlParserTestCaseIds.isEmpty(), "Find duplicated SQL Case IDs: %s", sqlParserTestCaseIds);
        target.putAll(sqlParserTestCaseMap);
    }
    
    private Map<String, SQLParserTestCase> getSQLParserTestCases(final List<? extends SQLParserTestCase> sqlParserTestCases) {
        Map<String, SQLParserTestCase> result = new HashMap<>(sqlParserTestCases.size(), 1);
        for (SQLParserTestCase each : sqlParserTestCases) {
            Preconditions.checkState(!result.containsKey(each.getSqlCaseId()), "Find duplicated SQL Case ID: %s", each.getSqlCaseId());
            result.put(each.getSqlCaseId(), each);
        }
        return result;
    }
}
