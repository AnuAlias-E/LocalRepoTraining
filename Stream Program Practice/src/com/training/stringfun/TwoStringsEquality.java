package com.training.stringfun;

import java.util.stream.IntStream;

public class TwoStringsEquality {
public static void main(String[] args) {
	String str1="001101";
	String str2="110101";
	
	long n=IntStream.range(0, Math.min(str1.length(), str2.length())).filter(i->str1.charAt(i)==str2.charAt(i)).count();
	System.out.println(n);
	
	long count = IntStream.range(0, str1.length())
            .filter(i -> str1.charAt(i) == str2.charAt(i))
            .count();

    System.out.println("Count of matching characters: " + count);
}
}
