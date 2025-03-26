package com.java.practice.multithreas;

public class LearnJoinWithParameter {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable run = () -> {
			for(int i=0; i<= 5 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(run);
		
		thread.start();
		
		thread.join(2000);
		
		thread.join(2000,1000); // millisec,nanosec
		
		System.out.println("Completed");

	}

}
