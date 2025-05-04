package com.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Employee;

public class EmployeeTesting {

	Employee employee;

	@BeforeEach
	public void setUp() {
		employee = new Employee();
	}

	@AfterEach
	public void tearDown() {
		employee = null;
	}

	@Test
	@DisplayName("Testing Incentive for A Grade Employee")
	public void testForAGrade() {
		employee.setGrade('A');
		int expected = 40;
		int actual = employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing Incentive for B Grade Employee")
	public void testForBGrade() {
		employee.setGrade('B');
		int expected = 30;
		int actual = employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing Incentive for C Grade Employee")
	public void testForCGrade() {
		employee.setGrade('C');
		int expected = 20;
		int actual = employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing Incentive for D Grade Employee")
	public void testForDGrade() {
		employee.setGrade('D');
		int expected = 10;
		int actual = employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

}
