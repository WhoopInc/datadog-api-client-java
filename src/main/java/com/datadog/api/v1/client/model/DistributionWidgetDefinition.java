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
import com.datadog.api.v1.client.model.DistributionWidgetRequest;
import com.datadog.api.v1.client.model.WidgetLegendSize;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The Distribution visualization is another way of showing metrics aggregated across one or several tags, such as hosts. Unlike the heat map, a distribution graph’s x-axis is quantity rather than time.
 */
@ApiModel(description = "The Distribution visualization is another way of showing metrics aggregated across one or several tags, such as hosts. Unlike the heat map, a distribution graph’s x-axis is quantity rather than time.")
@JsonPropertyOrder({
  DistributionWidgetDefinition.JSON_PROPERTY_LEGEND_SIZE,
  DistributionWidgetDefinition.JSON_PROPERTY_REQUESTS,
  DistributionWidgetDefinition.JSON_PROPERTY_SHOW_LEGEND,
  DistributionWidgetDefinition.JSON_PROPERTY_TIME,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  DistributionWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  DistributionWidgetDefinition.JSON_PROPERTY_TYPE
})

public class DistributionWidgetDefinition implements WidgetDefinition {
  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private WidgetLegendSize legendSize;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<DistributionWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SHOW_LEGEND = "show_legend";
  private Boolean showLegend;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "distribution";


  public DistributionWidgetDefinition legendSize(WidgetLegendSize legendSize) {
    
    this.legendSize = legendSize;
    return this;
  }

   /**
   * Get legendSize
   * @return legendSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGEND_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetLegendSize getLegendSize() {
    return legendSize;
  }


  public void setLegendSize(WidgetLegendSize legendSize) {
    this.legendSize = legendSize;
  }


  public DistributionWidgetDefinition requests(List<DistributionWidgetRequest> requests) {
    
    this.requests = requests;
    return this;
  }

  public DistributionWidgetDefinition addRequestsItem(DistributionWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Array of one request object to display in the widget.  See the dedicated [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)  to learn how to build the &#x60;REQUEST_SCHEMA&#x60;.
   * @return requests
  **/
  @ApiModelProperty(required = true, value = "Array of one request object to display in the widget.  See the dedicated [Request JSON schema documentation](https://docs.datadoghq.com/dashboards/graphing_json/request_json)  to learn how to build the `REQUEST_SCHEMA`.")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DistributionWidgetRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<DistributionWidgetRequest> requests) {
    this.requests = requests;
  }


  public DistributionWidgetDefinition showLegend(Boolean showLegend) {
    
    this.showLegend = showLegend;
    return this;
  }

   /**
   * Whether or not to display the legend on this widget.
   * @return showLegend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not to display the legend on this widget.")
  @JsonProperty(JSON_PROPERTY_SHOW_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowLegend() {
    return showLegend;
  }


  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }


  public DistributionWidgetDefinition time(WidgetTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTime getTime() {
    return time;
  }


  public void setTime(WidgetTime time) {
    this.time = time;
  }


  public DistributionWidgetDefinition title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DistributionWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    
    this.titleAlign = titleAlign;
    return this;
  }

   /**
   * Get titleAlign
   * @return titleAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }


  public void setTitleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }


  public DistributionWidgetDefinition titleSize(String titleSize) {
    
    this.titleSize = titleSize;
    return this;
  }

   /**
   * Size of the title.
   * @return titleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitleSize() {
    return titleSize;
  }


  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }


   /**
   * Type of the widget.
   * @return type
  **/
  @ApiModelProperty(example = "distribution", required = true, value = "Type of the widget.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionWidgetDefinition distributionWidgetDefinition = (DistributionWidgetDefinition) o;
    return Objects.equals(this.legendSize, distributionWidgetDefinition.legendSize) &&
        Objects.equals(this.requests, distributionWidgetDefinition.requests) &&
        Objects.equals(this.showLegend, distributionWidgetDefinition.showLegend) &&
        Objects.equals(this.time, distributionWidgetDefinition.time) &&
        Objects.equals(this.title, distributionWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, distributionWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, distributionWidgetDefinition.titleSize) &&
        Objects.equals(this.type, distributionWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legendSize, requests, showLegend, time, title, titleAlign, titleSize, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionWidgetDefinition {\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
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

