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
 * AWS account ID and Lambda ARN.
 */
@ApiModel(description = "AWS account ID and Lambda ARN.")
@JsonPropertyOrder({
  AWSAccountAndLambdaRequest.JSON_PROPERTY_ACCOUNT_ID,
  AWSAccountAndLambdaRequest.JSON_PROPERTY_LAMBDA_ARN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AWSAccountAndLambdaRequest {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_LAMBDA_ARN = "lambda_arn";
  private String lambdaArn;


  public AWSAccountAndLambdaRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Your AWS Account ID without dashes.
   * @return accountId
  **/
  @ApiModelProperty(example = "1234567", required = true, value = "Your AWS Account ID without dashes.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AWSAccountAndLambdaRequest lambdaArn(String lambdaArn) {
    this.lambdaArn = lambdaArn;
    return this;
  }

   /**
   * ARN of the Datadog Lambda created during the Datadog-Amazon Web services Log collection setup.
   * @return lambdaArn
  **/
  @ApiModelProperty(example = "arn:aws:lambda:us-east-1:1234567:function:LogsCollectionAPITest", required = true, value = "ARN of the Datadog Lambda created during the Datadog-Amazon Web services Log collection setup.")
  @JsonProperty(JSON_PROPERTY_LAMBDA_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLambdaArn() {
    return lambdaArn;
  }


  public void setLambdaArn(String lambdaArn) {
    this.lambdaArn = lambdaArn;
  }


  /**
   * Return true if this AWSAccountAndLambdaRequest object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSAccountAndLambdaRequest awSAccountAndLambdaRequest = (AWSAccountAndLambdaRequest) o;
    return Objects.equals(this.accountId, awSAccountAndLambdaRequest.accountId) &&
        Objects.equals(this.lambdaArn, awSAccountAndLambdaRequest.lambdaArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, lambdaArn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSAccountAndLambdaRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    lambdaArn: ").append(toIndentedString(lambdaArn)).append("\n");
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

