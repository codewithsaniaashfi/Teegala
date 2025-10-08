package com.tnsif.task19;

//Parent interface
interface Vehicle {
 void start();
}

//Child interface extending parent interface
interface Car extends Vehicle {
 void drive();
}

//Concrete class implementing the child interface
class Sedan implements Car {
 // Must implement both start() and drive()
 public void start() {
     System.out.println("Sedan is starting...");
 }

 public void drive() {
     System.out.println("Sedan is driving...");
 }
}

//Main class to run the program
public class InterfaceExtendDemo {
 public static void main(String[] args) {
     Sedan myCar = new Sedan();
     myCar.start();  // from Vehicle
     myCar.drive();  // from Car
 }
}
