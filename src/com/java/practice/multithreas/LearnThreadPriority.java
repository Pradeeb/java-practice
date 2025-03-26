package com.java.practice.multithreas;

public class LearnThreadPriority {

	public static void main(String[] args) {
		Runnable run = ( ) ->{
			 System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
		};
		
		Thread thread1=new Thread(run);
		Thread thread2=new Thread(run);
		
		

        thread1.setPriority(Thread.MIN_PRIORITY); // Set priority to 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Set priority to 10
	
		thread1.start();
		
		thread2.start();
	}

}
