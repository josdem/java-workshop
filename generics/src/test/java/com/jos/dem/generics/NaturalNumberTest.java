package com.jos.dem.generics;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class NaturalNumberTest {

  @Test
  @DisplayName("should throw an exception")
  void shouldNotAcceptNegativeNumbers(){
    assertThrows(IllegalArgumentException.class, () -> new NaturalNumber<Number>(-1), "should throw an exception");
  }

  @Test
  @DisplayName("should know if is even")
  void shouldKnowIfIsEven(){
    NaturalNumber<Number> naturalNumber = new NaturalNumber<Number>(2);
    assertTrue(naturalNumber.isEven());
  }

  @Test
  @DisplayName("should know if is odd")
  void shouldKnowIfIsOdd(){
    NaturalNumber<Integer> naturalNumber = new NaturalNumber<Integer>(1);
    assertFalse(naturalNumber.isEven());
  }
  
}