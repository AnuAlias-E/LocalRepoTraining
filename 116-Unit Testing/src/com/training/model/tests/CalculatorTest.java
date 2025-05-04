package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Calculator;

public class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	public void init() {
		calculator = new Calculator(10, 5);
	}

	@AfterEach
	public void destroy() {
		calculator = null;
	}

	@Test
	@DisplayName("Add two numbers ")
	public void testingAdd() {

		int expected = 15;
		int actual = calculator.add();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Subtract two numbers ")
	public void testingSubtract() {
		int expected = 5;
		int actual = calculator.subtract();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Multiply two numbers ")
	public void testingMultiply() {
		int expected = 50;
		int actual = calculator.multiply();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Divide two numbers ")
	public void testingDivide() {
		int expected = 2;
		int actual = calculator.divide();
		assertEquals(expected, actual);
	}

}
