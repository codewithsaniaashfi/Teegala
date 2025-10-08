package com.tnsif.task11;

public class StaticFinalDemo {

    // Static variable (shared by all objects)
    static int objectCount = 0;

    // Final variable (constant)
    final double PI = 3.14159;

    // Instance variable
    String name;

    // Constructor
    StaticFinalDemo(String name) {
        this.name = name;
        objectCount++;  // Increment count whenever an object is created
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("PI (final constant): " + PI);
    }

    // Static method to display the object count
    static void showObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    public static void main(String[] args) {
        StaticFinalDemo obj1 = new StaticFinalDemo("Object1");
        StaticFinalDemo obj2 = new StaticFinalDemo("Object2");

        obj1.display();
        System.out.println();

        obj2.display();
        System.out.println();

        // Access static method without object
        StaticFinalDemo.showObjectCount();

    }
}
