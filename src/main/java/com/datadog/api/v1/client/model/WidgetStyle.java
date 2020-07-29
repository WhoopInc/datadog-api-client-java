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
 * Widget style definition.
 */
@ApiModel(description = "Widget style definition.")
@JsonPropertyOrder({
  WidgetStyle.JSON_PROPERTY_PALETTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WidgetStyle {
  public static final String JSON_PROPERTY_PALETTE = "palette";
  private String palette;


  public WidgetStyle palette(String palette) {
    this.palette = palette;
    return this;
  }

   /**
   * Color palette to apply to the widget.
   * @return palette
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color palette to apply to the widget.")
  @JsonProperty(JSON_PROPERTY_PALETTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPalette() {
    return palette;
  }


  public void setPalette(String palette) {
    this.palette = palette;
  }


  /**
   * Return true if this WidgetStyle object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetStyle widgetStyle = (WidgetStyle) o;
    return Objects.equals(this.palette, widgetStyle.palette);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palette);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetStyle {\n");
    sb.append("    palette: ").append(toIndentedString(palette)).append("\n");
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

