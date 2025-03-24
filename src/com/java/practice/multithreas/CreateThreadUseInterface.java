package com.java.practice.multithreas;

public class CreateThreadUseInterface implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread cread use runnable interface");
	}

	public static void main(String[] args) {

		CreateThreadUseInterface run=new CreateThreadUseInterface();
		
		Thread thread=new Thread(run);
		thread.start();
		
	}

}
