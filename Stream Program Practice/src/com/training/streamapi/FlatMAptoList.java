package com.training.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMAptoList {
	public static void main(String[] args) {
  List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("apple", "banana", "cherry","kiwi"),
	            Arrays.asList("kiwi", "grape","apple"),
	            Arrays.asList("orange", "pear")
	        );
		getListOFListToListUsingflapMap(listOfLists);
	}

	private static void getListOFListToListUsingflapMap(List<List<String>> listOfLists) {
	List<String>list=listOfLists.stream().flatMap(c->c.stream()).distinct().collect(Collectors.toList());
	
	list.stream().forEach(c->System.out.print(c+" "));
		
	}
}
