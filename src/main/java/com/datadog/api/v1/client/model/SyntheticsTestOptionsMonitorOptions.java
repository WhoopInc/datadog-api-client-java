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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object containing the options for a Synthetic test as a monitor (e.g. renotification).
 */
@ApiModel(description = "Object containing the options for a Synthetic test as a monitor (e.g. renotification).")
@JsonPropertyOrder({
  SyntheticsTestOptionsMonitorOptions.JSON_PROPERTY_RENOTIFY_INTERVAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsTestOptionsMonitorOptions {
  public static final String JSON_PROPERTY_RENOTIFY_INTERVAL = "renotify_interval";
  private Long renotifyInterval;


  public SyntheticsTestOptionsMonitorOptions renotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
    return this;
  }

   /**
   * Time interval before renotifying if the test is still failing (in minutes).
   * minimum: 0
   * maximum: 1440
   * @return renotifyInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time interval before renotifying if the test is still failing (in minutes).")
  @JsonProperty(JSON_PROPERTY_RENOTIFY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRenotifyInterval() {
    return renotifyInterval;
  }


  public void setRenotifyInterval(Long renotifyInterval) {
    this.renotifyInterval = renotifyInterval;
  }


  /**
   * Return true if this SyntheticsTestOptions_monitor_options object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestOptionsMonitorOptions syntheticsTestOptionsMonitorOptions = (SyntheticsTestOptionsMonitorOptions) o;
    return Objects.equals(this.renotifyInterval, syntheticsTestOptionsMonitorOptions.renotifyInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renotifyInterval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestOptionsMonitorOptions {\n");
    sb.append("    renotifyInterval: ").append(toIndentedString(renotifyInterval)).append("\n");
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
