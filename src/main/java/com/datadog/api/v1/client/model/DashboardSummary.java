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
import com.datadog.api.v1.client.model.DashboardSummaryDashboards;
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
 * Dashboard summary response.
 */
@ApiModel(description = "Dashboard summary response.")
@JsonPropertyOrder({
  DashboardSummary.JSON_PROPERTY_DASHBOARDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DashboardSummary {
  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  private List<DashboardSummaryDashboards> dashboards = null;


  public DashboardSummary dashboards(List<DashboardSummaryDashboards> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public DashboardSummary addDashboardsItem(DashboardSummaryDashboards dashboardsItem) {
    if (this.dashboards == null) {
      this.dashboards = new ArrayList<>();
    }
    this.dashboards.add(dashboardsItem);
    return this;
  }

   /**
   * List of dashboard definitions.
   * @return dashboards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of dashboard definitions.")
  @JsonProperty(JSON_PROPERTY_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DashboardSummaryDashboards> getDashboards() {
    return dashboards;
  }


  public void setDashboards(List<DashboardSummaryDashboards> dashboards) {
    this.dashboards = dashboards;
  }


  /**
   * Return true if this DashboardSummary object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSummary dashboardSummary = (DashboardSummary) o;
    return Objects.equals(this.dashboards, dashboardSummary.dashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSummary {\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
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
