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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Pagination object. */
@ApiModel(description = "Pagination object.")
@JsonPropertyOrder({
  Pagination.JSON_PROPERTY_TOTAL_COUNT,
  Pagination.JSON_PROPERTY_TOTAL_FILTERED_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Pagination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public static final String JSON_PROPERTY_TOTAL_FILTERED_COUNT = "total_filtered_count";
  private Long totalFilteredCount;

  public Pagination totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total count.
   *
   * @return totalCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total count.")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public Pagination totalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
    return this;
  }

  /**
   * Total count of elements matched by the filter.
   *
   * @return totalFilteredCount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total count of elements matched by the filter.")
  @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalFilteredCount() {
    return totalFilteredCount;
  }

  public void setTotalFilteredCount(Long totalFilteredCount) {
    this.totalFilteredCount = totalFilteredCount;
  }

  /** Return true if this Pagination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.totalCount, pagination.totalCount)
        && Objects.equals(this.totalFilteredCount, pagination.totalFilteredCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, totalFilteredCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalFilteredCount: ").append(toIndentedString(totalFilteredCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
