package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.training.model.EvenNumberChecker;

public class EvenNumberCheckerTesting {

//	@BeforeAll
//	public static void init() {
//		EvenNumberChecker.number = 12;
//		System.out.println(EvenNumberChecker.number);
//	}
//
//	@AfterAll
//	public static void reset() {
//		EvenNumberChecker.number = 0;
//	}

	@ParameterizedTest(name = "Test  Number {0} Computation")
	@ValueSource(ints = { 3, 5, 7, 9, 11 })
	public void testEvenNumberFailure(int number) {
		boolean expected = false;
		boolean actual = EvenNumberChecker.compute(number);
		assertEquals(expected, actual);
	}

	@ParameterizedTest(name = "Test Even Number {0} Computation")
	@ValueSource(ints = { 2, 4, 6, 22, 24 })
	public void testEvenNumberPass(int number) {
		boolean expected = true;
		boolean actual = EvenNumberChecker.compute(number);
		assertEquals(expected, actual);
	}
}
