package com.jos.dem.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnaryOperatorTest {

    @Test
    @DisplayName("Unary operator example")
    void shouldTestUnaryOperator() {
        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        assertEquals(Integer.valueOf(8), unaryOperator.apply(4));
    }
}
