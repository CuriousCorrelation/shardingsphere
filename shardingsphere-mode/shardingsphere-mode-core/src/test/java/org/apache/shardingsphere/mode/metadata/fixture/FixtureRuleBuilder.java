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

package org.apache.shardingsphere.mode.metadata.fixture;

import org.apache.shardingsphere.infra.instance.InstanceContext;
import org.apache.shardingsphere.infra.rule.ShardingSphereRule;
import org.apache.shardingsphere.infra.rule.builder.database.DatabaseRuleBuilder;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Map;

public final class FixtureRuleBuilder implements DatabaseRuleBuilder<FixtureRuleConfiguration> {
    
    @Override
    public FixtureRule build(final FixtureRuleConfiguration config, final String databaseName,
                             final Map<String, DataSource> dataSources, final Collection<ShardingSphereRule> builtRules, final InstanceContext instanceContext) {
        return new FixtureRule();
    }
    
    @Override
    public int getOrder() {
        return -10;
    }
    
    @Override
    public Class<FixtureRuleConfiguration> getTypeClass() {
        return FixtureRuleConfiguration.class;
    }
}
