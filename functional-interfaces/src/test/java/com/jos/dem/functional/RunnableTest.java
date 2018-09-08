package com.jos.dem.functional;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class RunnableTest {

  Runnable runnable = () -> System.out.println("Hello World!");

  @Test
  @DisplayName("Understands runnable instance as lambda expression")
  public void shouldKnowValidateRunnableInstance(){
    assertTrue(runnable instanceof Runnable);
  }

}
