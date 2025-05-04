package com.training.model;

public class Employee {

	double basicSalary;
	String name;

	public Employee() {
		super();
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) throws Exception {
		if (basicSalary < 0) {
			throw new Exception("Negative Salary Not Acceptable");
		}
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name == null || name.isEmpty()) {
			throw new Exception("Name must not be Empty or Null");
		}
		this.name = name;
	}
}
