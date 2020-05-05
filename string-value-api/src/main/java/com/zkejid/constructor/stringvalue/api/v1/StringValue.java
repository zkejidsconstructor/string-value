package com.zkejid.constructor.stringvalue.api.v1;

/**
 * String with the semantic description of the initially provided value.
 */
public interface StringValue {

  /**
   * Get description of provided value.
   */
  InputValueType getInputValueType();

  /**
   * Get value.
   */
  String getValue();
}
