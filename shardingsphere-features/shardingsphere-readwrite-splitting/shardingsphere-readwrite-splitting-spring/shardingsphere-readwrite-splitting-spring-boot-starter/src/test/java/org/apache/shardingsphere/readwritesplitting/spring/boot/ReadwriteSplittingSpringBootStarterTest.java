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

package org.apache.shardingsphere.readwritesplitting.spring.boot;

import org.apache.shardingsphere.readwritesplitting.algorithm.config.AlgorithmProvidedReadwriteSplittingRuleConfiguration;
import org.apache.shardingsphere.readwritesplitting.algorithm.loadbalance.RandomReplicaLoadBalanceAlgorithm;
import org.apache.shardingsphere.readwritesplitting.api.rule.ReadwriteSplittingDataSourceRuleConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ReadwriteSplittingSpringBootStarterTest.class)
@SpringBootApplication
@ActiveProfiles("readwrite-splitting")
public class ReadwriteSplittingSpringBootStarterTest {
    
    @Resource
    private RandomReplicaLoadBalanceAlgorithm random;
    
    @Resource
    private AlgorithmProvidedReadwriteSplittingRuleConfiguration config;
    
    @Test
    public void assertLoadBalanceAlgorithm() {
        assertTrue(random.getProps().isEmpty());
    }
    
    @Test
    public void assertReadwriteSplittingRuleConfiguration() {
        assertThat(config.getDataSources().size(), is(1));
        assertTrue(config.getDataSources().stream().findFirst().isPresent());
        ReadwriteSplittingDataSourceRuleConfiguration actual = config.getDataSources().stream().findFirst().get();
        assertThat(actual.getName(), is("readwrite_ds"));
        assertNotNull(actual.getStaticStrategy());
        assertThat(actual.getStaticStrategy().getWriteDataSourceName(), is("write_ds"));
        assertThat(actual.getStaticStrategy().getReadDataSourceNames(), is(Arrays.asList("read_ds_0", "read_ds_1")));
        assertThat(actual.getLoadBalancerName(), is("random"));
        assertTrue(config.getDataSources().contains(actual));
        assertThat(config.getLoadBalanceAlgorithms().size(), is(1));
        assertTrue(config.getLoadBalanceAlgorithms().containsKey("random"));
    }
}
