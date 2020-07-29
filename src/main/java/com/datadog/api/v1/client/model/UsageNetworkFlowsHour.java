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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Number of netflow events indexed for each hour for a given organization.
 */
@ApiModel(description = "Number of netflow events indexed for each hour for a given organization.")
@JsonPropertyOrder({
  UsageNetworkFlowsHour.JSON_PROPERTY_HOUR,
  UsageNetworkFlowsHour.JSON_PROPERTY_INDEXED_EVENT_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageNetworkFlowsHour {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private OffsetDateTime hour;

  public static final String JSON_PROPERTY_INDEXED_EVENT_COUNT = "indexed_event_count";
  private Long indexedEventCount;


  public UsageNetworkFlowsHour hour(OffsetDateTime hour) {
    this.hour = hour;
    return this;
  }

   /**
   * The hour for the usage.
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hour for the usage.")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getHour() {
    return hour;
  }


  public void setHour(OffsetDateTime hour) {
    this.hour = hour;
  }


  public UsageNetworkFlowsHour indexedEventCount(Long indexedEventCount) {
    this.indexedEventCount = indexedEventCount;
    return this;
  }

   /**
   * Contains the number of netflow events indexed.
   * @return indexedEventCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains the number of netflow events indexed.")
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIndexedEventCount() {
    return indexedEventCount;
  }


  public void setIndexedEventCount(Long indexedEventCount) {
    this.indexedEventCount = indexedEventCount;
  }


  /**
   * Return true if this UsageNetworkFlowsHour object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageNetworkFlowsHour usageNetworkFlowsHour = (UsageNetworkFlowsHour) o;
    return Objects.equals(this.hour, usageNetworkFlowsHour.hour) &&
        Objects.equals(this.indexedEventCount, usageNetworkFlowsHour.indexedEventCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, indexedEventCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageNetworkFlowsHour {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    indexedEventCount: ").append(toIndentedString(indexedEventCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

