package com.training.file.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MinimumCost {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        
	         int n = Integer.parseInt(br.readLine().trim());
	         long k = Long.parseLong(br.readLine().trim());
	         String[] arr_arr = br.readLine().split(" ");
	         int[] arr = new int[n];
	         for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
	         {
	         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
	         }

	         long out_ = Solve(k, arr);
	         System.out.println(out_);

	         wr.close();
	         br.close();
	    }
	    static long Solve(long k, int[] arr){
	        long amount=0;
	         for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < 0) {
	                int transferAmount = -arr[i];  // The amount we need to transfer to balance arr[i]
	                for (int j = i + 1; j < arr.length && j <= i + k; j++) {
	                    if (arr[j] > 0) {
	                        int transferable = Math.min(arr[j], transferAmount);
	                        arr[j] -= transferable;  // Transfer the value
	                        arr[i] += transferable;  // Balance the negative value
	                        transferAmount -= transferable;  // Reduce the transfer amount
	                    }
	                    if (transferAmount == 0) break;  // If no more transfer is needed
	                }

	           	 amount=transferAmount;
	            }
	        }
	        
	    return amount;
	    }
	}