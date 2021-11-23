/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** The Agent rule. */
@ApiModel(description = "The Agent rule.")
@JsonPropertyOrder({
  SecurityMonitoringRuntimeAgentRule.JSON_PROPERTY_AGENT_RULE_ID,
  SecurityMonitoringRuntimeAgentRule.JSON_PROPERTY_EXPRESSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringRuntimeAgentRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGENT_RULE_ID = "agentRuleId";
  private String agentRuleId;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public SecurityMonitoringRuntimeAgentRule agentRuleId(String agentRuleId) {
    this.agentRuleId = agentRuleId;
    return this;
  }

  /**
   * The Agent rule ID. Must be unique within the rule.
   *
   * @return agentRuleId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "etc_shadow",
      value = "The Agent rule ID. Must be unique within the rule.")
  @JsonProperty(JSON_PROPERTY_AGENT_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAgentRuleId() {
    return agentRuleId;
  }

  public void setAgentRuleId(String agentRuleId) {
    this.agentRuleId = agentRuleId;
  }

  public SecurityMonitoringRuntimeAgentRule expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * A Runtime Security expression determines what activity should be collected by the Datadog
   * Agent. These logical expressions can use predefined operators and attributes. Tags cannot be
   * used in Runtime Security expressions. Instead, allow or deny based on tags under the advanced
   * option.
   *
   * @return expression
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "A Runtime Security expression determines what activity should be collected by the"
              + " Datadog Agent. These logical expressions can use predefined operators and"
              + " attributes. Tags cannot be used in Runtime Security expressions. Instead, allow"
              + " or deny based on tags under the advanced option.")
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  /** Return true if this SecurityMonitoringRuntimeAgentRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuntimeAgentRule securityMonitoringRuntimeAgentRule =
        (SecurityMonitoringRuntimeAgentRule) o;
    return Objects.equals(this.agentRuleId, securityMonitoringRuntimeAgentRule.agentRuleId)
        && Objects.equals(this.expression, securityMonitoringRuntimeAgentRule.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentRuleId, expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuntimeAgentRule {\n");
    sb.append("    agentRuleId: ").append(toIndentedString(agentRuleId)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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