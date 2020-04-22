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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  SyntheticsDeleteTestsResponseDeletedTests.JSON_PROPERTY_DELETED_AT,
  SyntheticsDeleteTestsResponseDeletedTests.JSON_PROPERTY_PUBLIC_ID
})

public class SyntheticsDeleteTestsResponseDeletedTests {
  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;


  public SyntheticsDeleteTestsResponseDeletedTests deletedAt(OffsetDateTime deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * TODO.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }


  public SyntheticsDeleteTestsResponseDeletedTests publicId(String publicId) {
    
    this.publicId = publicId;
    return this;
  }

   /**
   * TODO.
   * @return publicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicId() {
    return publicId;
  }


  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDeleteTestsResponseDeletedTests syntheticsDeleteTestsResponseDeletedTests = (SyntheticsDeleteTestsResponseDeletedTests) o;
    return Objects.equals(this.deletedAt, syntheticsDeleteTestsResponseDeletedTests.deletedAt) &&
        Objects.equals(this.publicId, syntheticsDeleteTestsResponseDeletedTests.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAt, publicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDeleteTestsResponseDeletedTests {\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
