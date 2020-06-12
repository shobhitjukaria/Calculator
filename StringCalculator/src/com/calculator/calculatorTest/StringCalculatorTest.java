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
	
	@Test
	public void shouldReturnSingleNumber() {
		assertEquals(1,calculator.add("1"));
	}
	
	@Test
	public void shouldReturnSumOfNumbersSeparatedByCommas() {
		assertEquals(5,calculator.add("2,3"));
	}
	
	@Test
	public void shouldReturnSumOfNumbersSeparatedByNewLineDelimiter() {
		assertEquals(9,calculator.add("2\n3,4"));
	}
}
