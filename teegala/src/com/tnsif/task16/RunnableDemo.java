package com.tnsif.task16;

//Task class that implements Runnable interface
class MyTask implements Runnable {
 String taskName;

 MyTask(String name) {
     this.taskName = name;
 }

 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(taskName + " - Count: " + i);
         try {
             Thread.sleep(500); // pause for 0.5 seconds
         } catch (InterruptedException e) {
             System.out.println(taskName + " interrupted.");
         }
     }
     System.out.println(taskName + " finished.\n");
 }
}

//Main class with a better name
public class RunnableDemo {
 public static void main(String[] args) {
     // Create Runnable tasks
     Runnable task1 = new MyTask("Task A");
     Runnable task2 = new MyTask("Task B");

     // Create threads using the tasks
     Thread t1 = new Thread(task1);
     Thread t2 = new Thread(task2);

     // Start the threads
     t1.start();
     t2.start();

     System.out.println("Main thread finished.");
 }
}
