package com.java.learn.multithread;

public class Test {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			int count = i;
			Thread thread = new Thread(() ->Test.createfil(count));
			thread.start();

		}

		System.out.println("done");

	}

	public static void createfil(int count) {
		System.out.println("Creted file :" + count);
	}
}
