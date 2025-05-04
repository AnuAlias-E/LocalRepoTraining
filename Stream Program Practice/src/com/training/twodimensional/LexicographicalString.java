package com.training.twodimensional;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.List;

public class LexicographicalString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("zzzzzz", "zzzzzb","zzzzza");
        String targetString = "zzzzza";

        // Initialize variables to track the closest match
        String closestMatch = null;
        int minDistance = Integer.MAX_VALUE;
        boolean foundEqual = false;

        // Iterate over each string in the list
        for (String str : stringList) {
            // Lexicographical comparison
            int lexicographicalComparison = targetString.compareTo(str);
            if (lexicographicalComparison == 0) {
                // If strings are lexicographically equal, update closest match
                foundEqual = true;
                closestMatch = str;
                minDistance = 0;
                System.out.println("close: "+closestMatch);
                break; // No need to check further if an exact match is found
            } else if (lexicographicalComparison < 0) {
                System.out.println("\"" + targetString + "\" comes before \"" + str + "\"");
            } else {
                System.out.println("\"" + targetString + "\" comes after \"" + str + "\"");
            }

            // Levenshtein distance calculation
            int distance = computeLevenshteinDistance(targetString, str);
            if (distance < minDistance) {
                minDistance = distance;
                closestMatch = str;
            }
        }

        // Output the result
        if (foundEqual) {
            System.out.println("Exact match found: \"" + closestMatch + "\"");
        } else {
            System.out.println("Closest match based on Levenshtein distance: \"" + closestMatch + "\" with distance " + minDistance);
        }
    }

    // Method to compute Levenshtein distance
    public static int computeLevenshteinDistance(String str1, String str2) {
//        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
//
//        // Initialize base cases
//        for (int i = 0; i <= str1.length(); i++) {
//            dp[i][0] = i;
//        }
//        for (int j = 0; j <= str2.length(); j++) {
//            dp[0][j] = j;
//        }
//
//        // Compute the distance
//        for (int i = 1; i <= str1.length(); i++) {
//            for (int j = 1; j <= str2.length(); j++) {
//                int cost = (str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1;
//                dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1),
//                        dp[i - 1][j - 1] + cost);
//            }
//        }
//
//        return dp[str1.length()][str2.length()];
    	

        int len1 = str1.length();
        int len2 = str2.length();
        int distance = 0;
        
        // Loop through each character in both strings
        for (int i = 0; i < Math.max(len1, len2); i++) {
            // If the characters are different or one string is shorter
            if (i >= len1 ||) {
                distance++;
            }
        }
        
        return distance;
    }
}
