package com.training.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(30, 33, 23, 44, 88, 46, 68, 97);
	
System.out.println(list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
}
}
