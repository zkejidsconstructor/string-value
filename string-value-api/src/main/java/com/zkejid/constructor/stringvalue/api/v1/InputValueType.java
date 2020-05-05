package com.zkejid.constructor.stringvalue.api.v1;

/**
 * Description of the way the value is provided by the source.
 * <p>
 * Type of input makes a great influence on actual value, which is returned by
 * {@link StringValue#getValue()} in cases of named parameters, default values or other additional
 * semantics.
 */
public enum InputValueType {

  /**
   * Value specified clearly by the source.
   */
  SPECIFIED,

  /**
   * Source provides an empty string value.
   */
  EMPTY_VALUE,

  /**
   * Source doesn't provided the value.
   */
  OMITTED
}
