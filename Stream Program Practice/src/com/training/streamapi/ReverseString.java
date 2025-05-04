package com.training.streamapi;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		reverseString("Java World!!");
		reverseStr("Java World45345!!");

	}

	private static void reverseStr(String string) {
		 String str= string.chars()  // Convert the string to an IntStream
	                .mapToObj(c -> (char) c)  // Convert IntStream to Stream<Character>
	                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) // Collect into a StringBuilder
	                .reverse() // Reverse the StringBuilder
	                .toString(); 
		 System.out.println(str);
		
	}

	private static void reverseString(String string) {
		String str =string.chars().mapToObj(c -> (char) c).collect(Collectors.collectingAndThen(Collectors.toList(), 
				list -> {
					Collections.reverse(list); // Reverse the list
					return list.stream() // Convert the list back to a stream
							.map(String::valueOf) // Convert characters back to string
							.collect(Collectors.joining()); // Join them into a single string
				}));
		System.out.println(str);
	}
	
}
