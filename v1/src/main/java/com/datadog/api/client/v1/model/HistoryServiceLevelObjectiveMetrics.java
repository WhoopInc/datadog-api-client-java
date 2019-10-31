/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.client.v1.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.client.v1.model.HistoryServiceLevelObjectiveMetricsSeries;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A &#x60;metric&#x60; based SLO history response.
 */
@ApiModel(description = "A `metric` based SLO history response.")
@JsonPropertyOrder({
  HistoryServiceLevelObjectiveMetrics.JSON_PROPERTY_DENOMINATOR,
  HistoryServiceLevelObjectiveMetrics.JSON_PROPERTY_INTERVAL,
  HistoryServiceLevelObjectiveMetrics.JSON_PROPERTY_MESSAGE,
  HistoryServiceLevelObjectiveMetrics.JSON_PROPERTY_NUMERATOR,
  HistoryServiceLevelObjectiveMetrics.JSON_PROPERTY_QUERY,
  HistoryServiceLevelObjectiveMetrics.JSON_PROPERTY_RES_TYPE,
  HistoryServiceLevelObjectiveMetrics.JSON_PROPERTY_RESP_VERSION
})

public class HistoryServiceLevelObjectiveMetrics {
  public static final String JSON_PROPERTY_DENOMINATOR = "denominator";
  private HistoryServiceLevelObjectiveMetricsSeries denominator;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Integer interval;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NUMERATOR = "numerator";
  private HistoryServiceLevelObjectiveMetricsSeries numerator;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RES_TYPE = "res_type";
  private String resType;

  public static final String JSON_PROPERTY_RESP_VERSION = "resp_version";
  private Integer respVersion;


  public HistoryServiceLevelObjectiveMetrics denominator(HistoryServiceLevelObjectiveMetricsSeries denominator) {
    
    this.denominator = denominator;
    return this;
  }

   /**
   * Get denominator
   * @return denominator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DENOMINATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryServiceLevelObjectiveMetricsSeries getDenominator() {
    return denominator;
  }



  public void setDenominator(HistoryServiceLevelObjectiveMetricsSeries denominator) {
    this.denominator = denominator;
  }


  public HistoryServiceLevelObjectiveMetrics interval(Integer interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * The aggregated query interval for the series data. It&#39;s implicit based on the query time window.
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aggregated query interval for the series data. It's implicit based on the query time window.")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInterval() {
    return interval;
  }



  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  public HistoryServiceLevelObjectiveMetrics message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Optional message if there are specific query issues/warnings.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional message if there are specific query issues/warnings.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }



  public void setMessage(String message) {
    this.message = message;
  }


  public HistoryServiceLevelObjectiveMetrics numerator(HistoryServiceLevelObjectiveMetricsSeries numerator) {
    
    this.numerator = numerator;
    return this;
  }

   /**
   * Get numerator
   * @return numerator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryServiceLevelObjectiveMetricsSeries getNumerator() {
    return numerator;
  }



  public void setNumerator(HistoryServiceLevelObjectiveMetricsSeries numerator) {
    this.numerator = numerator;
  }


  public HistoryServiceLevelObjectiveMetrics query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * The combined numerator &amp;&amp; denominator query CSV.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The combined numerator && denominator query CSV.")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }



  public void setQuery(String query) {
    this.query = query;
  }


  public HistoryServiceLevelObjectiveMetrics resType(String resType) {
    
    this.resType = resType;
    return this;
  }

   /**
   * The series result type. This mimics &#x60;batch_query&#x60; response type
   * @return resType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The series result type. This mimics `batch_query` response type")
  @JsonProperty(JSON_PROPERTY_RES_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResType() {
    return resType;
  }



  public void setResType(String resType) {
    this.resType = resType;
  }


  public HistoryServiceLevelObjectiveMetrics respVersion(Integer respVersion) {
    
    this.respVersion = respVersion;
    return this;
  }

   /**
   * The series response version type. This mimics &#x60;batch_query&#x60; response type
   * @return respVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The series response version type. This mimics `batch_query` response type")
  @JsonProperty(JSON_PROPERTY_RESP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRespVersion() {
    return respVersion;
  }



  public void setRespVersion(Integer respVersion) {
    this.respVersion = respVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryServiceLevelObjectiveMetrics historyServiceLevelObjectiveMetrics = (HistoryServiceLevelObjectiveMetrics) o;
    return Objects.equals(this.denominator, historyServiceLevelObjectiveMetrics.denominator) &&
        Objects.equals(this.interval, historyServiceLevelObjectiveMetrics.interval) &&
        Objects.equals(this.message, historyServiceLevelObjectiveMetrics.message) &&
        Objects.equals(this.numerator, historyServiceLevelObjectiveMetrics.numerator) &&
        Objects.equals(this.query, historyServiceLevelObjectiveMetrics.query) &&
        Objects.equals(this.resType, historyServiceLevelObjectiveMetrics.resType) &&
        Objects.equals(this.respVersion, historyServiceLevelObjectiveMetrics.respVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominator, interval, message, numerator, query, resType, respVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryServiceLevelObjectiveMetrics {\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    resType: ").append(toIndentedString(resType)).append("\n");
    sb.append("    respVersion: ").append(toIndentedString(respVersion)).append("\n");
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
