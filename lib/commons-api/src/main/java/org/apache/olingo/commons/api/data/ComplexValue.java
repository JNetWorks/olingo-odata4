/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.commons.api.data;

import java.util.List;

/**
 * Represents the value of a complex property.
 */
public class ComplexValue extends Linked {

  /**
   * Get list of all values for this ComplexValue.
   * Returns tha same as getProperties()
   *
   * @return all values for this ComplexValue (can not be null).
   */
  public List<Property> getValue() {
    return properties;
  }

  @Override
  public boolean equals(final Object o) {
    return super.equals(o) && properties.equals(((ComplexValue) o).properties);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + properties.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return properties.toString();
  }
}
