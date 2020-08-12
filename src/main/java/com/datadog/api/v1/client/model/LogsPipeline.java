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
import com.datadog.api.v1.client.model.LogsFilter;
import com.datadog.api.v1.client.model.LogsProcessor;
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
 * Pipelines and processors operate on incoming logs, parsing and transforming them into structured attributes for easier querying.  **Note**: These endpoints are only available for admin users. Make sure to use an application key created by an admin.
 */
@ApiModel(description = "Pipelines and processors operate on incoming logs, parsing and transforming them into structured attributes for easier querying.  **Note**: These endpoints are only available for admin users. Make sure to use an application key created by an admin.")
@JsonPropertyOrder({
  LogsPipeline.JSON_PROPERTY_FILTER,
  LogsPipeline.JSON_PROPERTY_ID,
  LogsPipeline.JSON_PROPERTY_IS_ENABLED,
  LogsPipeline.JSON_PROPERTY_IS_READ_ONLY,
  LogsPipeline.JSON_PROPERTY_NAME,
  LogsPipeline.JSON_PROPERTY_PROCESSORS,
  LogsPipeline.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsPipeline {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsFilter filter;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_IS_READ_ONLY = "is_read_only";
  private Boolean isReadOnly;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROCESSORS = "processors";
  private List<LogsProcessor> processors = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;


  public LogsPipeline filter(LogsFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogsFilter getFilter() {
    return filter;
  }


  public void setFilter(LogsFilter filter) {
    this.filter = filter;
  }


   /**
   * ID of the pipeline.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the pipeline.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public LogsPipeline isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether or not the pipeline is enabled.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the pipeline is enabled.")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


   /**
   * Whether or not the pipeline can be edited.
   * @return isReadOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the pipeline can be edited.")
  @JsonProperty(JSON_PROPERTY_IS_READ_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReadOnly() {
    return isReadOnly;
  }




  public LogsPipeline name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the pipeline.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the pipeline.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LogsPipeline processors(List<LogsProcessor> processors) {
    this.processors = processors;
    return this;
  }

  public LogsPipeline addProcessorsItem(LogsProcessor processorsItem) {
    if (this.processors == null) {
      this.processors = new ArrayList<>();
    }
    this.processors.add(processorsItem);
    return this;
  }

   /**
   * Ordered list of processors in this pipeline.
   * @return processors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ordered list of processors in this pipeline.")
  @JsonProperty(JSON_PROPERTY_PROCESSORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LogsProcessor> getProcessors() {
    return processors;
  }


  public void setProcessors(List<LogsProcessor> processors) {
    this.processors = processors;
  }


   /**
   * Type of pipeline.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pipeline", value = "Type of pipeline.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  /**
   * Return true if this LogsPipeline object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsPipeline logsPipeline = (LogsPipeline) o;
    return Objects.equals(this.filter, logsPipeline.filter) &&
        Objects.equals(this.id, logsPipeline.id) &&
        Objects.equals(this.isEnabled, logsPipeline.isEnabled) &&
        Objects.equals(this.isReadOnly, logsPipeline.isReadOnly) &&
        Objects.equals(this.name, logsPipeline.name) &&
        Objects.equals(this.processors, logsPipeline.processors) &&
        Objects.equals(this.type, logsPipeline.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, id, isEnabled, isReadOnly, name, processors, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsPipeline {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
