package com.java.practice.multithreas;

public class Test{
	
	
	public static void main(String[] args) throws InterruptedException {
		Runnable run = ()->{
			System.out.println(Thread.currentThread().getName());
		};
		
		Thread thread=new Thread(run,"Thread 1");
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());
		thread.interrupt();
		System.out.println(thread.getState());
		
	}
	
	
}
