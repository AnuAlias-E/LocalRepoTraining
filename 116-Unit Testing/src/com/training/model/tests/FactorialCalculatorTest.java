package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.FactorialCalculator;

public class FactorialCalculatorTest {

	FactorialCalculator factorialCalculator;

	@BeforeEach
	public void init() {
		factorialCalculator = new FactorialCalculator();
	}

	@AfterEach
	public void destroy() {
		factorialCalculator = null;
	}

	@Test
	@DisplayName("Testing Factorial for a number between 1 to 10")
	public void factorialTest1() {
		factorialCalculator.setNum(5);
		long expected = 120L;
		long actual = factorialCalculator.calculate();
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Testing Factorial for a number between 11 to 15")
	public void factorialTest2() {
		factorialCalculator.setNum(11);
		long expected = 39916800L;
		long actual = factorialCalculator.calculate();
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Testing Factorial for a number between 16 to 20")
	public void factorialTest3() {
		factorialCalculator.setNum(16);
		long expected = 20922789888000L;
		long actual = factorialCalculator.calculate();
		assertEquals(expected, actual);

	}
}
