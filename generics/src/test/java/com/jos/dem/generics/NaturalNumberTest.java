package com.jos.dem.generics;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class NaturalNumberTest {

  @Test(expected=IllegalArgumentException.class)
  public void shouldNotAcceptNegativeNumbers(){
    new NaturalNumber(-1);
  }

  @Test
  public void shouldKnowIfIsEven(){
    NaturalNumber naturalNumber = new NaturalNumber(2);
    assertTrue(naturalNumber.isEven());
  }
  
}