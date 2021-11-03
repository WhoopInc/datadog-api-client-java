/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

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

/** The metric&#39;s type. */
@JsonSerialize(
    using = MetricTagConfigurationMetricTypes.MetricTagConfigurationMetricTypesSerializer.class)
public class MetricTagConfigurationMetricTypes {

  public static final MetricTagConfigurationMetricTypes GAUGE =
      new MetricTagConfigurationMetricTypes("gauge");
  public static final MetricTagConfigurationMetricTypes COUNT =
      new MetricTagConfigurationMetricTypes("count");
  public static final MetricTagConfigurationMetricTypes RATE =
      new MetricTagConfigurationMetricTypes("rate");
  public static final MetricTagConfigurationMetricTypes DISTRIBUTION =
      new MetricTagConfigurationMetricTypes("distribution");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gauge", "count", "rate", "distribution"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  MetricTagConfigurationMetricTypes(String value) {
    this.value = value;
  }

  public static class MetricTagConfigurationMetricTypesSerializer
      extends StdSerializer<MetricTagConfigurationMetricTypes> {
    public MetricTagConfigurationMetricTypesSerializer(Class<MetricTagConfigurationMetricTypes> t) {
      super(t);
    }

    public MetricTagConfigurationMetricTypesSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricTagConfigurationMetricTypes value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this MetricTagConfigurationMetricTypes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((MetricTagConfigurationMetricTypes) o).value);
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
  public static MetricTagConfigurationMetricTypes fromValue(String value) {
    return new MetricTagConfigurationMetricTypes(value);
  }
}