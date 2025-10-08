package com.tnsif.task13;

public class GetSet {
    // Private variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with simple validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        GetSet person = new GetSet();

        // Setting values
        person.setName("Alice");
        person.setAge(30);

        // Getting and displaying values
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's age: " + person.getAge());

        person.display();
    }
}
