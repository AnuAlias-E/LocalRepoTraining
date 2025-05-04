package com.training.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Anu", "Renju", "Mamqueen", "Sara", "Nimmi", "Minsiya");
		groupWordsBasedonLength(list);
	}

	private static void groupWordsBasedonLength(List<String> list) {
		Map<Object, List<String>> collect = list.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(collect);
	}
}
