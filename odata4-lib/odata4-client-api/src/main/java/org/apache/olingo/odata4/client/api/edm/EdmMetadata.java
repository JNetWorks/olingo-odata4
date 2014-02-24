/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.odata4.client.api.edm;

import java.util.List;

/**
 * Entry point for access information about EDM metadata.
 */
public interface EdmMetadata {

  /**
   * Checks whether the given key is a valid namespace or alias in the EdM metadata document.
   *
   * @param key namespace or alias
   * @return true if key is valid namespace or alias
   */
  boolean isNsOrAlias(String key);

  /**
   * Returns the Schema at the specified position in the EdM metadata document.
   *
   * @param index index of the Schema to return
   * @return the Schema at the specified position in the EdM metadata document
   */
  Schema getSchema(final int index);

  /**
   * Returns the Schema with the specified key (namespace or alias) in the EdM metadata document.
   *
   * @param key namespace or alias
   * @return the Schema with the specified key in the EdM metadata document
   */
  Schema getSchema(final String key);

  /**
   * Returns all Schema objects defined in the EdM metadata document.
   *
   * @return all Schema objects defined in the EdM metadata document
   */
  List<? extends Schema> getSchemas();

}