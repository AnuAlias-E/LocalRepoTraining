package com.training.model;

public class Square implements Comparable {
	int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	@Override
	public int compareTo(Object o) {
		Square other = (Square) o;
		if (this.size < other.size)
			return -1;
		if (this.size > other.size)
			return 1;
		return 0;
	}

}
