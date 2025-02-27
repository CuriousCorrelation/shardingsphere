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

package org.apache.shardingsphere.sharding.yaml.swapper;

import org.apache.shardingsphere.infra.yaml.config.swapper.YamlRuleConfigurationSwapper;
import org.apache.shardingsphere.infra.yaml.config.swapper.algorithm.ShardingSphereAlgorithmConfigurationYamlSwapper;
import org.apache.shardingsphere.infra.yaml.config.swapper.rulealtered.OnRuleAlteredActionConfigurationYamlSwapper;
import org.apache.shardingsphere.sharding.api.config.ShardingRuleConfiguration;
import org.apache.shardingsphere.sharding.constant.ShardingOrder;
import org.apache.shardingsphere.sharding.yaml.config.YamlShardingRuleConfiguration;
import org.apache.shardingsphere.sharding.yaml.config.rule.YamlShardingAutoTableRuleConfiguration;
import org.apache.shardingsphere.sharding.yaml.config.rule.YamlTableRuleConfiguration;
import org.apache.shardingsphere.sharding.yaml.swapper.rule.ShardingAutoTableRuleConfigurationYamlSwapper;
import org.apache.shardingsphere.sharding.yaml.swapper.rule.ShardingTableRuleConfigurationYamlSwapper;
import org.apache.shardingsphere.sharding.yaml.swapper.strategy.KeyGenerateStrategyConfigurationYamlSwapper;
import org.apache.shardingsphere.sharding.yaml.swapper.strategy.ShardingAuditStrategyConfigurationYamlSwapper;
import org.apache.shardingsphere.sharding.yaml.swapper.strategy.ShardingStrategyConfigurationYamlSwapper;

import java.util.Collections;
import java.util.Map.Entry;

/**
 * Sharding rule configuration YAML swapper.
 */
public final class ShardingRuleConfigurationYamlSwapper implements YamlRuleConfigurationSwapper<YamlShardingRuleConfiguration, ShardingRuleConfiguration> {
    
    private final ShardingTableRuleConfigurationYamlSwapper tableYamlSwapper = new ShardingTableRuleConfigurationYamlSwapper();
    
    private final ShardingStrategyConfigurationYamlSwapper shardingStrategyYamlSwapper = new ShardingStrategyConfigurationYamlSwapper();
    
    private final KeyGenerateStrategyConfigurationYamlSwapper keyGenerateStrategyYamlSwapper = new KeyGenerateStrategyConfigurationYamlSwapper();
    
    private final ShardingSphereAlgorithmConfigurationYamlSwapper algorithmSwapper = new ShardingSphereAlgorithmConfigurationYamlSwapper();
    
    private final OnRuleAlteredActionConfigurationYamlSwapper onRuleAlteredActionYamlSwapper = new OnRuleAlteredActionConfigurationYamlSwapper();
    
    private final ShardingAuditStrategyConfigurationYamlSwapper auditStrategyYamlSwapper = new ShardingAuditStrategyConfigurationYamlSwapper();
    
    @Override
    public YamlShardingRuleConfiguration swapToYamlConfiguration(final ShardingRuleConfiguration data) {
        YamlShardingRuleConfiguration result = new YamlShardingRuleConfiguration();
        data.getTables().forEach(each -> result.getTables().put(each.getLogicTable(), tableYamlSwapper.swapToYamlConfiguration(each)));
        data.getAutoTables().forEach(each -> result.getAutoTables().put(each.getLogicTable(),
                new ShardingAutoTableRuleConfigurationYamlSwapper(Collections.emptyMap(), data.getShardingAlgorithms()).swapToYamlConfiguration(each)));
        result.getBindingTables().addAll(data.getBindingTableGroups());
        result.getBroadcastTables().addAll(data.getBroadcastTables());
        setYamlStrategies(data, result);
        setYamlAlgorithms(data, result);
        result.setDefaultShardingColumn(data.getDefaultShardingColumn());
        result.setScalingName(data.getScalingName());
        return result;
    }
    
    private void setYamlStrategies(final ShardingRuleConfiguration data, final YamlShardingRuleConfiguration yamlConfig) {
        if (null != data.getDefaultDatabaseShardingStrategy()) {
            yamlConfig.setDefaultDatabaseStrategy(shardingStrategyYamlSwapper.swapToYamlConfiguration(data.getDefaultDatabaseShardingStrategy()));
        }
        if (null != data.getDefaultTableShardingStrategy()) {
            yamlConfig.setDefaultTableStrategy(shardingStrategyYamlSwapper.swapToYamlConfiguration(data.getDefaultTableShardingStrategy()));
        }
        if (null != data.getDefaultKeyGenerateStrategy()) {
            yamlConfig.setDefaultKeyGenerateStrategy(keyGenerateStrategyYamlSwapper.swapToYamlConfiguration(data.getDefaultKeyGenerateStrategy()));
        }
        if (null != data.getAuditStrategy()) {
            yamlConfig.setAuditStrategy(auditStrategyYamlSwapper.swapToYamlConfiguration(data.getAuditStrategy()));
        }
    }
    
