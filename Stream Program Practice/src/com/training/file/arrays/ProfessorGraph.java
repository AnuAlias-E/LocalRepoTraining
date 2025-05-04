package com.training.file.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProfessorGraph {
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
System.out.println(graph);
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

/*
 * private static int[][] solve(int N, int M, int[][] a, int q, int[] Queries) {
 * int[][] result = new int[N + 1][N + 1]; for (int i = 0; i < M; i++) { int x =
 * a[i][0]; int y = a[i][1]; result[x][y] = 1; result[y][x] = 1;
 * 
 * } for (int i = 0; i < q; i++) { int professor = Queries[i]; boolean
 * isNeighbour = false; for (int j = 1; j <= N; j++) { if (result[professor][j]
 * == 1) { // System.out.print(j + " "); isNeighbour = true; } else {
 * result[professor][j]=-1; isNeighbour=false; } }
 * 
 * // System.out.println(); } //System.out.println(); return result; }
 * 
 * }
 */
