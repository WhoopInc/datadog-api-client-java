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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Attributes of a full API key.
 */
@ApiModel(description = "Attributes of a full API key.")
@JsonPropertyOrder({
  FullAPIKeyAttributes.JSON_PROPERTY_CREATED_AT,
  FullAPIKeyAttributes.JSON_PROPERTY_KEY,
  FullAPIKeyAttributes.JSON_PROPERTY_LAST4,
  FullAPIKeyAttributes.JSON_PROPERTY_MODIFIED_AT,
  FullAPIKeyAttributes.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FullAPIKeyAttributes {
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LAST4 = "last4";
  private String last4;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private String modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


   /**
   * Creation date of the API key.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-23T10:00:00.000Z", value = "Creation date of the API key.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * The API key.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API key.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }




   /**
   * The last four characters of the API key.
   * @return last4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd", value = "The last four characters of the API key.")
  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLast4() {
    return last4;
  }




   /**
   * Date the API key was last modified.
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-23T10:00:00.000Z", value = "Date the API key was last modified.")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedAt() {
    return modifiedAt;
  }




  public FullAPIKeyAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the API key.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "API Key for submitting metrics", value = "Name of the API key.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this FullAPIKeyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullAPIKeyAttributes fullAPIKeyAttributes = (FullAPIKeyAttributes) o;
    return Objects.equals(this.createdAt, fullAPIKeyAttributes.createdAt) &&
        Objects.equals(this.key, fullAPIKeyAttributes.key) &&
        Objects.equals(this.last4, fullAPIKeyAttributes.last4) &&
        Objects.equals(this.modifiedAt, fullAPIKeyAttributes.modifiedAt) &&
        Objects.equals(this.name, fullAPIKeyAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, key, last4, modifiedAt, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullAPIKeyAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
