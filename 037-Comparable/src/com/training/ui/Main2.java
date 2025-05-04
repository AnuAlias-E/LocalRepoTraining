package com.training.ui;

import com.training.model.Square;

public class Main2 {
public static void main(String[] args) {
	Square square1 = new Square(100);
	Square square2 = new Square(20);
	int r = square1.compareTo(square2);
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

