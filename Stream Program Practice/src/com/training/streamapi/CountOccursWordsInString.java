package com.training.streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccursWordsInString {
public static void main(String[] args) {
	getCountOccursWordsInString("The box is good one .the box is used to store pencil. pencil is used to write");
}

private static void getCountOccursWordsInString(String str) {
	str=str.replaceAll("[//.,]", "").toLowerCase();
String [] strArray=	str.split(" ");
Map<String,Long> map=Arrays.stream(strArray).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting() ));
System.out.println(map);
}
}
