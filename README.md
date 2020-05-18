# String value module
## Overview
Part of Zkejid's Constructor Framework. Serves as a wrapper around string values provided through any container: command line property, configuration property, etc. Includes semantics of "empty value" and "omitted value". Sometimes it is hard to say if the value of string parameter is actually an empty string, or the value is unspecified due to any reason. Sometimes both of these situationsshould be processed similarly, bot in other cases actions should be different. This module helps to process the value in strict and obvious way.  

## Usage
## API
To use the API as the publisher of the value you should request ```StringValueFactory.class``` interface in your ```ConstructorPart``` implementation:
```
  @Override
  public Set<Class<?>> getInterfacesNecessary() {
    return Set.of(StringValueFactory.class);
  }
```
For a given value to publish you should call ```make(String, InputValueType)``` method of the factory. ```String``` value contains the value to pass, ```InputValueType``` contains type of raw value obtained from the source. 

To use the API as the receiver of value you may just use ```StringValue``` object. 

## Constructor Module
String Value is the module of [Constructor Framework](https://github.com/zkejidsconstructor).
You can simply place artifacts of this module on the path of application to use its API.

## Versioning
Artifact versions of the CliArguments Module follow the 
[Semantic Versioning 2.0.0](https://semver.org/spec/v2.0.0.html) specification.

## License
The module is provided under MIT License Copyright (c) 2020 Zkejid.