package com.tnsif.task10;

public class ConstructorOverloading {
    String name;
    int age;
    double salary;

    // Constructor 1: No parameters
    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
        salary = 0.0;
    }

    // Constructor 2: One parameter
    ConstructorOverloading(String name) {
        this.name = name;
        age = 0;
        salary = 0.0;
    }

    // Constructor 3: Two parameters
    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        salary = 0.0;
    }

    // Constructor 4: Three parameters
    ConstructorOverloading(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("Alice");
        ConstructorOverloading obj3 = new ConstructorOverloading("Bob", 30);
        ConstructorOverloading obj4 = new ConstructorOverloading("Charlie", 25, 55000);

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}

