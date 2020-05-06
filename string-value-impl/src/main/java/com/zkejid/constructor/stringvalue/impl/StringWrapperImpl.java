package com.zkejid.constructor.stringvalue.impl;

import com.zkejid.constructor.stringvalue.api.v1.InputValueType;
import com.zkejid.constructor.stringvalue.api.v1.StringValue;

/**
 * String value augmented with property. Property signs, was the value specified by the source.
 * <p>
 * Implementation is a wrapper around original value and property value.
 */
public final class StringWrapperImpl implements StringValue {

  private final InputValueType inputValueType;
  private final String value;

  /**
   * @see StringWrapperImpl
   */
  public StringWrapperImpl(String value, InputValueType inputValueType) {
    this.inputValueType = inputValueType;
    this.value = value;
  }

  @Override
  public InputValueType getInputValueType() {
    return inputValueType;
  }

  @Override
  public String getValue() {
    return value;
  }
}
