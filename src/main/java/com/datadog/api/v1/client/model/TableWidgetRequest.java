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
import com.datadog.api.v1.client.model.EventQueryDefinition;
import com.datadog.api.v1.client.model.LogQueryDefinition;
import com.datadog.api.v1.client.model.ProcessQueryDefinition;
import com.datadog.api.v1.client.model.WidgetAggregator;
import com.datadog.api.v1.client.model.WidgetConditionalFormat;
import com.datadog.api.v1.client.model.WidgetSort;
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
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  TableWidgetRequest.JSON_PROPERTY_AGGREGATOR,
  TableWidgetRequest.JSON_PROPERTY_ALIAS,
  TableWidgetRequest.JSON_PROPERTY_APM_QUERY,
  TableWidgetRequest.JSON_PROPERTY_CONDITIONAL_FORMATS,
  TableWidgetRequest.JSON_PROPERTY_EVENT_QUERY,
  TableWidgetRequest.JSON_PROPERTY_LIMIT,
  TableWidgetRequest.JSON_PROPERTY_LOG_QUERY,
  TableWidgetRequest.JSON_PROPERTY_NETWORK_QUERY,
  TableWidgetRequest.JSON_PROPERTY_ORDER,
  TableWidgetRequest.JSON_PROPERTY_PROCESS_QUERY,
  TableWidgetRequest.JSON_PROPERTY_Q,
  TableWidgetRequest.JSON_PROPERTY_RUM_QUERY
})

public class TableWidgetRequest {
  public static final String JSON_PROPERTY_AGGREGATOR = "aggregator";
  private WidgetAggregator aggregator;

  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private EventQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_LOG_QUERY = "log_query";
  private LogQueryDefinition logQuery;

  public static final String JSON_PROPERTY_NETWORK_QUERY = "network_query";
  private LogQueryDefinition networkQuery;

  public static final String JSON_PROPERTY_ORDER = "order";
  private WidgetSort order;

  public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
  private ProcessQueryDefinition processQuery;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;


  public TableWidgetRequest aggregator(WidgetAggregator aggregator) {
    
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


  public TableWidgetRequest alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * The column name (defaults to the metric name).
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The column name (defaults to the metric name).")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public TableWidgetRequest apmQuery(LogQueryDefinition apmQuery) {
    
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


  public TableWidgetRequest conditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    
    this.conditionalFormats = conditionalFormats;
    return this;
  }

  public TableWidgetRequest addConditionalFormatsItem(WidgetConditionalFormat conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    return this;
  }

   /**
   * TODO.
   * @return conditionalFormats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WidgetConditionalFormat> getConditionalFormats() {
    return conditionalFormats;
  }


  public void setConditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
  }


  public TableWidgetRequest eventQuery(EventQueryDefinition eventQuery) {
    
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


  public TableWidgetRequest limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * For metric queries, the number of lines to show in the table. Only one request should have this property.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For metric queries, the number of lines to show in the table. Only one request should have this property.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public TableWidgetRequest logQuery(LogQueryDefinition logQuery) {
    
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


  public TableWidgetRequest networkQuery(LogQueryDefinition networkQuery) {
    
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


  public TableWidgetRequest order(WidgetSort order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetSort getOrder() {
    return order;
  }


  public void setOrder(WidgetSort order) {
    this.order = order;
  }


  public TableWidgetRequest processQuery(ProcessQueryDefinition processQuery) {
    
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


  public TableWidgetRequest q(String q) {
    
    this.q = q;
    return this;
  }

   /**
   * TODO.
   * @return q
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    this.q = q;
  }


  public TableWidgetRequest rumQuery(LogQueryDefinition rumQuery) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetRequest tableWidgetRequest = (TableWidgetRequest) o;
    return Objects.equals(this.aggregator, tableWidgetRequest.aggregator) &&
        Objects.equals(this.alias, tableWidgetRequest.alias) &&
        Objects.equals(this.apmQuery, tableWidgetRequest.apmQuery) &&
        Objects.equals(this.conditionalFormats, tableWidgetRequest.conditionalFormats) &&
        Objects.equals(this.eventQuery, tableWidgetRequest.eventQuery) &&
        Objects.equals(this.limit, tableWidgetRequest.limit) &&
        Objects.equals(this.logQuery, tableWidgetRequest.logQuery) &&
        Objects.equals(this.networkQuery, tableWidgetRequest.networkQuery) &&
        Objects.equals(this.order, tableWidgetRequest.order) &&
        Objects.equals(this.processQuery, tableWidgetRequest.processQuery) &&
        Objects.equals(this.q, tableWidgetRequest.q) &&
        Objects.equals(this.rumQuery, tableWidgetRequest.rumQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregator, alias, apmQuery, conditionalFormats, eventQuery, limit, logQuery, networkQuery, order, processQuery, q, rumQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetRequest {\n");
    sb.append("    aggregator: ").append(toIndentedString(aggregator)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    logQuery: ").append(toIndentedString(logQuery)).append("\n");
    sb.append("    networkQuery: ").append(toIndentedString(networkQuery)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
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
