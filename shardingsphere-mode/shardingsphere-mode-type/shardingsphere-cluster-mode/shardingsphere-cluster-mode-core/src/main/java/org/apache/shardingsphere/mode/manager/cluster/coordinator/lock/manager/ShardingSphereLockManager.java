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

package org.apache.shardingsphere.mode.manager.cluster.coordinator.lock.manager;

import org.apache.shardingsphere.infra.lock.LockScope;
import org.apache.shardingsphere.infra.lock.ShardingSphereLock;
import org.apache.shardingsphere.mode.manager.cluster.coordinator.lock.manager.internal.ShardingSphereInternalLockHolder;
import org.apache.shardingsphere.mode.manager.lock.definition.DatabaseLockNameDefinition;
import org.apache.shardingsphere.spi.annotation.SingletonSPI;
import org.apache.shardingsphere.spi.type.required.RequiredSPI;

/**
 * Lock manager of ShardingSphere.
 */
@SingletonSPI
public interface ShardingSphereLockManager extends RequiredSPI {
    
    /**
     * Init lock manager.
     *
     * @param lockHolder lock holder
     */
    void init(ShardingSphereInternalLockHolder lockHolder);
    
    /**
     * Get distributed lock.
     *
     * @param lockScope lock scope
     * @return distributed lock
     */
    ShardingSphereLock getDistributedLock(LockScope lockScope);
    
    /**
     * Try lock for database.
     *
     * @param lockNameDefinition lock name definition
     * @return is locked or not
     */
    boolean tryLock(DatabaseLockNameDefinition lockNameDefinition);
    
    /**
     * Try lock write for database.
     *
     * @param lockNameDefinition lock name definition
     * @param timeoutMilliseconds timeout milliseconds
     * @return is locked or not
     */
    boolean tryLock(DatabaseLockNameDefinition lockNameDefinition, long timeoutMilliseconds);
    
    /**
     * Release lock for database.
     *
     * @param lockNameDefinition lock name definition
     */
    void releaseLock(DatabaseLockNameDefinition lockNameDefinition);
    
    /**
     * Is locked database.
     *
     * @param lockNameDefinition lock name definition
     * @return is locked or not
     */
    boolean isLocked(DatabaseLockNameDefinition lockNameDefinition);
}
