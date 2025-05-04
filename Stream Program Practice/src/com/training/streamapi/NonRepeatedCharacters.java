package com.training.streamapi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonRepeatedCharacters {
	public static void main(String[] args) {
		String str = "Swiss";
		char ch = findFirstNonRepeatCharacter(str);
		System.out.println(ch);
	}

	private static char findFirstNonRepeatCharacter(String str) {
		// char[] charArray = str.toCharArray();
		Optional<Character> chars = str.chars().mapToObj(c -> (char) c).map(c -> Character.toLowerCase(c))
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();

		return chars.get();
	}
}
