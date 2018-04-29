package com.jos.dem.functional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.function.Supplier;

public class SupplierTest {

	@Test
	public void shouldSupplyAnString(){
		Supplier<String> supplier = () -> "josdem";
		assertEquals("josdem", supplier.get());
	}
	
}