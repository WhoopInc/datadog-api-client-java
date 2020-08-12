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
 * Deleted dashboard details.
 */
@ApiModel(description = "Deleted dashboard details.")
@JsonPropertyOrder({
  DashboardListDeleteResponse.JSON_PROPERTY_DELETED_DASHBOARD_LIST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DashboardListDeleteResponse {
  public static final String JSON_PROPERTY_DELETED_DASHBOARD_LIST_ID = "deleted_dashboard_list_id";
  private Long deletedDashboardListId;


  public DashboardListDeleteResponse deletedDashboardListId(Long deletedDashboardListId) {
    this.deletedDashboardListId = deletedDashboardListId;
    return this;
  }

   /**
   * ID of the deleted dashboard list.
   * @return deletedDashboardListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the deleted dashboard list.")
  @JsonProperty(JSON_PROPERTY_DELETED_DASHBOARD_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeletedDashboardListId() {
    return deletedDashboardListId;
  }


  public void setDeletedDashboardListId(Long deletedDashboardListId) {
    this.deletedDashboardListId = deletedDashboardListId;
  }


  /**
   * Return true if this DashboardListDeleteResponse object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardListDeleteResponse dashboardListDeleteResponse = (DashboardListDeleteResponse) o;
    return Objects.equals(this.deletedDashboardListId, dashboardListDeleteResponse.deletedDashboardListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedDashboardListId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardListDeleteResponse {\n");
    sb.append("    deletedDashboardListId: ").append(toIndentedString(deletedDashboardListId)).append("\n");
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
