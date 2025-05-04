package com.training.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementsInArray {
public static void main(String[] args) {
	 Integer[] array1 = {1, 2, 3, 4, 5};
     Integer[] array2 = {4, 5, 6, 7, 8};

     List<Integer> commonElements = Arrays.stream(array1)       // Convert the first array to a stream
                                          .filter(e -> Arrays.asList(array2).contains(e))  // Keep only elements that are in array2
                                          .collect(Collectors.toList());   // Collect the result into a list

     System.out.println(commonElements);  // Output: [4, 5]
     
    int e= IntStream.rangeClosed(1, 9).sum();
    int act= Arrays.stream(array1).reduce((a, b)->a+b).get();
    System.out.println(e);
    System.out.println(act);
    int di=e-act;
    System.out.println(di);
    		
}
}
