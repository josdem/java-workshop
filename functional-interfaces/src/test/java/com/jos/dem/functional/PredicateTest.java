package com.jos.dem.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PredicateTest {

  private final List<Person> persons =
      Arrays.asList(
          new Person("josdem", 5),
          new Person("tgrip", 4),
          new Person("edzero", 3),
          new Person("jeduan", 5),
          new Person("siedrix", 5));

  @Test
  @DisplayName("Understands how to get persons with four in ranking or more")
  public void shouldGetPersonsWithFourInRankingOrMore() {
    Predicate<Person> isHighRanked = person -> person.getRanking() >= 4;
    assertEquals(4, persons.stream().filter(isHighRanked).count());
  }

  @Test
  @DisplayName("Understands how to get persons high ranked and starts with J")
  public void shouldGetPersonsHighRankedAndStartsWithJ() {
    Predicate<Person> isHighRanked = person -> person.getRanking() >= 4;
    Predicate<Person> startsWithJ = person -> person.getNickname().startsWith("j");
    assertEquals(2, persons.stream().filter(isHighRanked).filter(startsWithJ).count());
  }
}
