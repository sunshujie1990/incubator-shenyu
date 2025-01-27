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

package org.apache.shenyu.admin.model.event.role;

import org.apache.shenyu.admin.model.entity.RoleDO;
import org.apache.shenyu.admin.model.enums.EventTypeEnum;

import java.util.List;

/**
 * RoleUpdatedEvent.
 */
public class RoleUpdatedEvent extends RoleChangedEvent {
    
    private final List<String> newPermission;
    
    /**
     * Create a new {@code RoleUpdatedEvent}.operator is unknown.
     *
     * @param source   Current role state
     * @param before   before role state
     * @param operator operator
     */
    public RoleUpdatedEvent(final RoleDO source, final RoleDO before, final String operator, final List<String> newPermission) {
        super(source, before, EventTypeEnum.ROLE_UPDATE, operator);
        this.newPermission = newPermission;
    }
    
    /**
     * the created role.
     *
     * @return role
     */
    public RoleDO getRole() {
        return (RoleDO) getSource();
    }
    
    /**
     * get new permission.
     *
     * @return permission.
     */
    public List<String> getNewPermission() {
        return newPermission;
    }
    
}
