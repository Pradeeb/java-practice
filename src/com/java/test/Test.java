package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Test {
	
    public static int num=0;
    

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		List<String> names=Arrays.asList("valan","pradeeb","nazeem");
		
		ExecutorService executor=Executors.newFixedThreadPool(1);

		List<Future<Integer>> futures = new ArrayList<>();

		for (String name : names) {
		    Future<Integer> future =
		            executor.submit(() -> sendMessage(name));

		    futures.add(future);
		}

		// Get results AFTER submitting all tasks
		for (Future<Integer> future : futures) {
		    System.out.println("Result: " + future.get());
		}

		executor.shutdown();
		
		
	}

	
	public static synchronized int sendMessage(String msg) throws InterruptedException {
		int nummber=++num;
		System.out.println(nummber+". "+msg);
		Thread.sleep(3000);
		return nummber;
	}



}
