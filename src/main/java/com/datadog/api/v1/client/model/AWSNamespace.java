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

/** The namespace associated with the tag filter entry. */
@JsonSerialize(using = AWSNamespace.AWSNamespaceSerializer.class)
public class AWSNamespace {

  public static final AWSNamespace ELB = new AWSNamespace("elb");
  public static final AWSNamespace APPLICATION_ELB = new AWSNamespace("application_elb");
  public static final AWSNamespace SQS = new AWSNamespace("sqs");
  public static final AWSNamespace RDS = new AWSNamespace("rds");
  public static final AWSNamespace CUSTOM = new AWSNamespace("custom");
  public static final AWSNamespace NETWORK_ELB = new AWSNamespace("network_elb");
  public static final AWSNamespace LAMBDA = new AWSNamespace("lambda");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("elb", "application_elb", "sqs", "rds", "custom", "network_elb", "lambda"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  AWSNamespace(String value) {
    this.value = value;
  }

  public static class AWSNamespaceSerializer extends StdSerializer<AWSNamespace> {
    public AWSNamespaceSerializer(Class<AWSNamespace> t) {
      super(t);
    }

    public AWSNamespaceSerializer() {
      this(null);
    }

    @Override
    public void serialize(AWSNamespace value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this AWSNamespace object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((AWSNamespace) o).value);
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
  public static AWSNamespace fromValue(String value) {
    return new AWSNamespace(value);
  }
}
