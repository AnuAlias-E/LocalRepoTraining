package com.training.model;

public class Student {
	private int rollNumber;
	private String name;
	private char gender;
	private int mark1;
	private int mark2;

	public Student(int rollNumber, String name, char gender, int mark1, int mark2) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.gender = gender;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public Student() {
		super();
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getTotal() {
		return this.mark1 + this.mark2;
	}

	public double getAverage() {
		return this.getTotal() / 2.0;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", gender=" + gender + ", mark1=" + mark1
				+ ", mark2=" + mark2 + ", Total=" + getTotal() + ", Average=" + getAverage() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}

}
