package com.training.streamapi;

import java.util.Arrays;
import java.util.List;

public class EvenNumberList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30, 33, 23, 44, 88, 46, 68, 97);
		getEvenNumberList(list);
	}

	private static void getEvenNumberList(List<Integer> list) {
		list.stream().filter(c -> c % 2 == 0).forEach(System.out::println);

	}
}
