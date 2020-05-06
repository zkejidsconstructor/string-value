package com.zkejid.constructor.stringvalue.impl;

import com.zkejid.constructor.stringvalue.api.v1.InputValueType;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringWrapperImplTest {

  @Test
  void getInputValueType_valueProvided_valueGet() {
    final InputValueType expected = InputValueType.EMPTY_VALUE;
    final StringWrapperImpl wrapper = new StringWrapperImpl("q", expected);

    final InputValueType actual = wrapper.getInputValueType();

    Assertions.assertEquals(expected, actual);
  }

  @Test
  void getValue_valueProvided_valueGet() {
    final String expected = "q";
    final StringWrapperImpl wrapper = new StringWrapperImpl(expected, InputValueType.OMITTED);

    final String actual = wrapper.getValue();

    Assertions.assertEquals(expected, actual);
  }
}