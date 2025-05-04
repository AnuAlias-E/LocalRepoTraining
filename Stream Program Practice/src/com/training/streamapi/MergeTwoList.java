package com.training.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "banana", "cherry", "kiwi");
		List<String> list2 = Arrays.asList("kiwi", "grape", "apple", "cherry", "banana");
		List<String> list = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		System.out.println(list);
	}
}
