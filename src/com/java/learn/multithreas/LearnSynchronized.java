package com.java.learn.multithreas;

public class LearnSynchronized {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Runnable run = () -> {
			for (int i = 1; i <= 10; i++) {
				try {
					counter.increment();
					System.out.println(Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread thread1 = new Thread(run,"Team A");
		Thread thread2 = new Thread(run,"Team B");
		
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();


		
		System.out.println("Get Total "+counter.getTotal());

	}

}

class Counter {

	private static int count = 0;

	public synchronized void increment() throws InterruptedException {
		Thread.sleep(400);
		count++;
		System.out.println(count);
	}

	public int getTotal() {
		return count;
	}
}
