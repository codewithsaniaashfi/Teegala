package com.tnsif.task22;

public class TryCatch {
	
	    public static void main(String[] args) {
	        try {
	            int[] arr = {1, 2, 3};
	            System.out.println("Accessing element at index 3:");
	            System.out.println(arr[3]);  // ArrayIndexOutOfBoundsException

	            // Nested try-catch inside outer try block
	            try {
	                String str = "Hello";
	                System.out.println("Character at index 10:");
	                System.out.println(str.charAt(10)); // StringIndexOutOfBoundsException
	            } catch (StringIndexOutOfBoundsException e) {
	                System.out.println("Nested Catch: String index out of bounds!");
	            }
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Catch 1: Array index out of bounds!");
	        } catch (NullPointerException e) {
	            System.out.println("Catch 2: Null pointer exception!");
	        } catch (Exception e) {
	            System.out.println("Catch 3: Some other exception occurred!");
	        }

	        System.out.println("Program continues...");
	    }
	}


