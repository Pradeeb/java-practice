package com.java.learn.java8.funcationinterface;

public class LearnRunnable {
	
	/*
	 * 
 Use Runnable when:

❌ No result needed
❌ No checked exception required


🔸 What does run() do?
run() contains the logic/task you want to execute
It does NOT create a thread by itself
It is executed by a Thread
	 * */

	public static void main(String[] args) {
		
		Runnable run=()->{
			System.out.println("Thread run");
		};
		
		for(int i = 0; i <= 5; i++) {
		    System.out.println(i);

		    Thread thread = new Thread(run); // new thread every time
		    thread.start();
		}

	}

}
