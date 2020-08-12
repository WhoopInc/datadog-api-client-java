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
import com.datadog.api.v1.client.model.EventQueryDefinition;
import com.datadog.api.v1.client.model.LogQueryDefinition;
import com.datadog.api.v1.client.model.ProcessQueryDefinition;
import com.datadog.api.v1.client.model.WidgetAggregator;
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
 * Updated scatter plot.
 */
@ApiModel(description = "Updated scatter plot.")
@JsonPropertyOrder({
  ScatterPlotRequest.JSON_PROPERTY_AGGREGATOR,
  ScatterPlotRequest.JSON_PROPERTY_APM_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_EVENT_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_LOG_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_NETWORK_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_PROCESS_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_Q,
  ScatterPlotRequest.JSON_PROPERTY_RUM_QUERY,
  ScatterPlotRequest.JSON_PROPERTY_SECURITY_QUERY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScatterPlotRequest {
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private WidgetAggregator aggregator;

  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private EventQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

  public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
  private ProcessQueryDefinition processQuery;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_SECURITY_QUERY = "security_query";
  private LogQueryDefinition securityQuery;


  public ScatterPlotRequest aggregator(WidgetAggregator aggregator) {
    this.aggregator = aggregator;
    return this;
  }

   /**
   * Get aggregator
   * @return aggregator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGGREGATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetAggregator getAggregator() {
    return aggregator;
  }


  public void setAggregator(WidgetAggregator aggregator) {
    this.aggregator = aggregator;
  }


  public ScatterPlotRequest apmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
    return this;
  }

   /**
   * Get apmQuery
   * @return apmQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getApmQuery() {
    return apmQuery;
  }


  public void setApmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
  }


  public ScatterPlotRequest eventQuery(EventQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
    return this;
  }

   /**
   * Get eventQuery
   * @return eventQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventQueryDefinition getEventQuery() {
    return eventQuery;
  }


  public void setEventQuery(EventQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
  }


  public ScatterPlotRequest logQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
    return this;
  }

   /**
   * Get logQuery
   * @return logQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOG_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getLogQuery() {
    return logQuery;
  }


  public void setLogQuery(LogQueryDefinition logQuery) {
    this.logQuery = logQuery;
  }


  public ScatterPlotRequest networkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
    return this;
  }

   /**
   * Get networkQuery
   * @return networkQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NETWORK_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getNetworkQuery() {
    return networkQuery;
  }


  public void setNetworkQuery(LogQueryDefinition networkQuery) {
    this.networkQuery = networkQuery;
  }


  public ScatterPlotRequest processQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
    return this;
  }

   /**
   * Get processQuery
   * @return processQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessQueryDefinition getProcessQuery() {
    return processQuery;
  }


  public void setProcessQuery(ProcessQueryDefinition processQuery) {
    this.processQuery = processQuery;
  }


  public ScatterPlotRequest q(String q) {
    this.q = q;
    return this;
  }

   /**
   * Query definition.
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Query definition.")
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public ScatterPlotRequest rumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    return this;
  }

   /**
   * Get rumQuery
   * @return rumQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUM_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getRumQuery() {
    return rumQuery;
  }


  public void setRumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
  }


  public ScatterPlotRequest securityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
    return this;
  }

   /**
   * Get securityQuery
   * @return securityQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogQueryDefinition getSecurityQuery() {
    return securityQuery;
  }


  public void setSecurityQuery(LogQueryDefinition securityQuery) {
    this.securityQuery = securityQuery;
  }


  /**
   * Return true if this ScatterPlotRequest object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterPlotRequest scatterPlotRequest = (ScatterPlotRequest) o;
    return Objects.equals(this.aggregator, scatterPlotRequest.aggregator) &&
        Objects.equals(this.apmQuery, scatterPlotRequest.apmQuery) &&
        Objects.equals(this.eventQuery, scatterPlotRequest.eventQuery) &&
        Objects.equals(this.logQuery, scatterPlotRequest.logQuery) &&
        Objects.equals(this.networkQuery, scatterPlotRequest.networkQuery) &&
        Objects.equals(this.processQuery, scatterPlotRequest.processQuery) &&
        Objects.equals(this.q, scatterPlotRequest.q) &&
        Objects.equals(this.rumQuery, scatterPlotRequest.rumQuery) &&
        Objects.equals(this.securityQuery, scatterPlotRequest.securityQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregator, apmQuery, eventQuery, logQuery, networkQuery, processQuery, q, rumQuery, securityQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterPlotRequest {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
    sb.append("    securityQuery: ").append(toIndentedString(securityQuery)).append("\n");
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
