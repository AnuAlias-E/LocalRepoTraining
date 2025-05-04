package com.training.streamapi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccursInString {
	public static void main(String[] args) {
		getCountOccursInString("Javadeveloper");
	}
//Optional<Character> chars = str.chars().mapToObj(c -> (char) c).map(c -> Character.toLowerCase(c))
//	.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
	//.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();

	private static void getCountOccursInString(String str) {
Map<Character, Long>entrySet = str.chars().mapToObj(c -> (char) c).collect(
		Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()));
System.out.println(entrySet);
	}
	
	
	

}
