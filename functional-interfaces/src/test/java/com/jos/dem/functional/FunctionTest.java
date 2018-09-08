package com.jos.dem.functional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FunctionTest {

	@Test
  @DisplayName("Understands how to get string lenght")
	public void shouldGetStringLenght(){
		Integer expectedResult = 6;
		Function<String, Integer> function = string -> string.length();
		assertEquals(expectedResult, function.apply("josdem"));
	}

	@Test
  @DisplayName("Understands how to get josdem lenght and if it is even")
	public void shouldKnowIfNicknameLengthIsEven(){
		Function<String, Integer> lenghtFunction = string -> string.length();
		Function<Integer, Boolean> evenFunction = integer -> integer % 2 == 0;

		assertTrue(lenghtFunction.andThen(evenFunction).apply("josdem"));
	}

	@Test
  @DisplayName("Understands how to get function identity")
	public void shouldGetFunctionIdentity(){
		Function<String, String> function = Function.identity();
		assertEquals("josdem", function.apply("josdem"));
	}

}
