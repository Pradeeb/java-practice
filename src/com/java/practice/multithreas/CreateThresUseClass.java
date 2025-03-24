package com.java.practice.multithreas;

public class CreateThresUseClass extends Thread {
	@Override
   public void run(){
		System.out.println("Thread cread use Thread Class use");
	}
	
	public static void main(String[] args) {
		
		CreateThresUseClass thread=new CreateThresUseClass();
		
		thread.start();
	}
}
