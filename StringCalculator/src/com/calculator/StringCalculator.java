package com.calculator;

public class StringCalculator {

	private static final String PREFIX = "//";

	public int add(String inputString) {
		if (inputString.isEmpty())
			return 0;
		String delimiter = findDelimiter(inputString);
		String newString = findString(inputString);
		checkNegatives(findArray(newString, delimiter));
		return calculateSum(findArray(newString, delimiter));
	}

	private String findString(String inputString) {
		String newString = inputString;
		if (inputString.startsWith(PREFIX)) {
			newString = inputString.substring(4);
		}
		return newString;
	}

	private String findDelimiter(String inputString) {
		String delimiter = ",|\n";
		if (inputString.startsWith(PREFIX)) {
			delimiter = inputString.substring(2, 3);
		}
		return delimiter;
	}

	private int calculateSum(String[] stringArray) {
		int total = 0;
		for (String num : stringArray) {
			total += toInt(num);
		}
		return total;
	}

	private void checkNegatives(String[] stringArray) {
		String negatives = "";
		for (String val : stringArray) {
			if (toInt(val) < 0) {
				negatives += "," + val;
			}
		}
		if (negatives.length() > 0) {
			throw new RuntimeException("Negatives Not Allowed! "+negatives.substring(1));
		}

	}

	private int toInt(String num) {
		Integer number = Integer.valueOf(num);
		if(number>1000)
			number=0;
		
		return number;
	}

	private String[] findArray(String inputString, String delimiter) {
		String[] values = inputString.split(delimiter);
		return values;
	}
}