    private void setYamlAlgorithms(final ShardingRuleConfiguration data, final YamlShardingRuleConfiguration yamlConfig) {
        if (null != data.getShardingAlgorithms()) {
            data.getShardingAlgorithms().forEach((key, value) -> yamlConfig.getShardingAlgorithms().put(key, algorithmSwapper.swapToYamlConfiguration(value)));
        }
        if (null != data.getKeyGenerators()) {
            data.getKeyGenerators().forEach((key, value) -> yamlConfig.getKeyGenerators().put(key, algorithmSwapper.swapToYamlConfiguration(value)));
        }
        if (null != data.getScaling()) {
            data.getScaling().forEach((key, value) -> yamlConfig.getScaling().put(key, onRuleAlteredActionYamlSwapper.swapToYamlConfiguration(value)));
        }
    }
    
    @Override
    public ShardingRuleConfiguration swapToObject(final YamlShardingRuleConfiguration yamlConfig) {
        ShardingRuleConfiguration result = new ShardingRuleConfiguration();
        for (Entry<String, YamlTableRuleConfiguration> entry : yamlConfig.getTables().entrySet()) {
            YamlTableRuleConfiguration tableRuleConfig = entry.getValue();
            tableRuleConfig.setLogicTable(entry.getKey());
            result.getTables().add(tableYamlSwapper.swapToObject(tableRuleConfig));
        }
        for (Entry<String, YamlShardingAutoTableRuleConfiguration> entry : yamlConfig.getAutoTables().entrySet()) {
            YamlShardingAutoTableRuleConfiguration tableRuleConfig = entry.getValue();
            tableRuleConfig.setLogicTable(entry.getKey());
            result.getAutoTables().add(new ShardingAutoTableRuleConfigurationYamlSwapper(Collections.emptyMap(), Collections.emptyMap()).swapToObject(tableRuleConfig));
        }
        result.getBindingTableGroups().addAll(yamlConfig.getBindingTables());
        result.getBroadcastTables().addAll(yamlConfig.getBroadcastTables());
        setStrategies(yamlConfig, result);
        setAlgorithms(yamlConfig, result);
        result.setDefaultShardingColumn(yamlConfig.getDefaultShardingColumn());
        result.setScalingName(yamlConfig.getScalingName());
        return result;
    }
    
    private void setStrategies(final YamlShardingRuleConfiguration yamlConfig, final ShardingRuleConfiguration ruleConfig) {
        if (null != yamlConfig.getDefaultDatabaseStrategy()) {
            ruleConfig.setDefaultDatabaseShardingStrategy(shardingStrategyYamlSwapper.swapToObject(yamlConfig.getDefaultDatabaseStrategy()));
        }
        if (null != yamlConfig.getDefaultTableStrategy()) {
            ruleConfig.setDefaultTableShardingStrategy(shardingStrategyYamlSwapper.swapToObject(yamlConfig.getDefaultTableStrategy()));
        }
        if (null != yamlConfig.getDefaultKeyGenerateStrategy()) {
            ruleConfig.setDefaultKeyGenerateStrategy(keyGenerateStrategyYamlSwapper.swapToObject(yamlConfig.getDefaultKeyGenerateStrategy()));
        }
        if (null != yamlConfig.getAuditStrategy()) {
            ruleConfig.setAuditStrategy(auditStrategyYamlSwapper.swapToObject(yamlConfig.getAuditStrategy()));
        }
    }
    
    private void setAlgorithms(final YamlShardingRuleConfiguration yamlConfig, final ShardingRuleConfiguration ruleConfig) {
        if (null != yamlConfig.getShardingAlgorithms()) {
            yamlConfig.getShardingAlgorithms().forEach((key, value) -> ruleConfig.getShardingAlgorithms().put(key, algorithmSwapper.swapToObject(value)));
        }
        if (null != yamlConfig.getKeyGenerators()) {
            yamlConfig.getKeyGenerators().forEach((key, value) -> ruleConfig.getKeyGenerators().put(key, algorithmSwapper.swapToObject(value)));
        }
        if (null != yamlConfig.getAuditors()) {
            yamlConfig.getAuditors().forEach((key, value) -> ruleConfig.getAuditors().put(key, algorithmSwapper.swapToObject(value)));
        }
        if (null != yamlConfig.getScaling()) {
            yamlConfig.getScaling().forEach((key, value) -> ruleConfig.getScaling().put(key, onRuleAlteredActionYamlSwapper.swapToObject(value)));
        }
    }
    
    @Override
    public Class<ShardingRuleConfiguration> getTypeClass() {
        return ShardingRuleConfiguration.class;
    }
    
    @Override
    public String getRuleTagName() {
        return "SHARDING";
    }
    
    @Override
    public int getOrder() {
        return ShardingOrder.ORDER;
    }
}
