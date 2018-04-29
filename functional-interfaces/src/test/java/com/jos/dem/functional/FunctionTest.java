package com.jos.dem.functional;

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
	
}