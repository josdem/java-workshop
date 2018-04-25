 package com.jos.dem.generics;

import java.util.List;

public class CollectionAdder {

  public Double sum(List<? extends Number> numbers){
    double result = 0;
    for(Number number : numbers){
      result += number.doubleValue();
    }
    return result;
  }
    
 }