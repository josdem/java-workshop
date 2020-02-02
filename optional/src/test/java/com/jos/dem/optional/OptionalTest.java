package com.jos.dem.optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.commons.lang3.StringUtils;

import java.util.logging.Logger;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionalTest {

  private static final Logger log = Logger.getLogger(OptionalTest.class.getName());

  @Test
  void shouldCreateAnEmptyOptional() {
    Optional<String> empty = Optional.empty();
    assertFalse(empty.isPresent(), "should not be present");
  }

  @Test
  @DisplayName("should validate if is present")
  void shouldBePresentBy(){
    Optional<String> opt = Optional.of("josdem");
    assertTrue(opt.isPresent(), "should be present");
  }

  @Test
  @DisplayName("should validate if is present by nullable")
  void shouldBePresentByNullable(){
    Optional<String> opt = Optional.ofNullable("josdem");
    assertTrue(opt.isPresent(), "should be present by nullable");
  }

  @Test
  @DisplayName("should validate when is not present")
  void shouldNotBePresent() {
    Optional<String> opt = Optional.ofNullable(null);
    assertFalse(opt.isPresent(), "should not be present");
  }

  @Test
  @DisplayName("should take action if is present")
  void shouldPrintValue(){
    Optional<String> opt = Optional.ofNullable("josdem");
    opt.ifPresent(value -> log.info("value: " + opt.get()));
  }

  @Test
  @DisplayName("should display default value")
  void shouldDisplayDefault(){
    String value = null;
    String name = Optional.ofNullable(value).orElse(StringUtils.EMPTY);
    assertEquals(StringUtils.EMPTY, name, "should be empty");
  }

  @Test
  @DisplayName("should throw an exception")
  void shouldThrowAnException(){
    String value = null;
    assertThrows(RuntimeException.class, () -> Optional.ofNullable(value).orElseThrow(RuntimeException::new), "should throw an exception");
  }

}