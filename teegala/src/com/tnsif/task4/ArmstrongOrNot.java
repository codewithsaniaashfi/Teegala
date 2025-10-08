package com.tnsif.task4;
import java.util.Scanner;
public class ArmstrongOrNot {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number from user
	        System.out.print("Enter a number to check if it's an Armstrong number: ");
	        int number = scanner.nextInt();

	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is NOT an Armstrong number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is Armstrong
	    public static boolean isArmstrong(int number) {
	        int original = number;
	        int sum = 0;
	        int digits = String.valueOf(number).length();

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, digits);
	            number /= 10;
	        }

	        return sum == original;
	    }
	}


