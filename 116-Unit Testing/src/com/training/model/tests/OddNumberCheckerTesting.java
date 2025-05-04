package com.training.model.tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.training.model.OddNumberChecker;

public class OddNumberCheckerTesting {

	@ParameterizedTest(name = "Testing if a number {0} is odd number")
	@ValueSource(ints = { 3, 5, 7, 9, 11 })
	public void test(int number) {
		assertTrue(OddNumberChecker.isOdd(number));
	}
}
