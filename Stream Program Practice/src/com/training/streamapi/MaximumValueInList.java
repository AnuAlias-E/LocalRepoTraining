package com.training.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MaximumValueInList {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(30,101, 33, 23, 44, 88, 46, 68, 97);
	getMaximumNumberListUsingMax(list);
	getMaximumNumberListUsingSorted(list);
}

private static void getMaximumNumberListUsingMax(List<Integer> list) {
	int n=list.stream().max(Integer::compareTo).get();
	System.out.println(n);
	
}

private static void getMaximumNumberListUsingSorted(List<Integer> list) {
Optional<Integer> n=	list.stream().sorted(Collections.reverseOrder()).findFirst();
System.out.println(n.get());
}
}
