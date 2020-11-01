package com.behl.fizzbuzz.service;

public class FizzBuzz {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 100;

	public String displayResult() {
		StringBuilder result = new StringBuilder();

		for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
			result.append(findFizzBuzz(i));

			if (i < MAX_VALUE) {
				result.append(", ");
			}
		}

		return result.toString();
	}

	public String findFizzBuzz(int number) {
		boolean multipleOfThree = ((number % 3) == 0);
		boolean multipleOfFive = ((number % 5) == 0);

		if (multipleOfThree && multipleOfFive) {
			return "FizzBuzz";
		} else if (multipleOfThree) {
			return "Fizz";
		} else if (multipleOfFive) {
			return "Buzz";
		}
		return String.valueOf(number);
	}
}
