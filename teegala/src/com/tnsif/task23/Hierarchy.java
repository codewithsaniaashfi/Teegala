package com.tnsif.task23;
//Base class (parent)
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Derived class (child) inheriting from Animal
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Another derived class inheriting from Animal
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing");
 }
}

//Main class to test hierarchy
public class Hierarchy {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat();   // Inherited method
     dog.bark();  // Own method

     Cat cat = new Cat();
     cat.eat();   // Inherited method
     cat.meow();  // Own method
 }
}
