/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.orchestration.internal.state.datasource;

import io.shardingjdbc.core.jdbc.core.datasource.MasterSlaveDataSource;
import io.shardingjdbc.core.rule.MasterSlaveRule;
import io.shardingjdbc.orchestration.api.config.OrchestrationConfiguration;
import io.shardingjdbc.orchestration.internal.config.ConfigurationService;
import io.shardingjdbc.orchestration.internal.state.StateNode;
import io.shardingjdbc.orchestration.reg.base.CoordinatorRegistryCenter;
import lombok.Getter;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.TreeCache;
import org.apache.curator.framework.recipes.cache.TreeCacheEvent;
import org.apache.curator.framework.recipes.cache.TreeCacheListener;

/**
 * Data source service.
 * 
 * @author caohao
 */
@Getter
public final class DataSourceService {
    
    private final String dataSourceNodePath;
    
    private final CoordinatorRegistryCenter regCenter;
    
    private final ConfigurationService configurationService;
    
    public DataSourceService(final OrchestrationConfiguration config) {
        dataSourceNodePath = new StateNode(config.getName()).getDataSourceNodeFullPath();
        regCenter = config.getRegistryCenter();
        configurationService = new ConfigurationService(config);
    }
    
    /**
     * Persist master-salve datasources node and add listener.
     *
     * @param masterSlaveDataSource master-slave datasource
     */
    public void persistDataSourcesNodeOnline(final MasterSlaveDataSource masterSlaveDataSource) {
        regCenter.persist(dataSourceNodePath, "");
        regCenter.addCacheData(dataSourceNodePath);
        addDataSourcesNodeListener(masterSlaveDataSource);
    }
    
    private void addDataSourcesNodeListener(final MasterSlaveDataSource masterSlaveDataSource) {
        TreeCache cache = (TreeCache) regCenter.getRawCache(dataSourceNodePath);
        cache.getListenable().addListener(new TreeCacheListener() {
            
            @Override
            public void childEvent(final CuratorFramework client, final TreeCacheEvent event) throws Exception {
                ChildData childData = event.getData();
                if (null == childData || null == childData.getData() || childData.getPath().isEmpty()) {
                    return;
                }
                if (TreeCacheEvent.Type.NODE_UPDATED == event.getType() || TreeCacheEvent.Type.NODE_REMOVED == event.getType()) {
                    MasterSlaveRule masterSlaveRule = configurationService.getAvailableMasterSlaveRule();
                    if (TreeCacheEvent.Type.NODE_UPDATED == event.getType()) {
                        String path = childData.getPath();
                        String dataSourceName = path.substring(path.lastIndexOf("/") + 1);
                        masterSlaveRule.getSlaveDataSourceMap().remove(dataSourceName);
                    }
                    masterSlaveDataSource.renew(masterSlaveRule);
                }
            }
        });
    }
}
