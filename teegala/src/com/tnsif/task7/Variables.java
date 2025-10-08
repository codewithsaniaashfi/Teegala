package com.tnsif.task7;

public class Variables {
	

	    // Instance variable
	    String name = "Alice";

	    // Static variable (class variable)
	    static int objectCount = 0;

	    public void showDetails() {
	        // Local variable
	        int age = 25;

	        System.out.println("Name (instance variable): " + name);
	        System.out.println("Age (local variable): " + age);
	    }

	    public static void main(String[] args) {
	        // Creating objects
	        Variables obj1 = new Variables();
	        Variables obj2 = new Variables();

	        // Accessing instance and local variables
	        obj1.showDetails();
	        obj2.name = "Bob"; // changing instance variable for obj2
	        obj2.showDetails();

	        // Accessing static variable
	        objectCount = 2;
	        System.out.println("Total objects created (static variable): " + objectCount);
	    }
	}


