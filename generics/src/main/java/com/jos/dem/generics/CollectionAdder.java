package com.jos.dem.generics;

import java.util.List;

public class CollectionAdder {

  public Double sum(List<? extends Number> numbers){
    return numbers.stream()
      .mapToDouble(Number::doubleValue)
      .sum();
  }
    
 }