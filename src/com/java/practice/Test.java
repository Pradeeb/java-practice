package com.java.practice;

public class Test {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Initial");

        // Create two threads that will modify the StringBuilder
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sb.append("A");
                System.out.println("Thread 1: " + sb.toString());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sb.append("B");
                System.err.println("Thread 2: " + sb.toString());
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final result
        System.out.println("Final StringBuilder content: " + sb.toString());
        
	}
}


