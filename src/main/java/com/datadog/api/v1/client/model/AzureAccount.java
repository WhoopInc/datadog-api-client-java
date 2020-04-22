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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  AzureAccount.JSON_PROPERTY_CLIENT_ID,
  AzureAccount.JSON_PROPERTY_CLIENT_SECRET,
  AzureAccount.JSON_PROPERTY_ERRORS,
  AzureAccount.JSON_PROPERTY_HOST_FILTERS,
  AzureAccount.JSON_PROPERTY_NEW_CLIENT_ID,
  AzureAccount.JSON_PROPERTY_NEW_TENANT_NAME,
  AzureAccount.JSON_PROPERTY_TENANT_NAME
})

public class AzureAccount {
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "client_secret";
  private String clientSecret;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = null;

  public static final String JSON_PROPERTY_HOST_FILTERS = "host_filters";
  private String hostFilters;

  public static final String JSON_PROPERTY_NEW_CLIENT_ID = "new_client_id";
  private String newClientId;

  public static final String JSON_PROPERTY_NEW_TENANT_NAME = "new_tenant_name";
  private String newTenantName;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenant_name";
  private String tenantName;


  public AzureAccount clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Azure web application ID.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testc7f6-1234-5678-9101-3fcbf464test", value = "Your Azure web application ID.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AzureAccount clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Your Azure web application secret key.
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testingx./Sw*g/Y33t..R1cH+hScMDt", value = "Your Azure web application secret key.")
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public AzureAccount errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public AzureAccount addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * TODO.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"*\"]", value = "TODO.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  public AzureAccount hostFilters(String hostFilters) {
    
    this.hostFilters = hostFilters;
    return this;
  }

   /**
   * Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.
   * @return hostFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "key:value,filter:example", value = "Limit the Azure instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.")
  @JsonProperty(JSON_PROPERTY_HOST_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHostFilters() {
    return hostFilters;
  }


  public void setHostFilters(String hostFilters) {
    this.hostFilters = hostFilters;
  }


  public AzureAccount newClientId(String newClientId) {
    
    this.newClientId = newClientId;
    return this;
  }

   /**
   * Your New Azure web application ID.
   * @return newClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "new1c7f6-1234-5678-9101-3fcbf464test", value = "Your New Azure web application ID.")
  @JsonProperty(JSON_PROPERTY_NEW_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewClientId() {
    return newClientId;
  }


  public void setNewClientId(String newClientId) {
    this.newClientId = newClientId;
  }


  public AzureAccount newTenantName(String newTenantName) {
    
    this.newTenantName = newTenantName;
    return this;
  }

   /**
   * Your New Azure Active Directory ID.
   * @return newTenantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "new1c44-1234-5678-9101-cc00736ftest", value = "Your New Azure Active Directory ID.")
  @JsonProperty(JSON_PROPERTY_NEW_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewTenantName() {
    return newTenantName;
  }


  public void setNewTenantName(String newTenantName) {
    this.newTenantName = newTenantName;
  }


  public AzureAccount tenantName(String tenantName) {
    
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Your Azure Active Directory ID.
   * @return tenantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "testc44-1234-5678-9101-cc00736ftest", value = "Your Azure Active Directory ID.")
  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantName() {
    return tenantName;
  }


  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccount azureAccount = (AzureAccount) o;
    return Objects.equals(this.clientId, azureAccount.clientId) &&
        Objects.equals(this.clientSecret, azureAccount.clientSecret) &&
        Objects.equals(this.errors, azureAccount.errors) &&
        Objects.equals(this.hostFilters, azureAccount.hostFilters) &&
        Objects.equals(this.newClientId, azureAccount.newClientId) &&
        Objects.equals(this.newTenantName, azureAccount.newTenantName) &&
        Objects.equals(this.tenantName, azureAccount.tenantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, errors, hostFilters, newClientId, newTenantName, tenantName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccount {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    hostFilters: ").append(toIndentedString(hostFilters)).append("\n");
    sb.append("    newClientId: ").append(toIndentedString(newClientId)).append("\n");
    sb.append("    newTenantName: ").append(toIndentedString(newTenantName)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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
