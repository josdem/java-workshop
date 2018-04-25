package com.jos.dem.generics

import spock.lang.Specification

class GenericsTypeSpec extends Specification {

  void "should create a generic type and cast to string"(){
    given:'A generic type'
      GenericType<String> type = new GenericType<String>()
    when:'I create a string type'
      type.set('josdem');  
    then:'I expect to get the string'
      'josdem' == type.get();  
  }

  void "should support string and integer types"(){
    given:'A generic type'
      GenericType type = new GenericType()
    when:'I create a string and integer type'
      type.set('josdem');
      type.set(7);
    then:'I expect to get integer'
      7 == type.get();
  }

} 