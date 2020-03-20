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

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v2.client.model.DashboardListItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DashboardListItems
 */
@JsonPropertyOrder({
  DashboardListItems.JSON_PROPERTY_DASHBOARDS,
  DashboardListItems.JSON_PROPERTY_TOTAL
})

public class DashboardListItems {
  public static final String JSON_PROPERTY_DASHBOARDS = "dashboards";
  private List<DashboardListItem> dashboards = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;


  public DashboardListItems dashboards(List<DashboardListItem> dashboards) {
    
    this.dashboards = dashboards;
    return this;
  }

  public DashboardListItems addDashboardsItem(DashboardListItem dashboardsItem) {
    this.dashboards.add(dashboardsItem);
    return this;
  }

   /**
   * List of dashboards in the dashboard list.
   * @return dashboards
  **/
  @ApiModelProperty(required = true, value = "List of dashboards in the dashboard list.")
  @JsonProperty(JSON_PROPERTY_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DashboardListItem> getDashboards() {
    return dashboards;
  }


  public void setDashboards(List<DashboardListItem> dashboards) {
    this.dashboards = dashboards;
  }


   /**
   * Number of dashboards in the dashboard list.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of dashboards in the dashboard list.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotal() {
    return total;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListItems dashboardListItems = (DashboardListItems) o;
    return Objects.equals(this.dashboards, dashboardListItems.dashboards) &&
        Objects.equals(this.total, dashboardListItems.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboards, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListItems {\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

