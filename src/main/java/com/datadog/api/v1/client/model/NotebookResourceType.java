/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Type of the Notebook resource. */
@JsonSerialize(using = NotebookResourceType.NotebookResourceTypeSerializer.class)
public class NotebookResourceType {

  public static final NotebookResourceType NOTEBOOKS = new NotebookResourceType("notebooks");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("notebooks"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  NotebookResourceType(String value) {
    this.value = value;
  }

  public static class NotebookResourceTypeSerializer extends StdSerializer<NotebookResourceType> {
    public NotebookResourceTypeSerializer(Class<NotebookResourceType> t) {
      super(t);
    }

    public NotebookResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotebookResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this NotebookResourceType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((NotebookResourceType) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NotebookResourceType fromValue(String value) {
    return new NotebookResourceType(value);
  }
}
