package com.training.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Anu","Renju","Mamqueen","Sara","Nimmi","Minsiya");
	sortStringsBasedonLength(list);
	
	getStringofLength5(list);
}

private static void getStringofLength5(List<String> list) {
	System.out.println();
	String str=list.stream().sorted().filter(c->c.length()==5).findFirst().get();
	System.out.println(str);
	
}

private static void sortStringsBasedonLength(List<String> list) {
	list.stream().sorted(Comparator.comparingInt(n->n.length()))
	.collect(Collectors.toList()).forEach(n->System.out.print(n+" "));
	
}
}
