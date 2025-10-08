package com.tnsif.task15;

class JoinExample extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("JoinExample Thread: " + i);
                Thread.sleep(500); // Sleep 0.5 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class WaitNotifyExample {
    synchronized void waitForSignal() {
        try {
            System.out.println("Thread waiting...");
            wait();  // Releases lock and waits
            System.out.println("Thread resumed after notify");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void sendSignal() {
        System.out.println("Sending notify...");
        notify();  // Wakes up waiting thread
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Demonstrate join()
        JoinExample t1 = new JoinExample();
        t1.start();

        try {
            // Main thread waits for t1 to finish
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread resumed after join()\n");

        // Demonstrate wait() and notify()
        WaitNotifyExample obj = new WaitNotifyExample();

        Thread t2 = new Thread(() -> obj.waitForSignal());
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(2000);  // Sleep 2 seconds before notifying
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            obj.sendSignal();
        });

        t2.start();
        t3.start();
    }
}
