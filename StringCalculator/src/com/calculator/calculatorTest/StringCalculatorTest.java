package com.calculator.calculatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.calculator.StringCalculator;

public class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();
	
	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0,calculator.add(""));
	}
	
}
