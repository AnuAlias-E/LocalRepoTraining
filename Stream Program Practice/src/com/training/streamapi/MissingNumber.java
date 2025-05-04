package com.training.streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
public static void main(String[] args) {
	int[]num= {1,2,4,5,6,7};
	
	int ex=IntStream.rangeClosed(1, 7).sum();
	int a=Arrays.stream(num).sum();
	int d=ex-a;
	System.out.println(d);
}
}
