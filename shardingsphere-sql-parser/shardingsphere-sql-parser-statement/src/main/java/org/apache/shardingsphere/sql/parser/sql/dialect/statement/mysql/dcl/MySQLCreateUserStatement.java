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

package org.apache.shardingsphere.sql.parser.sql.dialect.statement.mysql.dcl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.shardingsphere.sql.parser.sql.common.statement.dcl.CreateUserStatement;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.mysql.MySQLStatement;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.mysql.segment.PasswordOrLockOptionSegment;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.mysql.segment.TLSOptionSegment;
import org.apache.shardingsphere.sql.parser.sql.dialect.statement.mysql.segment.UserResourceSegment;

import java.util.Collection;
import java.util.LinkedList;

/**
 * MySQL create user statement.
 */
@ToString
@Getter
@Setter
public final class MySQLCreateUserStatement extends CreateUserStatement implements MySQLStatement {
    
    private final Collection<String> defaultRoles = new LinkedList<>();
    
    private TLSOptionSegment tlsOptionSegment;
    
    private UserResourceSegment userResource;
    
    private PasswordOrLockOptionSegment passwordOrLockOption;
}
