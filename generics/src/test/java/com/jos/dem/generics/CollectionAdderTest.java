package com.jos.dem.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

class CollectionAdderTest {

  @Test
  void shouldSumIntegers(){
    CollectionAdder collectionAdder = new CollectionAdder();
    List<Integer> numbers = Arrays.asList(new Integer(10), new Integer(11), new Integer(12));
    Double result = collectionAdder.sum(numbers);
    assertEquals(new Double(33), result);
  }

  @Test
  void shouldSumDoubles(){
    CollectionAdder collectionAdder = new CollectionAdder();
    List<Double> numbers = Arrays.asList(new Double(10), new Double(11), new Double(12));
    Double result = collectionAdder.sum(numbers);
    assertEquals(new Double(33), result);
  }

}