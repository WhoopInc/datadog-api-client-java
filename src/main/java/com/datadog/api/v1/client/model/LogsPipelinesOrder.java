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
 * Object containing the ordered list of pipeline IDs.
 */
@ApiModel(description = "Object containing the ordered list of pipeline IDs.")
@JsonPropertyOrder({
  LogsPipelinesOrder.JSON_PROPERTY_PIPELINE_IDS
})

public class LogsPipelinesOrder {
  public static final String JSON_PROPERTY_PIPELINE_IDS = "pipeline_ids";
  private List<String> pipelineIds = new ArrayList<>();


  public LogsPipelinesOrder pipelineIds(List<String> pipelineIds) {
    
    this.pipelineIds = pipelineIds;
    return this;
  }

  public LogsPipelinesOrder addPipelineIdsItem(String pipelineIdsItem) {
    this.pipelineIds.add(pipelineIdsItem);
    return this;
  }

   /**
   * Ordered Array of &#x60;&lt;PIPELINE_ID&gt;&#x60; strings, the order of pipeline IDs in the array define the overall Pipelines order for Datadog.
   * @return pipelineIds
  **/
  @ApiModelProperty(required = true, value = "Ordered Array of `<PIPELINE_ID>` strings, the order of pipeline IDs in the array define the overall Pipelines order for Datadog.")
  @JsonProperty(JSON_PROPERTY_PIPELINE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPipelineIds() {
    return pipelineIds;
  }


  public void setPipelineIds(List<String> pipelineIds) {
    this.pipelineIds = pipelineIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsPipelinesOrder logsPipelinesOrder = (LogsPipelinesOrder) o;
    return Objects.equals(this.pipelineIds, logsPipelinesOrder.pipelineIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsPipelinesOrder {\n");
    sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
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
