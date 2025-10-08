package com.tnsif.task3;
import java.util.Scanner;
public class PrimeOrNot {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Ask the user to enter a number
	        System.out.print("Enter a number to check if it's prime: ");
	        int number = scanner.nextInt();
	        
	        // Check if the number is prime
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        
	        scanner.close();
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; // Numbers less than or equal to 1 are not prime
	        }
	        
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; // Number is divisible by some number other than 1 and itself
	            }
	        }
	        
	        return true; // Number is prime
	    }
	}


