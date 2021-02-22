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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The duration in days after which a learned value is forgotten.
 */
public enum SecurityMonitoringRuleNewValueOptionsForgetAfter {
  
  ONE_DAY(1),
  
  TWO_DAYS(2),
  
  ONE_WEEK(7),
  
  TWO_WEEKS(14),
  
  THREE_WEEKS(21),
  
  FOUR_WEEKS(28);

  private Integer value;

  SecurityMonitoringRuleNewValueOptionsForgetAfter(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SecurityMonitoringRuleNewValueOptionsForgetAfter fromValue(Integer value) {
    for (SecurityMonitoringRuleNewValueOptionsForgetAfter b : SecurityMonitoringRuleNewValueOptionsForgetAfter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

