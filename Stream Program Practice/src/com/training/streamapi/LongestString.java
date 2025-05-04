package com.training.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LongestString {
public static void main(String[] args) {
		getLongestString("The box is good one .the box is used to store pencil. pencil is used to write");
	}

	private static void getLongestString(String str) {
		str=str.replaceAll("[//.,]", "").toLowerCase();
	String [] strArray=	str.split(" ");
	String strin=Arrays.stream(strArray).reduce((a,b)->a.length()>b.length()?a:b).orElse(" ");
	 strin= Arrays.stream(strArray).max(Comparator.comparingInt(s->s.length())).orElse(null);
	System.out.println(strin);
}
}
