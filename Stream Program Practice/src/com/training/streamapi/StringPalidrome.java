package com.training.streamapi;

import java.util.stream.IntStream;

public class StringPalidrome {
public static void main(String[] args) {
	isPalindrome("church");
}

private static void isPalindrome(String input) {  
String	inp = input.toLowerCase();

// Use a stream to check if the string is equal to its reverse
boolean isPalindrome = IntStream.range(0, input.length() / 2)
        .allMatch(i -> inp.charAt(i) == inp.charAt(inp.length() - i - 1));

if(isPalindrome)
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not Palidrome");
}
}
}
