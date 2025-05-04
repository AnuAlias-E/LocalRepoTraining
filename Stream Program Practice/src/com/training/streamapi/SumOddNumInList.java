package com.training.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumOddNumInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30, 33, 23, 44, 88, 46, 68, 97);
		addOddNumberList(list);
	}

	private static void addOddNumberList(List<Integer> list) {
	int sum=list.stream().filter(n->n%2!=0).mapToInt(n->n.intValue()).sum();
		System.out.println(sum);
	}
}
