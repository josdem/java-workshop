package com.jos.dem.optonal;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionalTest {

  @Test
  @DisplayName("should validate if is present")
  void shouldBePresent(){
    Optional<String> opt = Optional.ofNullable("josdem");
    assertTrue(opt.isPresent(), "should not be present");
  }

  @Test
  @DisplayName("should validate when is not present")
  void shouldNotBePresent() {
    Optional<String> opt = Optional.ofNullable(null);
    assertFalse(opt.isPresent(), "should not be present");
  }


}