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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * How to size the image on the widget. The values are based on the image &#x60;object-fit&#x60; CSS
 * properties. **Note**: &#x60;zoom&#x60;, &#x60;fit&#x60; and &#x60;center&#x60; values are
 * deprecated.
 */
@JsonSerialize(using = WidgetImageSizing.WidgetImageSizingSerializer.class)
public class WidgetImageSizing {

  public static final WidgetImageSizing FILL = new WidgetImageSizing("fill");
  public static final WidgetImageSizing CONTAIN = new WidgetImageSizing("contain");
  public static final WidgetImageSizing COVER = new WidgetImageSizing("cover");
  public static final WidgetImageSizing NONE = new WidgetImageSizing("none");
  public static final WidgetImageSizing SCALEDOWN = new WidgetImageSizing("scale-down");
  public static final WidgetImageSizing ZOOM = new WidgetImageSizing("zoom");
  public static final WidgetImageSizing FIT = new WidgetImageSizing("fit");
  public static final WidgetImageSizing CENTER = new WidgetImageSizing("center");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("fill", "contain", "cover", "none", "scale-down", "zoom", "fit", "center"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  WidgetImageSizing(String value) {
    this.value = value;
  }

  public static class WidgetImageSizingSerializer extends StdSerializer<WidgetImageSizing> {
    public WidgetImageSizingSerializer(Class<WidgetImageSizing> t) {
      super(t);
    }

    public WidgetImageSizingSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetImageSizing value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this WidgetImageSizing object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((WidgetImageSizing) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static WidgetImageSizing fromValue(String value) {
    return new WidgetImageSizing(value);
  }
}
