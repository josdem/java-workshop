package com.jos.dem.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

class CollectionAdderTest {

  private CollectionAdder collectionAdder = new CollectionAdder();

  @Test
  @DisplayName("should sum integers")
  void shouldSumIntegers(){
    List<Integer> numbers = Arrays.asList(Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12));
    assertEquals(Double.valueOf(33), collectionAdder.sum(numbers));
  }

  @Test
  @DisplayName("should sum doubles")
  void shouldSumDoubles(){
    List<Double> numbers = Arrays.asList(Double.valueOf(10), Double.valueOf(11), Double.valueOf(12));
    assertEquals(Double.valueOf(33), collectionAdder.sum(numbers));
  }

}