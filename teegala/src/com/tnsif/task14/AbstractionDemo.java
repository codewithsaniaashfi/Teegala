package com.tnsif.task14;

//Abstract class
abstract class Animal {
 abstract void sound();  // Abstract method

 void sleep() {          // Regular method
     System.out.println("Sleeping...");
 }
}

class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks: Woof Woof");
 }
}

class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows: Meow Meow");
 }
}

public class AbstractionDemo {
 public static void main(String[] args) {
     Animal dog = new Dog();
     Animal cat = new Cat();

     dog.sound();
     dog.sleep();

     cat.sound();
     cat.sleep();
 }
}
