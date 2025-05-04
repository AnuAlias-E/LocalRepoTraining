package com.training.model;

public class Circle implements Comparable {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int compareTo(Object o) {
		Circle other = (Circle) o;// c2 object
		//this -invoking circle object
		if (this.radius < other.radius)
			return -1;
		if (this.radius > other.radius)
			return 1;
		return 0;
	}

}
