package com.calculator.calculatorTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.calculator.StringCalculator;

public class StringCalculatorTest {

	StringCalculator calculator = new StringCalculator();

	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void shouldReturnSingleNumber() {
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void shouldReturnSumOfNumbersSeparatedByCommas() {
		assertEquals(5, calculator.add("2,3"));
	}

	@Test
	public void shouldReturnSumOfNumbersSeparatedByNewLineDelimiter() {
		assertEquals(9, calculator.add("2\n3,4"));
	}

	@Test
	public void shouldReturnSumOfNumbersSeparatedByCustomDelimiter() {
		assertEquals(7, calculator.add("//;\n1;6"));
	}

	@Test
	public void checkForNegativesAndPrintNegativesList() {
		try {
			calculator.add("-1,-2,2,-3");
			fail();
		}catch(Exception e) {
			assertEquals("Negatives Not Allowed! -1,-2,-3",e.getMessage());
		}
	}
	
	@Test
	public void ignoreNumbersGreaterThanThousand() {
		assertEquals(2, calculator.add("2,1001"));
	}
}
