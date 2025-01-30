package com.java.practice.multithreas;

// It is using for concurrent
public class LearnMultithread {

	public static void main(String[] args) {
		
		for( int i=0  ; i<4 ;i++) {
			
		//use Extends
		Cake redWelvet=new Cake();
		redWelvet.start();
		
		//use implements
		Cake1 blackForast=new Cake1();
		Thread thread=new Thread(blackForast);
		thread.start();
		}
	}

}

// you can not use multiple inheritance here
class Cake extends Thread {
	
	public void run() {
		try {
		System.out.println("Mixing for cake "+Thread.currentThread().getId());
		Thread.sleep(100);
		System.out.println("Baking cake "+Thread.currentThread().getId());
		Thread.sleep(100);
		System.out.println("Decorate cake "+Thread.currentThread().getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}

//you can use multiple inheritance here
class Cake1 implements Runnable {
	public void run() {
		try {
		System.out.println("Mixing for cake "+Thread.currentThread().getId());
		Thread.sleep(100);
		System.out.println("Baking cake "+Thread.currentThread().getId());
		Thread.sleep(100);
		System.out.println("Decorate cake "+Thread.currentThread().getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}