package com.java.learn.multithreas;

public class LearnThreadPriority {

	public static void main(String[] args) {
		Runnable run = ( ) ->{
			for(int i =0 ; i <= 5 ; i++) {
			 System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
			}
		};
		
		Thread thread1=new Thread(run,"Thread 1");
		Thread thread2=new Thread(run,"Thread 2");
		
		

        thread1.setPriority(Thread.MIN_PRIORITY); // Set priority to 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Set priority to 10
	
		thread1.start();
		
		thread2.start();
	}

}
