package com.calculator;

public class StringCalculator {

	public int add(String inputString) {
		if (inputString.isEmpty())
			return 0;
		String delimiter = ",|\n";
		String[] stringArray = findArray(inputString, delimiter);
		int sum = calculateSum(stringArray);
		return sum;
	}

	private int calculateSum(String[] stringArray) {
		int total = 0;
		for (String num : stringArray) {
			total += Integer.valueOf(num);
		}
		return total;
	}

	private String[] findArray(String inputString, String delimiter) {
		String[] values = inputString.split(delimiter);
		return values;
	}
}
