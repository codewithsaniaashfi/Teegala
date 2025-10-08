package com.tnsif.task22;

public class ExceptionHandling {
	
	    public static void main(String[] args) {
	        // ArrayIndexOutOfBoundsException example
	        int[] numbers = {10, 20, 30};
	        try {
	            System.out.println("Accessing 4th element: " + numbers[3]); // Invalid index
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught Exception: Array index is out of bounds!");
	        }

	        System.out.println();

	        // StringIndexOutOfBoundsException example
	        String str = "Hello";
	        try {
	            System.out.println("Character at index 10: " + str.charAt(10)); // Invalid index
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Caught Exception: String index is out of bounds!");
	        }

	        System.out.println();

	        // General catch block example
	        try {
	            int result = 10 / 0; // ArithmeticException
	        } catch (Exception e) {
	            System.out.println("Caught General Exception: " + e);
	        }
	    }
	}


