package com.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Calculator;

public class CalculatorTesting {
	Calculator calculator;

	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}

	@AfterEach
	public void tearDown() {
		calculator = null;
	}

	@Test
	@DisplayName("Add two numbers ")
	public void addTesting() {
		int expected = 15;
		int actual = calculator.add(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Subtract two numbers ")
	public void subtractTesting() {
		int expected = 5;
		int actual = calculator.subtract(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Multiply two numbers ")
	public void multiplyTesting() {
		int expected = 50;
		int actual = calculator.multiply(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Divide two numbers ")
	public void divideTesting() {
		int expected = 2;
		int actual = calculator.divide(10, 5);
		assertEquals(expected, actual);
	}
}
