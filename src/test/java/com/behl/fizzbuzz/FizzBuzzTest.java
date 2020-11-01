package com.behl.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.behl.fizzbuzz.service.FizzBuzz;

/**
 * 1. Write a program that prints the numbers from 1 to 100.
 * 
 * 2. For multiples of "3" print "Fizz"
 * 
 * 3. For multiples of "5" print "Buzz"
 * 
 * 4. For multiples of both "3" & "5" print "FizzBuzz".
 */

class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeEach
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testMultiplesOfThreeAndFivePrintsFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.findFizzBuzz(15),"FizzBuzz should be printed");
	}

	@Test
	public void testMultiplesOfThreePrintsFizz() {
		assertEquals("Fizz", fizzBuzz.findFizzBuzz(99), "Fizz should be printed");
	}

	@Test
	public void testMultiplesOfFivePrintsBuzz() {
		assertEquals("Buzz", fizzBuzz.findFizzBuzz(35), "Buzz should be printed");
	}

	@Test
	public void testInputOfOtherNumbersPrintsTheNumber() {
		assertEquals("7", fizzBuzz.findFizzBuzz(7), "7 should be printed");
	}

	@Test
	public void testOutputOfProgramIsANonEmptyString() {
		String result = fizzBuzz.displayResult();
		assertNotNull(result);
		assertNotSame(0, result.length());
	}
}