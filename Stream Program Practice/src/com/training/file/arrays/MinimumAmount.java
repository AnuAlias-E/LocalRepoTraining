package com.training.file.arrays;

public class MinimumAmount {
	public static void main(String[] args) {
		int n = 1;
		int m = 1;
		int[] f = { 1, 2 };
		int[] b = { 2,1  };

		int r=minTo(n, m, f, b);
		System.out.println(r);
	}

	private static int minTo(int n, int m, int[] f, int[] b) {
		int low = 0;
		int fCost=0;
		for (int i = 0; i <n; i++) {
			 low = findLow(f,b, low);
			
			fCost+=low;
		}
		
		int bCost=0;
		low=0;
		for (int i = 0; i < m; i++) {
			 low = findLow(b,f, low);
			
			bCost+=low;
		}
		
		return fCost+bCost;
	}

	private static int findLow(int[] arr1,int[] arr2, int i) {
		int min = arr1[0];
		
		for (int j = 0; j < arr1.length; j++) {
			if (arr1[j] < min && arr1[j] > i&&arr1[j]!=-1) {
				min = arr1[j];
				arr2[j]=-1;
			}
		}
		return min;
	}
}
