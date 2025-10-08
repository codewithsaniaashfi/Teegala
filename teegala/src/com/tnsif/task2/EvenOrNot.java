package com.tnsif.task2;

import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is not even.");
        }

        scanner.close();
    }
}

