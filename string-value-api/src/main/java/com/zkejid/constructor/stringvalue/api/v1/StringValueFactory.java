package com.zkejid.constructor.stringvalue.api.v1;

/**
 * Factory for {@link StringValue}.
 */
public interface StringValueFactory {

  /**
   * Make a {@link StringValue} with specified value and type.
   */
  StringValue make(String value, InputValueType type);
}
