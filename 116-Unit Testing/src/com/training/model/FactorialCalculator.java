package com.training.model;

public class FactorialCalculator {
	int num;

	public FactorialCalculator(int num) {
		super();
		this.num = num;
	}

	public FactorialCalculator() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public long calculate() {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}
