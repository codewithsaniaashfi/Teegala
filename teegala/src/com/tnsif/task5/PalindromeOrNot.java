package com.tnsif.task5;
import java.util.Scanner;
public class PalindromeOrNot {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a number to check if it's a palindrome: ");
	        int number = scanner.nextInt();

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome number.");
	        } else {
	            System.out.println(number + " is NOT a palindrome number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is a palindrome
	    public static boolean isPalindrome(int number) {
	        int original = number;
	        int reversed = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }

	        return original == reversed;
	    }
	}


