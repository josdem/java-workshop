package com.jos.dem.functional;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

public class FunctionTest {

	@Test
	public void shouldGetStringLenght(){
		Integer expectedResult = 6;
		Function<String, Integer> function = string -> string.length();
		assertEquals(expectedResult, function.apply("josdem"));
	}

	@Test
	public void shouldKnowIfNicknameLengthIsEven(){
		Function<String, Integer> lenghtFunction = string -> string.length();
		Function<Integer, Boolean> evenFunction = integer -> integer % 2 == 0;

		assertTrue(lenghtFunction.andThen(evenFunction).apply("josdem"));
	}

	@Test
	public void shouldGetFunctionIdentity(){
		Function<String, String> function = Function.identity();
		assertEquals("josdem", function.apply("josdem"));
	}
	
}