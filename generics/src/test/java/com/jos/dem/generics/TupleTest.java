package com.jos.dem.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TupleTest {

  @Test
  @DisplayName("should contains a string and integer in the tuple")
  void shouldConstainsAStringInTheTuple(){
    String nickname = "josdem";
    Tuple<String, Integer> tuple = new Tuple<>(nickname, new Integer(10));
    assertEquals("josdem:10", tuple.toString());
  }

}