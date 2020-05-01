package com.jos.dem.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SupplierTest {

  @Test
  @DisplayName("Understands how to get a string using supplier")
  public void shouldSupplyAnString() {
    Supplier<String> supplier = () -> "josdem";
    assertEquals("josdem", supplier.get());
  }
}
