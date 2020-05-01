package com.jos.dem.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RunnableTest {

  private final Runnable runnable = () -> System.out.println("Hello World!");

  @Test
  @DisplayName("Understands runnable instance as lambda expression")
  public void shouldKnowValidateRunnableInstance() {
    assertTrue(runnable instanceof Runnable);
  }
}
