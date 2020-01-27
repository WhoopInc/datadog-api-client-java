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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A &#x60;monitor&#x60; based SLO history for either &#x60;groups&#x60; or &#x60;monitors&#x60; depending on the type of &#x60;monitor&#x60; SLO. Ex. &#x60;single-monitor&#x60; these represent &#x60;groups&#x60;     vs &#x60;multi-monitor&#x60; which represents individual monitor&#39;s overall history
 */
@ApiModel(description = "A `monitor` based SLO history for either `groups` or `monitors` depending on the type of `monitor` SLO. Ex. `single-monitor` these represent `groups`     vs `multi-monitor` which represents individual monitor's overall history")
@JsonPropertyOrder({
  HistoryServiceLevelObjectiveGroups.JSON_PROPERTY_HISTORY,
  HistoryServiceLevelObjectiveGroups.JSON_PROPERTY_NAME,
  HistoryServiceLevelObjectiveGroups.JSON_PROPERTY_PRECISION,
  HistoryServiceLevelObjectiveGroups.JSON_PROPERTY_PREVIEW,
  HistoryServiceLevelObjectiveGroups.JSON_PROPERTY_SPAN_PRECISION,
  HistoryServiceLevelObjectiveGroups.JSON_PROPERTY_UPTIME
})

public class HistoryServiceLevelObjectiveGroups {
  public static final String JSON_PROPERTY_HISTORY = "history";
  private List<List<Double>> history = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRECISION = "precision";
  private Map<String, Double> precision = null;

  public static final String JSON_PROPERTY_PREVIEW = "preview";
  private Boolean preview;

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private Double spanPrecision;

  public static final String JSON_PROPERTY_UPTIME = "uptime";
  private Double uptime;


  public HistoryServiceLevelObjectiveGroups history(List<List<Double>> history) {
    
    this.history = history;
    return this;
  }

  public HistoryServiceLevelObjectiveGroups addHistoryItem(List<Double> historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * For &#x60;monitor&#x60; based SLOs, this includes the aggregated history uptime time series.
   * @return history
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For `monitor` based SLOs, this includes the aggregated history uptime time series.")
  @JsonProperty(JSON_PROPERTY_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<List<Double>> getHistory() {
    return history;
  }


  public void setHistory(List<List<Double>> history) {
    this.history = history;
  }


  public HistoryServiceLevelObjectiveGroups name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * For single-monitor &#x60;monitor&#x60; based SLOs this is the &#x60;monitor group&#x60; name For multi-monitor &#x60;monitor&#x60; based SLOs this is the &#x60;monitor&#x60; name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For single-monitor `monitor` based SLOs this is the `monitor group` name For multi-monitor `monitor` based SLOs this is the `monitor` name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public HistoryServiceLevelObjectiveGroups precision(Map<String, Double> precision) {
    
    this.precision = precision;
    return this;
  }

  public HistoryServiceLevelObjectiveGroups putPrecisionItem(String key, Double precisionItem) {
    if (this.precision == null) {
      this.precision = new HashMap<>();
    }
    this.precision.put(key, precisionItem);
    return this;
  }

   /**
   * A mapping of threshold &#x60;timeframe&#x60; to number of accurate decimals, regardless of the from &amp;&amp; to timestamp.
   * @return precision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A mapping of threshold `timeframe` to number of accurate decimals, regardless of the from && to timestamp.")
  @JsonProperty(JSON_PROPERTY_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Double> getPrecision() {
    return precision;
  }


  public void setPrecision(Map<String, Double> precision) {
    this.precision = precision;
  }


  public HistoryServiceLevelObjectiveGroups preview(Boolean preview) {
    
    this.preview = preview;
    return this;
  }

   /**
   * For &#x60;monitor&#x60; based SLOs when &#x60;true&#x60; this indicates that a replay is in progress to give an accurate uptime calculation.
   * @return preview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For `monitor` based SLOs when `true` this indicates that a replay is in progress to give an accurate uptime calculation.")
  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPreview() {
    return preview;
  }


  public void setPreview(Boolean preview) {
    this.preview = preview;
  }


  public HistoryServiceLevelObjectiveGroups spanPrecision(Double spanPrecision) {
    
    this.spanPrecision = spanPrecision;
    return this;
  }

   /**
   * The amount of decimal places the uptime value is accurate to for the given from and to timestamp.
   * @return spanPrecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of decimal places the uptime value is accurate to for the given from and to timestamp.")
  @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSpanPrecision() {
    return spanPrecision;
  }


  public void setSpanPrecision(Double spanPrecision) {
    this.spanPrecision = spanPrecision;
  }


  public HistoryServiceLevelObjectiveGroups uptime(Double uptime) {
    
    this.uptime = uptime;
    return this;
  }

   /**
   * The uptime value of the SLO history window.
   * @return uptime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The uptime value of the SLO history window.")
  @JsonProperty(JSON_PROPERTY_UPTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getUptime() {
    return uptime;
  }


  public void setUptime(Double uptime) {
    this.uptime = uptime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryServiceLevelObjectiveGroups historyServiceLevelObjectiveGroups = (HistoryServiceLevelObjectiveGroups) o;
    return Objects.equals(this.history, historyServiceLevelObjectiveGroups.history) &&
        Objects.equals(this.name, historyServiceLevelObjectiveGroups.name) &&
        Objects.equals(this.precision, historyServiceLevelObjectiveGroups.precision) &&
        Objects.equals(this.preview, historyServiceLevelObjectiveGroups.preview) &&
        Objects.equals(this.spanPrecision, historyServiceLevelObjectiveGroups.spanPrecision) &&
        Objects.equals(this.uptime, historyServiceLevelObjectiveGroups.uptime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, name, precision, preview, spanPrecision, uptime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryServiceLevelObjectiveGroups {\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    spanPrecision: ").append(toIndentedString(spanPrecision)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
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

