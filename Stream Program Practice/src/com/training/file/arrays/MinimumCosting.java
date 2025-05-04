package com.training.file.arrays;

import java.util.Arrays;

public class MinimumCosting {
    public static void main(String[] args) {

        // First case: selecting 6 backend developers and 7 frontend developers
      //  int[] f = {1, 4, 7, 3, 9, 5, 8, 10, 2, 3, 5, 6, 4}; // Frontend developers' costs (13 elements)
      //  int[] b = {2, 5, 6, 1, 10, 3, 4, 8, 3, 7, 13, 11, 14}; // Backend developers' costs (13 elements)
int[]f= {1,26,20,27,19,16,6,9,30,24,20};
int[ ]b= {16,21,19,9,17,17,6,10,13,28,8};
        int n = 6; // Number of backend developers to select
        int m = 5; // Number of frontend developers to select

        // Compute minimum cost for the first case
        int r = minTo(n, m, f, b);
        System.out.println("Minimum Total Cost for selecting " + n + " backend developers and " + m + " frontend developers: " + r);

        
        // Second case: selecting 7 backend developers and 6 frontend developers
    //    int[] b1= {1, 4, 7, 3, 9, 5, 8, 10, 2, 3, 5, 6, 4}; // Frontend developers' costs (13 elements)
       // int[] f1 = {2, 5, 6, 1, 10, 3, 4, 8, 3, 7, 13, 11, 14}; // Backend developers' costs (13 elements)
        int[] b1={1,26,20,27,19,16,6,9,30,24,20};
        		int[] f1 ={16,21,19,9,17,17,6,10,13,28,8};
        int n1 = 6; // Number of backend developers to select
        int m1 = 5; // Number of frontend developers to select

        // Compute minimum cost for the second case
        int r1 = minTo(n1, m1, f1, b1);
        System.out.println("Minimum Total Cost for selecting " + n1 + " backend developers and " + m1 + " frontend developers: " + r1);
}

    private static int minTo(int n, int m, int[] f, int[] b) {
        int numDevs = n + m; // Total developers to consider is n + m
        int[][] devpairs = new int[numDevs][2]; // Pair to store (frontend cost, backend cost)

        // Combine the frontend and backend costs for each developer
        for (int i = 0; i < numDevs; i++) {
            devpairs[i][0] = f[i]; // Frontend cost for developer i
            devpairs[i][1] = b[i]; // Backend cost for developer i
        }

        // Sort the developer pairs by the absolute difference between frontend and backend costs
        Arrays.sort(devpairs, (x, y) ->Math.min( Math.min(x[0] , x[1]) , Math.min(y[0] , y[1])));

        int tot = 0; // Variable to hold the total cost
        int fcount = 0; // Counter for frontend developers selected
        int bcount = 0; // Counter for backend developers selected

        // Iterate through the sorted developer pairs and greedily select developers
        for (int i = 0; i < numDevs; i++) {
            if ((devpairs[i][0] <= devpairs[i][1] && fcount < m) || bcount >= n) {
                tot += devpairs[i][0]; // Select from frontend
                fcount++; // Increment frontend counter
            } else {
                tot += devpairs[i][1]; // Select from backend
                bcount++; // Increment backend counter
            }

            // Stop when we have selected the required number of frontend and backend developers
            if (fcount == m && bcount == n) {
                break;
            }
        }

        // Debugging: print the count of frontend and backend developers selected
        System.out.println("Frontend developers selected: " + fcount);
        System.out.println("Backend developers selected: " + bcount);

        return tot; // Return the minimum total cost
    }
}
