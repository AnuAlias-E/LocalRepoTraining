package com.training.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoSortArrays {
public static void main(String[] args) {
	int[]num= {1,2,4,5,6,7};

	int[]nums= {3,8,9};
	
	int []list=IntStream.concat( Arrays.stream(num),Arrays.stream(nums)).sorted().toArray();
			
	for(int n:list)
	System.out.println(n);

}
}
