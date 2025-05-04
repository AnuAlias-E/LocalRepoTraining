package com.training.model;

public class Employee {
	char grade;

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public int getIncentivePercentage() {
		// A-40
		// B-30
		// C-20
		// D-10
		if (this.grade == 'A')
			return 40;
		else if (this.grade == 'B')
			return 30;
		else if (this.grade == 'C')
			return 20;
		else if (this.grade == 'D')
			return 10;
		else
			return 0;
	}
}
