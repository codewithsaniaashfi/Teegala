package com.tnsif.task16;

// Thread class
class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    // Overriding run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.\n");
    }
}

// Main class
public class Multithreading {
    public static void main(String[] args) {
        // Creating thread objects
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        // Starting the threads
        t1.start();
        t2.start();

        System.out.println("Main thread finished.");
    }
}
