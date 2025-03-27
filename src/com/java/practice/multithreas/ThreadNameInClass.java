package com.java.practice.multithreas;

public class ThreadNameInClass extends Thread {
	
	public ThreadNameInClass(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread is running: " + getName());
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		ThreadNameInClass thread=new ThreadNameInClass("Thread-A");
		ThreadNameInClass thread1=new ThreadNameInClass("Thread-B");
		
		thread.start();
		thread1.start();
		
		thread.setName("Thread-C"); //Reset thread name

		System.out.println("Thread is running: " + thread.getName());

	}

}
