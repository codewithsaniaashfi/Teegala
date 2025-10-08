package com.tnsif.task9;

public class MethodOverload {


	    // Method 1: No parameters
	    void display() {
	        System.out.println("Display with no parameters");
	    }

	    // Method 2: One int parameter
	    void display(int a) {
	        System.out.println("Display with int parameter: " + a);
	    }

	    // Method 3: Two int parameters
	    void display(int a, int b) {
	        System.out.println("Display with two int parameters: " + a + ", " + b);
	    }

	    // Method 4: One double parameter
	    void display(double a) {
	        System.out.println("Display with double parameter: " + a);
	    }

	    // Method 5: One String parameter
	    void display(String s) {
	        System.out.println("Display with String parameter: " + s);
	    }

	    // Method 6: One int and one String parameter
	    void display(int a, String s) {
	        System.out.println("Display with int and String: " + a + ", " + s);
	    }

	    // Method 7: One String and one int parameter (different order)
	    void display(String s, int a) {
	        System.out.println("Display with String and int: " + s + ", " + a);
	    }

	    public static void main(String[] args) {
	        MethodOverload obj = new MethodOverload();

	        // Calling all overloaded methods
	        obj.display();
	        obj.display(10);
	        obj.display(10, 20);
	        obj.display(5.5);
	        obj.display("Hello");
	        obj.display(25, "World");
	        obj.display("Java", 100);
	    }
	}

