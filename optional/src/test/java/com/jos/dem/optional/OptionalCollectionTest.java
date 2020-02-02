package com.jos.dem.optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionalCollectionTest {

  private static final int EXPECTED_VALUES = 3;
  private static final int EXPECTED_DEVELOPERS = 2;

  private static final Logger log = Logger.getLogger(OptionalCollectionTest .class.getName());

  @Test
  @DisplayName("should get a list non empty values")
  void shouldGetNonEmptyValuesList(){
    List<Optional<String>> staff = Arrays.asList(
        Optional.of("developer"), Optional.of("designer"), Optional.empty(), Optional.of("developer"));

    List<String> filteredStaff = staff.stream()
        .flatMap(Optional::stream)
        .collect(Collectors.toList());

    assertEquals(EXPECTED_VALUES, filteredStaff.size(), "should be 3 non empty values");
  }

  @Test
  @DisplayName("should filter by developer")
  void shouldFilterByDeveloper(){
    List<Optional<String>> staff = Arrays.asList(
        Optional.of("developer"), Optional.of("designer"), Optional.empty(), Optional.of("developer"));

    List<String> developers = staff.stream()
        .filter(it -> it.isPresent())
        .map(it -> it.get())
        .filter(it -> it.equals("developer"))
        .collect(Collectors.toList());

    assertEquals(EXPECTED_DEVELOPERS, developers.size(), "should be two developers");
  }

}