package com.java.learn.multithreas;

public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable run =()->{
			for(int i=0; i<=5; i++) {
				System.out.println("Thread Name :"+Thread.currentThread().getName()+" Thread Priority"+Thread.currentThread().getPriority());
			}
		};
		
		Thread thread1=new Thread(run,"Thread-A");
		Thread thread2=new Thread(run,"Thread-B");
		Thread thread3=new Thread(run,"Thread-C");
		
        // Set the priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

		
		// Start threads in priority order
        thread3.start();
        thread3.join(); // Ensures thread3 finishes first

        thread2.start();
        thread2.join(); // Ensures thread2 finishes before thread1

        thread1.start();
        thread1.join(); // Ensures thread1 finishes last
	}

}
