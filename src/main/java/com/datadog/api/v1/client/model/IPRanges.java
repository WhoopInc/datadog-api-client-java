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
import com.datadog.api.v1.client.model.IPPrefixesAPI;
import com.datadog.api.v1.client.model.IPPrefixesAPM;
import com.datadog.api.v1.client.model.IPPrefixesAgents;
import com.datadog.api.v1.client.model.IPPrefixesLogs;
import com.datadog.api.v1.client.model.IPPrefixesProcess;
import com.datadog.api.v1.client.model.IPPrefixesSynthetics;
import com.datadog.api.v1.client.model.IPPrefixesWebhooks;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  IPRanges.JSON_PROPERTY_AGENTS,
  IPRanges.JSON_PROPERTY_API,
  IPRanges.JSON_PROPERTY_APM,
  IPRanges.JSON_PROPERTY_LOGS,
  IPRanges.JSON_PROPERTY_MODIFIED,
  IPRanges.JSON_PROPERTY_PROCESS,
  IPRanges.JSON_PROPERTY_SYNTHETICS,
  IPRanges.JSON_PROPERTY_VERSION,
  IPRanges.JSON_PROPERTY_WEBHOOKS
})

public class IPRanges {
  public static final String JSON_PROPERTY_AGENTS = "agents";
  private IPPrefixesAgents agents;

  public static final String JSON_PROPERTY_API = "api";
  private IPPrefixesAPI api;

  public static final String JSON_PROPERTY_APM = "apm";
  private IPPrefixesAPM apm;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private IPPrefixesLogs logs;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private String modified;

  public static final String JSON_PROPERTY_PROCESS = "process";
  private IPPrefixesProcess process;

  public static final String JSON_PROPERTY_SYNTHETICS = "synthetics";
  private IPPrefixesSynthetics synthetics;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_WEBHOOKS = "webhooks";
  private IPPrefixesWebhooks webhooks;


  public IPRanges agents(IPPrefixesAgents agents) {
    
    this.agents = agents;
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPPrefixesAgents getAgents() {
    return agents;
  }


  public void setAgents(IPPrefixesAgents agents) {
    this.agents = agents;
  }


  public IPRanges api(IPPrefixesAPI api) {
    
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_API)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPPrefixesAPI getApi() {
    return api;
  }


  public void setApi(IPPrefixesAPI api) {
    this.api = api;
  }


  public IPRanges apm(IPPrefixesAPM apm) {
    
    this.apm = apm;
    return this;
  }

   /**
   * Get apm
   * @return apm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPPrefixesAPM getApm() {
    return apm;
  }


  public void setApm(IPPrefixesAPM apm) {
    this.apm = apm;
  }


  public IPRanges logs(IPPrefixesLogs logs) {
    
    this.logs = logs;
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPPrefixesLogs getLogs() {
    return logs;
  }


  public void setLogs(IPPrefixesLogs logs) {
    this.logs = logs;
  }


  public IPRanges modified(String modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Date when last updated, in the form &#x60;YYYY-MM-DD-hh-mm-ss&#x60;.
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-10-31-20-00-00", value = "Date when last updated, in the form `YYYY-MM-DD-hh-mm-ss`.")
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModified() {
    return modified;
  }


  public void setModified(String modified) {
    this.modified = modified;
  }


  public IPRanges process(IPPrefixesProcess process) {
    
    this.process = process;
    return this;
  }

   /**
   * Get process
   * @return process
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPPrefixesProcess getProcess() {
    return process;
  }


  public void setProcess(IPPrefixesProcess process) {
    this.process = process;
  }


  public IPRanges synthetics(IPPrefixesSynthetics synthetics) {
    
    this.synthetics = synthetics;
    return this;
  }

   /**
   * Get synthetics
   * @return synthetics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYNTHETICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPPrefixesSynthetics getSynthetics() {
    return synthetics;
  }


  public void setSynthetics(IPPrefixesSynthetics synthetics) {
    this.synthetics = synthetics;
  }


  public IPRanges version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the IP list.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11", value = "Version of the IP list.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }


  public IPRanges webhooks(IPPrefixesWebhooks webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IPPrefixesWebhooks getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(IPPrefixesWebhooks webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPRanges ipRanges = (IPRanges) o;
    return Objects.equals(this.agents, ipRanges.agents) &&
        Objects.equals(this.api, ipRanges.api) &&
        Objects.equals(this.apm, ipRanges.apm) &&
        Objects.equals(this.logs, ipRanges.logs) &&
        Objects.equals(this.modified, ipRanges.modified) &&
        Objects.equals(this.process, ipRanges.process) &&
        Objects.equals(this.synthetics, ipRanges.synthetics) &&
        Objects.equals(this.version, ipRanges.version) &&
        Objects.equals(this.webhooks, ipRanges.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, api, apm, logs, modified, process, synthetics, version, webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPRanges {\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    apm: ").append(toIndentedString(apm)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    process: ").append(toIndentedString(process)).append("\n");
    sb.append("    synthetics: ").append(toIndentedString(synthetics)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
