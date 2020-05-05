package com.zkejid.constructor.stringvalue.impl;

import com.zkejid.constructor.core.api.v1.ConstructionException;
import com.zkejid.constructor.stringvalue.api.v1.InputValueType;
import com.zkejid.constructor.stringvalue.api.v1.StringValue;
import com.zkejid.constructor.stringvalue.api.v1.StringValueFactory;
import java.util.Set;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringValueFactoryImplTest {

  @Test
  void make_valueSpecified_wrapperReturned() {
    final StringValueFactoryImpl factory = new StringValueFactoryImpl();
    final String expectedString = "Test";
    final InputValueType expectedType = InputValueType.SPECIFIED;

    final StringValue value = factory.make(expectedString, expectedType);

    Assertions.assertEquals(expectedString, value.getValue(), "Unexpected string value");
    Assertions.assertEquals(expectedType, value.getInputValueType(), "Unexpected type value");
  }

  @Test
  void getInterfacesNecessary_call_empty() {
    final StringValueFactoryImpl factory = new StringValueFactoryImpl();

    final Set<Class<?>> interfacesNecessary = factory.getInterfacesNecessary();

    MatcherAssert.assertThat(interfacesNecessary, Matchers.empty());
  }

  @Test
  void getInterfacesProvided_call_returnsStringValueFactory() {
    final StringValueFactoryImpl factory = new StringValueFactoryImpl();

    final Set<Class<?>> interfacesProvided = factory.getInterfacesProvided();

    MatcherAssert.assertThat(interfacesProvided, Matchers.contains(StringValueFactory.class));
    MatcherAssert.assertThat(interfacesProvided, Matchers.hasSize(1));
  }

  @Test
  void getImplementation_thisClass_throwsException() {
    final StringValueFactoryImpl factory = new StringValueFactoryImpl();

    Assertions.assertThrows(
        ConstructionException.class,
        () -> factory.getImplementation(this.getClass())
    );
  }

  @Test
  void getImplementation_stringValueClass_returnImplementation() {
    final StringValueFactoryImpl factory = new StringValueFactoryImpl();

    final Object implementation = factory.getImplementation(StringValueFactory.class);

    final Class<?> aClass = implementation.getClass();
    MatcherAssert.assertThat(aClass, Matchers.typeCompatibleWith(StringValueFactory.class));
  }

  @Test
  void putImplementation_call_throwsException() {
    final StringValueFactoryImpl factory = new StringValueFactoryImpl();

    Assertions.assertThrows(
        ConstructionException.class,
        () -> factory.putImplementation(this.getClass(), this)
    );
  }
}