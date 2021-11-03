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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of a notebook &#x60;log_stream&#x60; cell. */
@ApiModel(description = "The attributes of a notebook `log_stream` cell.")
@JsonPropertyOrder({
  NotebookLogStreamCellAttributes.JSON_PROPERTY_DEFINITION,
  NotebookLogStreamCellAttributes.JSON_PROPERTY_GRAPH_SIZE,
  NotebookLogStreamCellAttributes.JSON_PROPERTY_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotebookLogStreamCellAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private LogStreamWidgetDefinition definition;

  public static final String JSON_PROPERTY_GRAPH_SIZE = "graph_size";
  private NotebookGraphSize graphSize;

  public static final String JSON_PROPERTY_TIME = "time";
  private JsonNullable<NotebookCellTime> time = JsonNullable.<NotebookCellTime>undefined();

  public NotebookLogStreamCellAttributes() {}

  @JsonCreator
  public NotebookLogStreamCellAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          LogStreamWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
  }

  public NotebookLogStreamCellAttributes definition(LogStreamWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * Get definition
   *
   * @return definition
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogStreamWidgetDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(LogStreamWidgetDefinition definition) {
    this.definition = definition;
  }

  public NotebookLogStreamCellAttributes graphSize(NotebookGraphSize graphSize) {
    this.graphSize = graphSize;
    this.unparsed |= !graphSize.isValid();
    return this;
  }

  /**
   * Get graphSize
   *
   * @return graphSize
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GRAPH_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookGraphSize getGraphSize() {
    return graphSize;
  }

  public void setGraphSize(NotebookGraphSize graphSize) {
    if (!graphSize.isValid()) {
      this.unparsed = true;
    }
    this.graphSize = graphSize;
  }

  public NotebookLogStreamCellAttributes time(NotebookCellTime time) {
    this.time = JsonNullable.<NotebookCellTime>of(time);
    return this;
  }

  /**
   * Get time
   *
   * @return time
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore
  public NotebookCellTime getTime() {
    return time.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NotebookCellTime> getTime_JsonNullable() {
    return time;
  }

  @JsonProperty(JSON_PROPERTY_TIME)
  public void setTime_JsonNullable(JsonNullable<NotebookCellTime> time) {
    this.time = time;
  }

  public void setTime(NotebookCellTime time) {
    this.time = JsonNullable.<NotebookCellTime>of(time);
  }

  /** Return true if this NotebookLogStreamCellAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookLogStreamCellAttributes notebookLogStreamCellAttributes =
        (NotebookLogStreamCellAttributes) o;
    return Objects.equals(this.definition, notebookLogStreamCellAttributes.definition)
        && Objects.equals(this.graphSize, notebookLogStreamCellAttributes.graphSize)
        && Objects.equals(this.time, notebookLogStreamCellAttributes.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, graphSize, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookLogStreamCellAttributes {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    graphSize: ").append(toIndentedString(graphSize)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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