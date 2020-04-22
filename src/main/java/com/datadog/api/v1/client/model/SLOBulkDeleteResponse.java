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
import com.datadog.api.v1.client.model.SLOBulkDeleteResponseData;
import com.datadog.api.v1.client.model.SLOBulkDeleteResponseErrors;
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
 * The bulk partial delete service level objective object endpoint response.  This endpoint operates on multiple service level objective objects, so it may be partially successful. In such cases, the \&quot;data\&quot; and \&quot;error\&quot; fields in this response indicate which deletions succeeded and failed.
 */
@ApiModel(description = "The bulk partial delete service level objective object endpoint response.  This endpoint operates on multiple service level objective objects, so it may be partially successful. In such cases, the \"data\" and \"error\" fields in this response indicate which deletions succeeded and failed.")
@JsonPropertyOrder({
  SLOBulkDeleteResponse.JSON_PROPERTY_DATA,
  SLOBulkDeleteResponse.JSON_PROPERTY_ERRORS
})

public class SLOBulkDeleteResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private SLOBulkDeleteResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<SLOBulkDeleteResponseErrors> errors = null;


  public SLOBulkDeleteResponse data(SLOBulkDeleteResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SLOBulkDeleteResponseData getData() {
    return data;
  }


  public void setData(SLOBulkDeleteResponseData data) {
    this.data = data;
  }


  public SLOBulkDeleteResponse errors(List<SLOBulkDeleteResponseErrors> errors) {
    
    this.errors = errors;
    return this;
  }

  public SLOBulkDeleteResponse addErrorsItem(SLOBulkDeleteResponseErrors errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * TODO.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SLOBulkDeleteResponseErrors> getErrors() {
    return errors;
  }


  public void setErrors(List<SLOBulkDeleteResponseErrors> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOBulkDeleteResponse slOBulkDeleteResponse = (SLOBulkDeleteResponse) o;
    return Objects.equals(this.data, slOBulkDeleteResponse.data) &&
        Objects.equals(this.errors, slOBulkDeleteResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOBulkDeleteResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
