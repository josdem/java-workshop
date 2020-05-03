package com.jos.dem.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FunctionTest {

  private final List<Person> persons =
      Arrays.asList(
          new Person("josdem", 5),
          new Person("tgrip", 4),
          new Person("edzero", 3),
          new Person("jeduan", 5),
          new Person("siedrix", 5));

  @Test
  @DisplayName("Understands how to get string lenght")
  public void shouldGetStringLenght() {
    Integer expectedResult = 6;
    Function<String, Integer> function = string -> string.length();
    assertEquals(expectedResult, function.apply("josdem"));
  }

  @Test
  @DisplayName("Understands how to get josdem lenght and if it is even")
  public void shouldKnowIfNicknameLengthIsEven() {
    Function<String, Integer> lengthFunction = string -> string.length();
    Function<Integer, Boolean> evenFunction = integer -> integer % 2 == 0;

    assertTrue(lengthFunction.andThen(evenFunction).apply("josdem"));
  }

  @Test
  @DisplayName("Understands how to get function identity")
  public void shouldGetFunctionIdentity() {
    Function<String, String> function = Function.identity();
    assertEquals("josdem", function.apply("josdem"));
  }

  @Test
  @DisplayName("should filter by high ranked and starts with J")
  void shouldFilterByHighRankedAndLetter() {
    List<String> expectedPersons = Arrays.asList("josdem", "jeduan");
    Function<Person, String> nicknames = (p) -> p.getNickname();

    List<String> names =
        persons.stream()
            .filter(p -> p.getRanking() > 4)
            .map(nicknames)
            .filter(n -> n.startsWith("j"))
            .collect(Collectors.toList());

    assertEquals(2, names.size(), "should have two names");
    assertEquals(expectedPersons, names, "should have expected filtered persons");
  }
}
