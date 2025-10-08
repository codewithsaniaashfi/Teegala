package com.tnsif.task20;

//Interface 1
interface Printable {
 void print();
}

//Interface 2
interface Showable {
 void show();
}

//Class implementing both interfaces
class Display implements Printable, Showable {
 public void print() {
     System.out.println("Printing content...");
 }

 public void show() {
     System.out.println("Showing content...");
 }
}

//Main class
public class MultipleInterfaceDemo {
 public static void main(String[] args) {
     Display obj = new Display();
     obj.print();
     obj.show();
 }
}
