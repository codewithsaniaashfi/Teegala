package com.tnsif.task14;

//Interface
interface Vehicle {
 void start();   // Abstract method by default
 void stop();
}

class Car implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car starts with key");
 }

 @Override
 public void stop() {
     System.out.println("Car stops with brake");
 }
}

class Bike implements Vehicle {
 @Override
 public void start() {
     System.out.println("Bike starts with button");
 }

 @Override
 public void stop() {
     System.out.println("Bike stops with brake");
 }
}

public class InterfaceDemo {
 public static void main(String[] args) {
     Vehicle car = new Car();
     Vehicle bike = new Bike();

     car.start();
     car.stop();

     bike.start();
     bike.stop();
 }
}
