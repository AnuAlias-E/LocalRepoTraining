package com.training.file.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph1 {
public static void main(String[] args) {
	int N = 5;
	int M = 4;
	int[][] a = { { 1, 4 }, { 1, 3 }, { 1, 2 }, { 2, 4 } };
	int q = 5;
	int[] Queries = { 1, 2, 3, 4, 5 };
	int[][] result = solve(N, M, a, q, Queries);
	for (int[] row : result) {
		for (int val : row) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
		// Solve the problem

 
		

	
}

private static int[][] solve(int n, int m, int[][] a, int q, int[] queries) {
	List<List<Integer>> profGraph=new ArrayList<List<Integer>>();
	for(int i=0;i<n;i++) {
		profGraph.add(new ArrayList<>()); 
	}
	for(int[]edge:a) {
		profGraph.get(edge[0]).add(edge[1]);
		profGraph.get(edge[1]).add(edge[0]);
	}
	
	int [][]result=new int[q][];
	for(int i=0;i<q;i++) {
		int professor=queries[i];
	
	List<Integer>neighs= profGraph.get(professor);
	Collections.sort(neighs);
	if(neighs.isEmpty()) {
		result[i]=new int[] {-1};
	}
	else {
	for(int j=0;j<neighs.size();j++) {
		result
	}
	}
}}
}
