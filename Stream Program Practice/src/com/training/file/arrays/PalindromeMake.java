package com.training.file.arrays;

public class PalindromeMake {

	// Function to calculate the length of Longest Palindromic Subsequence (LPS)
	public static int longestPalindromicSubsequence(String s) {
		int n = s.length();

		// Create a 2D DP array where dp[i][j] will store the length of LPS for
		// substring s[i...j]
		int[][] dp = new int[n][n];

		// Every single character is a palindrome of length 1
		for (int i = 0; i < n; i++) {
			dp[i][i] = 1;
		}

		// Fill the DP table
		for (int cl = 2; cl <= n; cl++) { // cl is the length of the substring
			for (int i = 0; i <= n - cl; i++) {
				int j = i + cl - 1; // j is the endpoint of the current substring

				// If characters match, extend the LPS
				if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = (cl == 2) ? 2 : dp[i + 1][j - 1] + 2;
				} else {
					// If characters don't match, take the maximum LPS by excluding either character
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}

		// The length of the LPS for the entire string will be in dp[0][n-1]
		return dp[0][n - 1];
	}

	// Function to calculate the number of deletions to make the string a palindrome
	public static int minDeletionsToPalindrome(String s) {
		int lpsLength = longestPalindromicSubsequence(s);
		return s.length() - lpsLength;
	}

	public static void main(String[] args) {
		// Given input strings
		String[] strings = { "abcdc", "abbcdde", "gx", "plumex" };

		// Calculate and print the number of deletions required for each string
		for (String s : strings) {
			int deletions = minDeletionsToPalindrome(s);
			System.out.println("For string \"" + s + "\", number of deletions: " + deletions);
		}
	}
}
