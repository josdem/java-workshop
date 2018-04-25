package com.jos.dem.generics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoxTest {

  @Test
  public void shouldCreateAnStringBox(){
    String nickname = "josdem";    
    Box<String> box = new Box<String>();
    box.set(nickname);
    assertEquals("java.lang.String", box.getClassTypeName());
  }

  @Test
  public void shouldCreateAnIntegerInspection(){    
    Integer integer = new Integer(10);
    Box<Integer> box = new Box<Integer>();   
    assertEquals("java.lang.Integer", box.getClassNumberName(integer));
  }

}