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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Error returned by the Logs API
 */
@ApiModel(description = "Error returned by the Logs API")
@JsonPropertyOrder({
  LogsAPIError.JSON_PROPERTY_CODE,
  LogsAPIError.JSON_PROPERTY_DETAILS,
  LogsAPIError.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsAPIError {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<LogsAPIError> details = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;


  public LogsAPIError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code identifying the error
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code identifying the error")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public LogsAPIError details(List<LogsAPIError> details) {
    this.details = details;
    return this;
  }

  public LogsAPIError addDetailsItem(LogsAPIError detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Additional error details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional error details")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogsAPIError> getDetails() {
    return details;
  }


  public void setDetails(List<LogsAPIError> details) {
    this.details = details;
  }


  public LogsAPIError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Return true if this LogsAPIError object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsAPIError logsAPIError = (LogsAPIError) o;
    return Objects.equals(this.code, logsAPIError.code) &&
        Objects.equals(this.details, logsAPIError.details) &&
        Objects.equals(this.message, logsAPIError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsAPIError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

