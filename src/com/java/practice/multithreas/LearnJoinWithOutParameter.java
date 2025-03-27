package com.java.practice.multithreas;


public class LearnJoinWithOutParameter {

	public static void main(String[] args) {
		
		Runnable run= () -> {
			for(int i=0 ; i<=5 ; i++) {
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		};
		
		Thread thread1=new Thread(run);
		Thread thread2=new Thread(run);
		
		thread1.start();
		thread2.start();
		
		try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		System.out.println("completed");
	}

}
