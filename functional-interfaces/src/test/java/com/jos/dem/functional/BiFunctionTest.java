package com.jos.dem.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BiFunctionTest {

  private static final int MIN_RANKING = 4;

  private final List<Person> persons =
      Arrays.asList(
          new Person("josdem", 5),
          new Person("tgrip", 4),
          new Person("edzero", 3),
          new Person("jeduan", 5),
          new Person("siedrix", 5));

  @Test
  @DisplayName("test bi-function")
  void shouldTestBiFunction() {
    Person expectedPerson = new Person("josdem", 5);

    BiFunction<String, List<Person>, Person> function =
        (nickname, persons) ->
            persons.stream()
                .filter(p -> p.getNickname().equals(nickname) && p.getRanking() >= MIN_RANKING)
                .findAny()
                .orElse(new Person());

    assertTrue(expectedPerson.equals(function.apply("josdem", persons)), "should find person");
  }
}
