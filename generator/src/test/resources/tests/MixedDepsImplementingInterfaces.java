/*
 * Copyright (C) 2013 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tests;

import com.google.autofactory.AutoFactory;
import com.google.autofactory.Provided;

/**
 * @author Gregory Kick
 */
final class MixedDepsImplementingInterfaces {
  @AutoFactory(implementing = {FromInt.class, MarkerA.class})
  MixedDepsImplementingInterfaces(@Provided String s, int i) {}
  
  @AutoFactory(implementing = {FromObject.class, MarkerB.class})
  MixedDepsImplementingInterfaces(Object o) {}

  interface FromInt {
    MixedDepsImplementingInterfaces fromInt(int i);
  }
  
  interface FromObject {
    MixedDepsImplementingInterfaces fromObject(Object o);
  }
  
  interface MarkerA {}

  interface MarkerB {}
}
