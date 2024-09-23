package com.josdem.generics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionAdderTest {

    private final CollectionAdder collectionAdder = new CollectionAdder();

    @Test
    @DisplayName("should sum integers")
    void shouldSumIntegers() {
        var numbers = List.of(10, 11, 12);
        assertEquals(Double.valueOf(33), collectionAdder.sum(numbers));
    }

    @Test
    @DisplayName("should sum doubles")
    void shouldSumDoubles() {
        List<Double> numbers = List.of(10.5, 11.2, 12.8);
        assertEquals(Double.valueOf(34.5), collectionAdder.sum(numbers));
    }

}