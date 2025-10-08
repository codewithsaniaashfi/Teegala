package com.tnsif.task18;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a jagged array (static way)
        int[][] jagged = {
            {1, 2, 3},           // Row 0 has 3 elements
            {4, 5},              // Row 1 has 2 elements
            {6, 7, 8, 9}         // Row 2 has 4 elements
        };

        // Displaying the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
