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
import java.time.OffsetDateTime;
import java.util.Objects;

/** Attributes of the organization. */
@ApiModel(description = "Attributes of the organization.")
@JsonPropertyOrder({
  OrganizationAttributes.JSON_PROPERTY_CREATED_AT,
  OrganizationAttributes.JSON_PROPERTY_DESCRIPTION,
  OrganizationAttributes.JSON_PROPERTY_DISABLED,
  OrganizationAttributes.JSON_PROPERTY_MODIFIED_AT,
  OrganizationAttributes.JSON_PROPERTY_NAME,
  OrganizationAttributes.JSON_PROPERTY_PUBLIC_ID,
  OrganizationAttributes.JSON_PROPERTY_SHARING,
  OrganizationAttributes.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrganizationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_SHARING = "sharing";
  private String sharing;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public OrganizationAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time of the organization.
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation time of the organization.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OrganizationAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the organization.
   *
   * @return description
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the organization.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrganizationAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether or not the organization is disabled.
   *
   * @return disabled
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the organization is disabled.")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public OrganizationAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Time of last organization modification.
   *
   * @return modifiedAt
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time of last organization modification.")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public OrganizationAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the organization.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the organization.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationAttributes publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * Public ID of the organization.
   *
   * @return publicId
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public ID of the organization.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public OrganizationAttributes sharing(String sharing) {
    this.sharing = sharing;
    return this;
  }

  /**
   * Sharing type of the organization.
   *
   * @return sharing
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sharing type of the organization.")
  @JsonProperty(JSON_PROPERTY_SHARING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSharing() {
    return sharing;
  }

  public void setSharing(String sharing) {
    this.sharing = sharing;
  }

  public OrganizationAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the site that this organization exists at.
   *
   * @return url
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the site that this organization exists at.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /** Return true if this OrganizationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAttributes organizationAttributes = (OrganizationAttributes) o;
    return Objects.equals(this.createdAt, organizationAttributes.createdAt)
        && Objects.equals(this.description, organizationAttributes.description)
        && Objects.equals(this.disabled, organizationAttributes.disabled)
        && Objects.equals(this.modifiedAt, organizationAttributes.modifiedAt)
        && Objects.equals(this.name, organizationAttributes.name)
        && Objects.equals(this.publicId, organizationAttributes.publicId)
        && Objects.equals(this.sharing, organizationAttributes.sharing)
        && Objects.equals(this.url, organizationAttributes.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, disabled, modifiedAt, name, publicId, sharing, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
