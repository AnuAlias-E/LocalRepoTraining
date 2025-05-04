package com.training.file.arrays;

import java.util.Arrays;

public class MinCost {
public static void main(String[] args) {
	int n=3,X=5;
	int[]A= {50,1,50};
	System.out.println(minCostTo(n,X,A));
}

private static int minCostTo(int n, int x, int[] a) {
	int []cost=new int[n+1];
	Arrays.fill(cost, Integer.MAX_VALUE);
	//minCost[0]=0;
	
	
	for(int i=1;i<n;i++) {
		cost[(i%n)+1]=Math.min(cost[(i%n)+1], a[i]);
	}
	int []minCost=new int[n+1];
	Arrays.fill(minCost, Integer.MAX_VALUE);
	minCost[0]=0;
	
	
	//int result=minCost[n];
	for(int i=1;i<=n;i++) {
		minCost[i]=Math.min(minCost[i-1]+cost[i], minCost[i-1]+x);
	}
	return minCost[n];
}
}
