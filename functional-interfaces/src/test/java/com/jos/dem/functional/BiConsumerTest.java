package com.jos.dem.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiConsumerTest {

  @Test
  @DisplayName("should test bi-consumer")
  void shouldValidateString() {
    BiConsumer<Integer, String> consumer =
        (rank, nickname) -> {
          Person person = new Person(nickname, rank);
          assertEquals("josdem", person.getNickname());
          assertEquals(Integer.valueOf(5), person.getRanking());
        };

    consumer.accept(5, "josdem");
  }
}
