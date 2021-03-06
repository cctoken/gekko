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
 *
 * Created by CuttleFish on 2020/7/2.
 */
package com.github.jobop.gekko.store;


import com.github.jobop.gekko.core.lifecycle.LifeCycle;
import com.github.jobop.gekko.protocols.message.GekkoEntry;
import com.github.jobop.gekko.protocols.message.GekkoIndex;

import java.util.List;


public interface Store extends LifeCycle {
    public void append(GekkoEntry entry);

    public List<GekkoEntry> batchGet(long fromPos, long toPos);

    public GekkoEntry get(long offset, long length);

    public GekkoEntry getByIndex(long index);

    public List<GekkoEntry> batchGetByIndex(long fromIndex, long toIndex);


    public long getMaxIndex();
    public void trimAfter(long fromIndex);
    public void trimBefore(long toIndex);


}
