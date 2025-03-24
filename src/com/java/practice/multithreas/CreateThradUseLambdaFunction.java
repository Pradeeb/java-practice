package com.java.practice.multithreas;

public class CreateThradUseLambdaFunction {

	public static void main(String[] args) {
		
		Runnable run = () ->{
			System.out.println("Thread Creadted Use lambda Function");
		};
		
		Thread thread=new Thread(run);
		thread.start();
	}

}
