package com.java.learn.multithreas;

public class ThreadInterruption {

	public static void main(String[] args) {
		
		Runnable task= ()->{
			while (!Thread.currentThread().isInterrupted()) {
	            System.out.println(Thread.currentThread().getName() + " is running.");
	            try {
	                Thread.sleep(1000); // Sleep for 1 second
	            } catch (InterruptedException e) {
	                System.out.println(Thread.currentThread().getName() + " was interrupted during sleep.");
	                Thread.currentThread().interrupt(); // Re-interrupt the thread
	            }
	        }
	        System.out.println(Thread.currentThread().getName() + " has finished.");
		};
		
		Thread thread=new Thread(task,"Thread-A");

		thread.start();
		
		try {
			Thread.sleep(20000);
		}catch(InterruptedException e) {
			
		}
		
		thread.interrupt();
		// we do not use join so it come first in console
		System.err.println("Completed");
		
	}

}
