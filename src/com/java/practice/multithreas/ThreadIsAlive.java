package com.java.practice.multithreas;

public class ThreadIsAlive extends Thread {
	
	public ThreadIsAlive(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0 ; i <= 5 ;i++) {
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Sleep for 500 milliseconds
			System.out.println(getName()+" =>"+i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadIsAlive thread1=new ThreadIsAlive("Thread-A");
		
		  System.out.println("Before starting, is Thread-1 alive? " + thread1.isAlive());

	        thread1.start(); // Start thread1

	        System.out.println("After starting, is Thread-1 alive? " + thread1.isAlive());

	        //we did not give this main thread completed quick
	        try {
	            thread1.join(); // Wait for thread1 to finish
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("After finishing, is Thread-1 alive? " + thread1.isAlive());
	}

}
