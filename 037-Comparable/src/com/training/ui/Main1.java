package com.training.ui;

import com.training.model.Circle;

public class Main1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		int r = c1.compareTo(c2);
		System.out.println(r);
		if (r < 0) {
			System.out.println("Invoking object is lesser than parameter object");
		}
		if (r == 0)
			System.out.println("Invoking obj is equal to parameter object");
		if (r > 0)
			System.out.println("Invoking obj is greater than parameter object");
	}
}
