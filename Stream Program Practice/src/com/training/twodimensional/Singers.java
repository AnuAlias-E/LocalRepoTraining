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
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

                // Reading input
        Scanner scanner = new Scanner(System.in);
        
        // Number of songs in the playlist
        int N = scanner.nextInt();
        
        // Map to count occurrences of each singer
        Map<Long, Integer> singerCount = new HashMap<>();
        
        // Reading singer IDs and updating their counts
        for (int i = 0; i < N; i++) {
            long singer = scanner.nextLong();
            singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
        }
        
        // Finding the maximum number of songs by any singer
        int maxCount = 0;
        for (int count : singerCount.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        // Counting how many singers have the maximum number of songs
        int favoriteSingers = 0;
        for (int count : singerCount.values()) {
            if (count == maxCount) {
                favoriteSingers++;
            }
        }
        
        // Outputting the result
        System.out.println(favoriteSingers);

    }
}
