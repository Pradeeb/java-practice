package com.java.practice.multithreas;

public class ThreadNameInterface {
	
	public static void main(String args []) {
		Runnable task1 = () -> System.out.println(Thread.currentThread().getName());
		Runnable task2 = () -> System.out.println(Thread.currentThread().getName());
		
		Thread thread1=new Thread(task1,"Thread-A");
		Thread thread2=new Thread(task2,"Thread-B");
		
		thread1.start();
		thread2.start();
		
		thread1.setName("Thread-C");
		
		System.out.println("Rename Thread :"+thread1.getName());
		System.out.println(thread1.getName());
	}

}
