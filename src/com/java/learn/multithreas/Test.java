package com.java.learn.multithreas;

public class Test {

	public static void main(String[] args) {
		
		Runnable run = () ->{
			for(int i=0; i <= 5 ; i++) {
				System.out.println("Thread run "+i+" "+Thread.currentThread().getName());
			}
		};
		
		Thread thread = new Thread(run);
		Thread thread2 = new Thread(run);
		thread.setName("valan");
		thread.start();
		thread2.start();
		
		try {
			thread.join(1);
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.err.println("complet");
		System.err.println("complet");
		System.err.println("complet");
	}

}
