package com.jos.dem.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;

public class SupplierTest {

	@Test
  @DisplayName("Understands how to get a string using supplier")
	public void shouldSupplyAnString(){
		Supplier<String> supplier = () -> "josdem";
		assertEquals("josdem", supplier.get());
	}

}
