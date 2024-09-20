package com.jos.dem.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoxTest {

  @Test
  @DisplayName("should contains a string in the box")
  void shouldContainsAStringInTheBox(){
    String nickname = "josdem";    
    var box = new Box<String>();
    box.set(nickname);
    assertEquals(nickname, box.get());
  }

  @Test
  @DisplayName("should contains an integer in the box")
  void shouldContainsAnIntegerInTheBox(){
    var box = new Box<Integer>();
    box.set(10);
    assertEquals(10, box.get());
  }

}