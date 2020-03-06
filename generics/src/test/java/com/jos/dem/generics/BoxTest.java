package com.jos.dem.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoxTest {

  @Test
  @DisplayName("should contains a string in the box")
  void shouldConstainsAStringInTheBox(){
    String nickname = "josdem";    
    Box<String> box = new Box<String>();
    box.set(nickname);
    assertEquals(nickname, box.get());
  }

  @Test
  @DisplayName("shold contains an integer in the box")
  void shouldContainsAnIntegerInTheBox(){
    Box<Integer> box = new Box<Integer>();   
    box.set(Integer.valueOf(10));
    assertEquals(10, box.get());
  }

}