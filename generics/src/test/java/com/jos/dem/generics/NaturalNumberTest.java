package com.jos.dem.generics;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class NaturalNumberTest {

  @Test(expected=IllegalArgumentException.class)
  public void shouldNotAcceptNegativeNumbers(){
    new NaturalNumber(-1);
  }

  @Test
  public void shouldKnowIfIsEven(){
    NaturalNumber<Number> naturalNumber = new NaturalNumber<Number>(2);
    assertTrue(naturalNumber.isEven());
  }

  @Test
  public void shouldKnowIfIsNotEven(){
    NaturalNumber<Integer> naturalNumber = new NaturalNumber<Integer>(1);
    assertFalse(naturalNumber.isEven());
  }
  
}