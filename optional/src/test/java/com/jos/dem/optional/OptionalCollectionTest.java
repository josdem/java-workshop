package com.jos.dem.optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionalCollectionTest {

  private static final int EXPECTED_DEVELOPERS = 2;

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

    assertEquals(EXPECTED_DEVELOPERS, developers.size(), "should be two");
  }

}