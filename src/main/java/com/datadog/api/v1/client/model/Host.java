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
import com.datadog.api.v1.client.model.HostMeta;
import com.datadog.api.v1.client.model.HostMetrics;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object representing a host.
 */
@ApiModel(description = "Object representing a host.")
@JsonPropertyOrder({
  Host.JSON_PROPERTY_ALIASES,
  Host.JSON_PROPERTY_APPS,
  Host.JSON_PROPERTY_AWS_NAME,
  Host.JSON_PROPERTY_HOST_NAME,
  Host.JSON_PROPERTY_ID,
  Host.JSON_PROPERTY_IS_MUTED,
  Host.JSON_PROPERTY_LAST_REPORTED_TIME,
  Host.JSON_PROPERTY_META,
  Host.JSON_PROPERTY_METRICS,
  Host.JSON_PROPERTY_MUTE_TIMEOUT,
  Host.JSON_PROPERTY_NAME,
  Host.JSON_PROPERTY_SOURCES,
  Host.JSON_PROPERTY_TAGS_BY_SOURCE,
  Host.JSON_PROPERTY_UP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Host {
  public static final String JSON_PROPERTY_ALIASES = "aliases";
  private List<String> aliases = null;

  public static final String JSON_PROPERTY_APPS = "apps";
  private List<String> apps = null;

  public static final String JSON_PROPERTY_AWS_NAME = "aws_name";
  private String awsName;

  public static final String JSON_PROPERTY_HOST_NAME = "host_name";
  private String hostName;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_IS_MUTED = "is_muted";
  private Boolean isMuted;

  public static final String JSON_PROPERTY_LAST_REPORTED_TIME = "last_reported_time";
  private Long lastReportedTime;

  public static final String JSON_PROPERTY_META = "meta";
  private HostMeta meta;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private HostMetrics metrics;

  public static final String JSON_PROPERTY_MUTE_TIMEOUT = "mute_timeout";
  private Long muteTimeout;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = null;

  public static final String JSON_PROPERTY_TAGS_BY_SOURCE = "tags_by_source";
  private Map<String, List<String>> tagsBySource = null;

  public static final String JSON_PROPERTY_UP = "up";
  private Boolean up;


  public Host aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public Host addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Host aliases collected by Datadog.
   * @return aliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host aliases collected by Datadog.")
  @JsonProperty(JSON_PROPERTY_ALIASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAliases() {
    return aliases;
  }


  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }


  public Host apps(List<String> apps) {
    this.apps = apps;
    return this;
  }

  public Host addAppsItem(String appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * The Datadog integrations reporting metrics for the host.
   * @return apps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Datadog integrations reporting metrics for the host.")
  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getApps() {
    return apps;
  }


  public void setApps(List<String> apps) {
    this.apps = apps;
  }


  public Host awsName(String awsName) {
    this.awsName = awsName;
    return this;
  }

   /**
   * AWS name of your host.
   * @return awsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mycoolhost-1", value = "AWS name of your host.")
  @JsonProperty(JSON_PROPERTY_AWS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAwsName() {
    return awsName;
  }


  public void setAwsName(String awsName) {
    this.awsName = awsName;
  }


  public Host hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * The host name.
   * @return hostName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "i-deadbeef", value = "The host name.")
  @JsonProperty(JSON_PROPERTY_HOST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostName() {
    return hostName;
  }


  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public Host id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The host ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456", value = "The host ID.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Host isMuted(Boolean isMuted) {
    this.isMuted = isMuted;
    return this;
  }

   /**
   * If a host is muted or unmuted.
   * @return isMuted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If a host is muted or unmuted.")
  @JsonProperty(JSON_PROPERTY_IS_MUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMuted() {
    return isMuted;
  }


  public void setIsMuted(Boolean isMuted) {
    this.isMuted = isMuted;
  }


  public Host lastReportedTime(Long lastReportedTime) {
    this.lastReportedTime = lastReportedTime;
    return this;
  }

   /**
   * Last time the host reported a metric data point.
   * @return lastReportedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1565000000", value = "Last time the host reported a metric data point.")
  @JsonProperty(JSON_PROPERTY_LAST_REPORTED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastReportedTime() {
    return lastReportedTime;
  }


  public void setLastReportedTime(Long lastReportedTime) {
    this.lastReportedTime = lastReportedTime;
  }


  public Host meta(HostMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HostMeta getMeta() {
    return meta;
  }


  public void setMeta(HostMeta meta) {
    this.meta = meta;
  }


  public Host metrics(HostMetrics metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HostMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(HostMetrics metrics) {
    this.metrics = metrics;
  }


  public Host muteTimeout(Long muteTimeout) {
    this.muteTimeout = muteTimeout;
    return this;
  }

   /**
   * Timeout of the mute applied to your host.
   * @return muteTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout of the mute applied to your host.")
  @JsonProperty(JSON_PROPERTY_MUTE_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMuteTimeout() {
    return muteTimeout;
  }


  public void setMuteTimeout(Long muteTimeout) {
    this.muteTimeout = muteTimeout;
  }


  public Host name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The host name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "i-hostname", value = "The host name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Host sources(List<String> sources) {
    this.sources = sources;
    return this;
  }

  public Host addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Source or cloud provider associated with your host.
   * @return sources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source or cloud provider associated with your host.")
  @JsonProperty(JSON_PROPERTY_SOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSources() {
    return sources;
  }


  public void setSources(List<String> sources) {
    this.sources = sources;
  }


  public Host tagsBySource(Map<String, List<String>> tagsBySource) {
    this.tagsBySource = tagsBySource;
    return this;
  }

  public Host putTagsBySourceItem(String key, List<String> tagsBySourceItem) {
    if (this.tagsBySource == null) {
      this.tagsBySource = new HashMap<>();
    }
    this.tagsBySource.put(key, tagsBySourceItem);
    return this;
  }

   /**
   * List of tags for each source (AWS, Datadog Agent, Chef..).
   * @return tagsBySource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tags for each source (AWS, Datadog Agent, Chef..).")
  @JsonProperty(JSON_PROPERTY_TAGS_BY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<String>> getTagsBySource() {
    return tagsBySource;
  }


  public void setTagsBySource(Map<String, List<String>> tagsBySource) {
    this.tagsBySource = tagsBySource;
  }


  public Host up(Boolean up) {
    this.up = up;
    return this;
  }

   /**
   * Displays UP when the expected metrics are received and displays &#x60;???&#x60; if no metrics are received.
   * @return up
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Displays UP when the expected metrics are received and displays `???` if no metrics are received.")
  @JsonProperty(JSON_PROPERTY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUp() {
    return up;
  }


  public void setUp(Boolean up) {
    this.up = up;
  }


  /**
   * Return true if this Host object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Host host = (Host) o;
    return Objects.equals(this.aliases, host.aliases) &&
        Objects.equals(this.apps, host.apps) &&
        Objects.equals(this.awsName, host.awsName) &&
        Objects.equals(this.hostName, host.hostName) &&
        Objects.equals(this.id, host.id) &&
        Objects.equals(this.isMuted, host.isMuted) &&
        Objects.equals(this.lastReportedTime, host.lastReportedTime) &&
        Objects.equals(this.meta, host.meta) &&
        Objects.equals(this.metrics, host.metrics) &&
        Objects.equals(this.muteTimeout, host.muteTimeout) &&
        Objects.equals(this.name, host.name) &&
        Objects.equals(this.sources, host.sources) &&
        Objects.equals(this.tagsBySource, host.tagsBySource) &&
        Objects.equals(this.up, host.up);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, apps, awsName, hostName, id, isMuted, lastReportedTime, meta, metrics, muteTimeout, name, sources, tagsBySource, up);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Host {\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    awsName: ").append(toIndentedString(awsName)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMuted: ").append(toIndentedString(isMuted)).append("\n");
    sb.append("    lastReportedTime: ").append(toIndentedString(lastReportedTime)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    muteTimeout: ").append(toIndentedString(muteTimeout)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    tagsBySource: ").append(toIndentedString(tagsBySource)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
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

