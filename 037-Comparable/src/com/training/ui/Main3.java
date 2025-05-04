package com.training.ui;

import com.training.model.Person;

public class Main3 {
	public static void main(String[] args) {
		Person p1 = new Person("Anu", 40);
		Person p2 = new Person("Manu", 20);
		int r = p1.compareTo(p2);
		System.out.println(r);
		if (r < 0) {
			System.out.println(p1.getName() + " age is lesser than " + p2.getName() + " age");
		}
		if (r == 0)
			System.out.println(p1.getName() + " age is equal to " + p2.getName() + " age");
		if (r > 0)
			System.out.println(p1.getName() + " age is greater than " + p2.getName() + " age");
	}
}
