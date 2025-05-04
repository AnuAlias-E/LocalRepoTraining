package com.training.twodimensional;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;

public class ZooWordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().trim();
        scanner.close();

        if (isValidZooWord(word)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isValidZooWord(String word) {
        // Check if the word contains only 'z' and 'o' characters
        if (!word.matches("[zo]*")) {
            return false;
        }

        // Count occurrences of 'z' and 'o'
        int zCount = 0;
        int oCount = 0;
        for (char c : word.toCharArray()) {
            if (c == 'z') {
                zCount++;
            } else if (c == 'o') {
                oCount++;
            }
        }

        // Check if the number of 'o's is twice the number of 'z's
        return oCount == 2 * zCount;
    }
}
