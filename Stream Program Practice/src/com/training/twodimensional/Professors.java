package com.training.twodimensional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Professors {
	public static void main(String[] args) {

		int N = 5;
		int M = 4;
		int[][] a = { { 1, 4 }, { 1, 3 }, { 1, 2 }, { 2, 4 } };
		int q = 5;
		int[] Queries = { 1, 2, 3, 4, 5 };

		int[][] result = solve(N, M, a, q, Queries);

		// Print the result

		for (int[] row : result) {

			for (int val : row) {

				System.out.print(val + " ");

			}

			System.out.println();

		}
	}

	private static int[][] solve(int n, int m, int[][] a, int q, int[] queries) {
		List<List<Integer>> graph= new ArrayList<List<Integer>>();
		
		for(int i=0;i<=n;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int[]edge:a) {
			graph.get(edge[0]).add(edge[1]);
			graph.get(edge[1]).add(edge[0]);
		}
		
		int [][]result=new int[q][];
		
		for(int i=0;i<q;i++) {
			int prof=queries[i];
			List<Integer> neighs=graph.get(prof);
			Collections.sort(neighs);
			
			if(neighs.isEmpty()) {
				result[i]=new int[] {-1}; 
			}
			else {
				result[i] = new int[neighs.size()];

				for (int j = 0; j < neighs.size(); j++) {

					result[i][j] = neighs.get(j);

				}
			}
			
			
		}
		return result;
		
		
		
		
		
	}
}
