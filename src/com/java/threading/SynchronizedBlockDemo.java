package com.java.threading;

public class SynchronizedBlockDemo {
    Object lock = new Object();
    private int sharedCounter = 0;

    public void increment() {
        synchronized (lock) {
            sharedCounter++;
        }
    }
    public int getSharedCounter() {
        synchronized (lock) {
            return sharedCounter;
        }
    }


    public static void main(String[] args) {
        final SynchronizedBlockDemo example = new SynchronizedBlockDemo();

        // Create two threads that increment the shared counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.increment();
            }
            System.out.println(example.sharedCounter);
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.increment();
            }
            System.out.println(example.sharedCounter);
        });

        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the shared counter
        System.out.println("Shared Counter: " + example.getSharedCounter());
    }
}

