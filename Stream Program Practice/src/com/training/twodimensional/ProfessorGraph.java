package com.training.twodimensional;



import java.io.*;

import java.util.*;
 
/*

* sample input

* 5 4  ->N and M

* 1 2  ->M pairs of integers

* 1 3

* 3 4

* 3 5

* 3    ->number of quries

* 1 3 2 ->q integers.Each represents a professor's city and we need to find its neighbors

* 

* output

* 2,3

* 1,4,5

* 1

*/
 

public class ProfessorGraph
{

	public static void main(String[] args) throws IOException {
int N=5;
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
 
	static int[][] solve(int N, int M, int[][] a, int q, int[] Queries) {

		// Create adjacency list for the graph (1-based indexing)
 
		List<List<Integer>> graph = new ArrayList<>();

		for (int i = 0; i <= N; i++) {

			graph.add(new ArrayList<>());

		}
 
		// Build the graph

		for (int[] edge : a) {

			graph.get(edge[0]).add(edge[1]);

			graph.get(edge[1]).add(edge[0]);

		}
 
		// Prepare the result array

		int[][] result = new int[q][];
 
		// Process each query

		for (int i = 0; i < q; i++) {

			int professor = Queries[i];

			List<Integer> neighbors = graph.get(professor);

			Collections.sort(neighbors);

			if (neighbors.isEmpty()) {

				result[i] = new int[] { -1 };

			} else {
 
				result[i] = new int[neighbors.size()];

				for (int j = 0; j < neighbors.size(); j++) {

					result[i][j] = neighbors.get(j);

				}

			}

		}
 
		return result;

	}

}
 