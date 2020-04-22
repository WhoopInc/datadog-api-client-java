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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The layout for a widget on a free dashboard.
 */
@ApiModel(description = "The layout for a widget on a free dashboard.")
@JsonPropertyOrder({
  WidgetLayout.JSON_PROPERTY_HEIGHT,
  WidgetLayout.JSON_PROPERTY_WIDTH,
  WidgetLayout.JSON_PROPERTY_X,
  WidgetLayout.JSON_PROPERTY_Y
})

public class WidgetLayout {
  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public static final String JSON_PROPERTY_X = "x";
  private Long x;

  public static final String JSON_PROPERTY_Y = "y";
  private Long y;


  public WidgetLayout height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of the widget. Should be a non-negative integer.
   * minimum: 0
   * @return height
  **/
  @ApiModelProperty(required = true, value = "The height of the widget. Should be a non-negative integer.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public WidgetLayout width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * The width of the widget. Should be a non-negative integer.
   * minimum: 0
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width of the widget. Should be a non-negative integer.")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }


  public WidgetLayout x(Long x) {
    
    this.x = x;
    return this;
  }

   /**
   * The position of the widget on the x (horizontal) axis. Should be a non-negative integer.
   * minimum: 0
   * @return x
  **/
  @ApiModelProperty(required = true, value = "The position of the widget on the x (horizontal) axis. Should be a non-negative integer.")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getX() {
    return x;
  }


  public void setX(Long x) {
    this.x = x;
  }


  public WidgetLayout y(Long y) {
    
    this.y = y;
    return this;
  }

   /**
   * The position of the widget on the y (vertical) axis. Should be a non-negative integer.
   * minimum: 0
   * @return y
  **/
  @ApiModelProperty(required = true, value = "The position of the widget on the y (vertical) axis. Should be a non-negative integer.")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getY() {
    return y;
  }


  public void setY(Long y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetLayout widgetLayout = (WidgetLayout) o;
    return Objects.equals(this.height, widgetLayout.height) &&
        Objects.equals(this.width, widgetLayout.width) &&
        Objects.equals(this.x, widgetLayout.x) &&
        Objects.equals(this.y, widgetLayout.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, x, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetLayout {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
