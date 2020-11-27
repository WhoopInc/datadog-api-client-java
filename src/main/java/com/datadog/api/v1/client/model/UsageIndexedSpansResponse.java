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
import com.datadog.api.v1.client.model.UsageIndexedSpansHour;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * A response containing indexed spans usage.
 */
@ApiModel(description = "A response containing indexed spans usage.")
@JsonPropertyOrder({
  UsageIndexedSpansResponse.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageIndexedSpansResponse {
  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<UsageIndexedSpansHour> usage = null;


  public UsageIndexedSpansResponse usage(List<UsageIndexedSpansHour> usage) {
    this.usage = usage;
    return this;
  }

  public UsageIndexedSpansResponse addUsageItem(UsageIndexedSpansHour usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    return this;
  }

   /**
   * Array with the number of hourly traces indexed for a given organization.
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array with the number of hourly traces indexed for a given organization.")
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UsageIndexedSpansHour> getUsage() {
    return usage;
  }


  public void setUsage(List<UsageIndexedSpansHour> usage) {
    this.usage = usage;
  }


  /**
   * Return true if this UsageIndexedSpansResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageIndexedSpansResponse usageIndexedSpansResponse = (UsageIndexedSpansResponse) o;
    return Objects.equals(this.usage, usageIndexedSpansResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageIndexedSpansResponse {\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
