package com.zkejid.constructor.stringvalue.impl;

import com.zkejid.constructor.core.api.v1.ConstructionException;
import com.zkejid.constructor.core.api.v1.ConstructorPart;
import com.zkejid.constructor.stringvalue.api.v1.InputValueType;
import com.zkejid.constructor.stringvalue.api.v1.StringValue;
import com.zkejid.constructor.stringvalue.api.v1.StringValueFactory;
import java.util.Collections;
import java.util.Set;

/**
 * Implementation of {@link StringValue} based on wrapper.
 * <p>
 * Provides the constructor module without dependencies and with one interface
 * {@link StringValueFactory}.
 */
public class StringValueFactoryImpl implements StringValueFactory, ConstructorPart {

  @Override
  public StringValue make(String value, InputValueType type) {
    return new StringWrapperImpl(value, type);
  }

  @Override
  public Set<Class<?>> getInterfacesNecessary() {
    return Collections.emptySet();
  }

  @Override
  public Set<Class<?>> getInterfacesProvided() {
    return Collections.singleton(StringValueFactory.class);
  }

  @Override
  public Object getImplementation(Class<?> aClass) {
    if (StringValueFactory.class.equals(aClass)) {
      return this;
    } else {
      throw new ConstructionException("Not expected class: " + aClass);
    }
  }

  @Override
  public void putImplementation(Class<?> aClass, Object ... o) {
    throw new ConstructionException("Module has no dependencies");
  }

  @Override
  public void verifyNecessaryInterfaces() throws ConstructionException {
    // No-op
  }
}
