package com.example.javademo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTests {

	@Test
	void Add_ReturnsDouble() {
		// Arrange 
		Double ans = CalculatorLibrary.Add("4", "5");
		
		// Assert
		assertEquals(ans, 9.0);
	}
	
	@Test
	void Sub_ReturnsDouble() {
		// Arrange 
		Double ans = CalculatorLibrary.Sub("4.0", "2.0");
		
		// Assert
		assertEquals(ans, 2.0);
	}
	
	@Test
	void Mul_ReturnsDouble() {
		// Arrange 
		Double ans = CalculatorLibrary.Mul("4", "5.0");
		
		// Assert
		assertEquals(ans, 20.0);
	}
	
	@Test
	void Div_ReturnsDouble() {
		// Arrange 
		Double ans = CalculatorLibrary.Div("4", "5.0");
		
		// Assert
		assertEquals(ans, 0.8);
	}

}
