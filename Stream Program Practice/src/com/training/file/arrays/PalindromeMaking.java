package com.training.file.arrays;
public class PalindromeMaking {

    // Function to calculate the length of Longest Palindromic Subsequence (LPS)
    public static int longestPalindromicSubsequence(String s) {
    	System.out.println(s);
        int n = s.length();
        int[] dp = new int[n];

        // Build the LPS using dynamic programming
        for (int cl = 1; cl <= n; cl++) {  // cl is the length of the substring
            int[] temp = new int[n];
            for (int i = 0; i <= n - cl; i++) {
                int j = i + cl - 1; // j is the endpoint of the current substring
                if (s.charAt(i) == s.charAt(j)) {
                	System.out.print(s.charAt(i)+" ");
                    temp[j] = (cl == 1) ? 1 : dp[j - 1] + 2;
             ///       System.out.println(temp[j]);
                    
                } else {
                	System.out.print(s.charAt(i)+" ");
                    temp[j] = Math.max(dp[j], (j > 0) ? temp[j - 1] : 0);
                   // System.out.println(temp[j]);
                    
                }
                
            }
            dp = temp;  // Move to the next level of substring length
        }
        System.out.println();
        for(int num:dp) {
        	System.out.print(num+" ");
        }
        System.out.println();
        return dp[n - 1];  // The last entry holds the length of the LPS
    }

    // Function to calculate the number of deletions to make the string a palindrome
    public static int minDeletionsToPalindrome(String s) {
        int lpsLength = longestPalindromicSubsequence(s);
        return s.length() - lpsLength;
    }

    public static void main(String[] args) {
        // Given input strings
        String[] strings = {"abcdc", "abbcdde", "gx", "plumex"};

        // Calculate and print the number of deletions required for each string
        for (String s : strings) {
            int deletions = minDeletionsToPalindrome(s);
            System.out.println("For string \"" + s + "\", number of deletions: " + deletions);
        }
    }
}
