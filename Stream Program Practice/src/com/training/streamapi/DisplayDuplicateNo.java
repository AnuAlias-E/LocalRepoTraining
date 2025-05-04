package com.training.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DisplayDuplicateNo {
	public static void main(String[] args) {
		// int[] arr = {};
		List<Integer> numbers = Arrays.asList(10, 20, 40, 10, 30, 60, 40);
		List<Integer> dupli = numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
				.stream().filter(f -> f.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(dupli);

		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 5);

	List<Integer> list=	numbers1.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());
System.out.println(list);

String str="Hi, I am learning java and streams is a new feature introduced in java and streams is interesting";
String[]list2=str.split(" ");

System.out.println(str);
Map<String,Long> map=Arrays.stream(list2).map(e->e.replaceAll("[.,!?;:']", ""))
.map(f->f.toLowerCase())
.collect(Collectors.groupingBy(g->g,Collectors.counting()));
System.out.println(map);
System.out.println(" ");
map.forEach((word,count)-> System.out.print(word +" : "+count+" , "));


String str1="I went to the coffee shop. I ordered capccicuno. it was so nice and tasty. I went to the cake shop also";
System.out.println("\nNEw String: "+str1);
Map<String , Long>map1=Arrays.asList(str1.split(" "))
.stream()
.map(g->g.replaceAll("[.,/'!?@#$%^&*:; ]", ""))
.map(d->d.toLowerCase())
.collect(Collectors.groupingBy(d->d,Collectors.counting()));
map1.forEach((m,c)->System.out.print(m + " : "+c+","));

System.out.println("\n"+map1);




	}
}
