package com.training.twodimensional;
public class Hbbh { 
    public static void main(String[] args) {
        String village = "H...H";  // Example village layout

        // Convert the village layout to a character array for easy manipulation
        char[] villageArray = village.toCharArray();

        // Check if the village can be divided
        if (canDivideVillage(villageArray)) {
            System.out.println("YES");
            System.out.println(new String(villageArray));
        } else {
            System.out.println("NO");
        }
    }

    // Method to check if the village can be divided
    private static boolean canDivideVillage(char[] village) {
        int n = village.length;

        // Iterate through the village layout
        for (int i = 0; i < n - 1; i++) {
            // If two houses are adjacent, it's impossible to divide them
            if (village[i] == 'H' && village[i + 1] == 'H') {
                return false;
            }

            // Place fences ('B') between houses if there's an empty space
            if (village[i] == 'H' && village[i + 1] == '.') {
            	// Place fences between houses
                while (i + 1 < n && village[i + 1] == '.') {
                    village[i + 1] = 'B';
                    i++;  // Move to the next empty space
                }
            }
        }

       
        return true;
    }
}
