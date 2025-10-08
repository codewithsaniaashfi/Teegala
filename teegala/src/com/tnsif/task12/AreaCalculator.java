package com.tnsif.task12;

//Abstract class
abstract class Shape {
 abstract double area();  // Abstract method
}

//Square class extends Shape
class Square extends Shape {
 double side;

 Square(double side) {
     this.side = side;
 }

 // Implement abstract method
 @Override
 double area() {
     return side * side;
 }
}

//Rectangle class extends Shape
class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implement abstract method
 @Override
 double area() {
     return length * width;
 }
}

public class AreaCalculator {
 public static void main(String[] args) {
     Shape square = new Square(5);
     Shape rectangle = new Rectangle(10, 4);

     System.out.println("Area of square: " + square.area());
     System.out.println("Area of rectangle: " + rectangle.area());
 }
}
