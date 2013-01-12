/*
 * Copyright 2010 Aleksey Shipilev
 *
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
 */
package net.shipilev.dedup;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Counters {

    public final AtomicLong inputData = new AtomicLong();
    public final AtomicLong compressedData = new AtomicLong();
    public final AtomicLong compressedDedupData = new AtomicLong();
    public final AtomicLong dedupData = new AtomicLong();
    public final AtomicLong dedupCompressData = new AtomicLong();

    public final AtomicInteger collisions1 = new AtomicInteger();
    public final AtomicInteger collisions2 = new AtomicInteger();

}