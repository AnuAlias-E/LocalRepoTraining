package com.training.model.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Employee;

public class EmployeeTesting {
	Employee employee;

	@BeforeEach
	public void init() {
		employee = new Employee();
	}

	@AfterEach
	public void clean() {
		employee = null;
	}

	@Test
	@DisplayName("Testing Basic Salary for Positive Data")
	public void testBasicSalaryforPositiveData() throws Exception {
		employee.setBasicSalary(1000);
		double expected = 1000;
		double actual = employee.getBasicSalary();
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Testing Basic Salary for Negative Data")
	public void testBasicSalaryforNegativeData() throws Exception {
		Exception e = assertThrows(Exception.class, () -> {
			employee.setBasicSalary(-1000);
		});
		String expectedMessage = "Negative Salary Not Acceptable";
		String actualMessage = e.getMessage();
		assertEquals(expectedMessage, actualMessage);

	}

	@Test
	@DisplayName("Testing Name for Correct Data")
	public void testNameforCorrectData() throws Exception {
		employee.setName("Anu");
		String expected = "Anu";
		String actual = employee.getName();
		assertEquals(expected, actual);

	}

	@Test
	@DisplayName("Testing Name for Null Data")
	public void testNameforNullData() throws Exception {
		Exception e = assertThrows(Exception.class, () -> {
			employee.setName(null);
		});
		String expectedMessage = "Name must not be Empty or Null";
		String actualMessage = e.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}

	@Test
	@DisplayName("Testing Name for  Empty Data")
	public void testNameforEmptyData() throws Exception {
		Exception e = assertThrows(Exception.class, () -> {
			employee.setName("");
		});
		String expectedMessage = "Name must not be Empty or Null";
		String actualMessage = e.getMessage();
		assertEquals(expectedMessage, actualMessage);
	}

}