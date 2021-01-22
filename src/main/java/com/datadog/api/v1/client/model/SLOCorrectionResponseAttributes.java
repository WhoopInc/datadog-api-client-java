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
import com.datadog.api.v1.client.model.Creator;
import com.datadog.api.v1.client.model.SLOCorrectionCategory;
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
 * The attribute object associated with the SLO correction
 */
@ApiModel(description = "The attribute object associated with the SLO correction")
@JsonPropertyOrder({
  SLOCorrectionResponseAttributes.JSON_PROPERTY_CATEGORY,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_CREATOR,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_END,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_SLO_ID,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_START,
  SLOCorrectionResponseAttributes.JSON_PROPERTY_TIMEZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SLOCorrectionResponseAttributes {
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private SLOCorrectionCategory category;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Creator creator;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;


  public SLOCorrectionResponseAttributes category(SLOCorrectionCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SLOCorrectionCategory getCategory() {
    return category;
  }


  public void setCategory(SLOCorrectionCategory category) {
    this.category = category;
  }


  public SLOCorrectionResponseAttributes creator(Creator creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Creator getCreator() {
    return creator;
  }


  public void setCreator(Creator creator) {
    this.creator = creator;
  }


  public SLOCorrectionResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the correction being made.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the correction being made.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SLOCorrectionResponseAttributes end(Long end) {
    this.end = end;
    return this;
  }

   /**
   * Ending time of the correction in epoch seconds
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ending time of the correction in epoch seconds")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnd() {
    return end;
  }


  public void setEnd(Long end) {
    this.end = end;
  }


  public SLOCorrectionResponseAttributes sloId(String sloId) {
    this.sloId = sloId;
    return this;
  }

   /**
   * ID of the SLO that this correction will be applied to
   * @return sloId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the SLO that this correction will be applied to")
  @JsonProperty(JSON_PROPERTY_SLO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSloId() {
    return sloId;
  }


  public void setSloId(String sloId) {
    this.sloId = sloId;
  }


  public SLOCorrectionResponseAttributes start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Starting time of the correction in epoch seconds
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Starting time of the correction in epoch seconds")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStart() {
    return start;
  }


  public void setStart(Long start) {
    this.start = start;
  }


  public SLOCorrectionResponseAttributes timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone to display in the UI for the correction times (defaults to \&quot;UTC\&quot;)
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone to display in the UI for the correction times (defaults to \"UTC\")")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this SLOCorrectionResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionResponseAttributes slOCorrectionResponseAttributes = (SLOCorrectionResponseAttributes) o;
    return Objects.equals(this.category, slOCorrectionResponseAttributes.category) &&
        Objects.equals(this.creator, slOCorrectionResponseAttributes.creator) &&
        Objects.equals(this.description, slOCorrectionResponseAttributes.description) &&
        Objects.equals(this.end, slOCorrectionResponseAttributes.end) &&
        Objects.equals(this.sloId, slOCorrectionResponseAttributes.sloId) &&
        Objects.equals(this.start, slOCorrectionResponseAttributes.start) &&
        Objects.equals(this.timezone, slOCorrectionResponseAttributes.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, creator, description, end, sloId, start, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionResponseAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
