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
package org.apache.olingo.commons.core.edm.primitivetype;

import org.apache.olingo.commons.api.edm.EdmGeospatialType;
import org.apache.olingo.commons.api.edm.EdmPrimitiveType;
import org.apache.olingo.commons.api.edm.EdmPrimitiveTypeKind;
import org.apache.olingo.commons.api.edm.EdmType;

public final class EdmPrimitiveTypeFactory {

  public static EdmType getInstance(final EdmPrimitiveTypeKind kind) {
    return kind.isGeospatial()
           ? getGeoInstance(kind)
           : getNonGeoInstance(kind);
  }

  /**
   * Returns an instance for the provided {@link EdmPrimitiveTypeKind} in the form of {@link EdmPrimitiveType} (for
   * non-geospatial types).
   *
   * @param kind EdmPrimitiveTypeKind
   * @return {@link EdmPrimitiveType} instance
   */
  public static EdmPrimitiveType getNonGeoInstance(final EdmPrimitiveTypeKind kind) {
    switch (kind) {
      case Binary:
        return EdmBinary.getInstance();
      case Boolean:
        return EdmBoolean.getInstance();
      case Byte:
        return EdmByte.getInstance();
      case SByte:
        return EdmSByte.getInstance();
      case Date:
        return EdmDate.getInstance();
      case DateTime:
        return EdmDateTime.getInstance();
      case DateTimeOffset:
        return EdmDateTimeOffset.getInstance();
      case Time:
        return EdmTime.getInstance();
      case TimeOfDay:
        return EdmTimeOfDay.getInstance();
      case Duration:
        return EdmDuration.getInstance();
      case Decimal:
        return EdmDecimal.getInstance();
      case Single:
        return EdmSingle.getInstance();
      case Double:
        return EdmDouble.getInstance();
      case Guid:
        return EdmGuid.getInstance();
      case Int16:
        return EdmInt16.getInstance();
      case Int32:
        return EdmInt32.getInstance();
      case Int64:
        return EdmInt64.getInstance();
      case String:
        return EdmString.getInstance();
      case Stream:
        return EdmStream.getInstance();

      default:
        throw new IllegalArgumentException("Wrong type: " + kind);
    }
  }

  /**
   * Returns an instance for the provided {@link EdmPrimitiveTypeKind} in the form of {@link EdmGeospatialType}.
   *
   * @param kind EdmPrimitiveTypeKind
   * @return {@link EdmGeospatialType} instance
   */
  public static EdmGeospatialType getGeoInstance(final EdmPrimitiveTypeKind kind) {
    switch (kind) {
      case Geography:
        return EdmGeography.getInstance();
      case GeographyPoint:
        return EdmGeographyPoint.getInstance();
      case GeographyLineString:
        return EdmGeographyLineString.getInstance();
      case GeographyPolygon:
        return EdmGeographyPolygon.getInstance();
      case GeographyMultiPoint:
        return EdmGeographyMultiPoint.getInstance();
      case GeographyMultiLineString:
        return EdmGeographyMultiLineString.getInstance();
      case GeographyMultiPolygon:
        return EdmGeographyMultiPolygon.getInstance();
      case GeographyCollection:
        return EdmGeographyCollection.getInstance();
      case Geometry:
        return EdmGeometry.getInstance();
      case GeometryPoint:
        return EdmGeometry.getInstance();
      case GeometryLineString:
        return EdmGeometryLineString.getInstance();
      case GeometryPolygon:
        return EdmGeometryPolygon.getInstance();
      case GeometryMultiPoint:
        return EdmGeometryMultiPoint.getInstance();
      case GeometryMultiLineString:
        return EdmGeographyMultiLineString.getInstance();
      case GeometryMultiPolygon:
        return EdmGeometryMultiPolygon.getInstance();
      case GeometryCollection:
        return EdmGeometryCollection.getInstance();

      default:
        throw new IllegalArgumentException("Wrong type: " + kind);

    }
  }

  private EdmPrimitiveTypeFactory() {
    // empty constructor for static utility class
  }

}