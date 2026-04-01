package com.java.learn.java8.funcationinterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LearnCallable {

	/*
	 * 
1.  Why do we need Callable?

Runnable has limitations:
❌ No return value
❌ Cannot throw checked exceptions

👉 So Java introduced Callable to solve this.


	 * */
	
	public static void main(String[] args) throws Exception{
		
		 Callable<Integer> task = () -> {
	            int sum = 0;
	            for (int i = 0; i < 5; i++) {
	                sum = sum + 10;
	                System.out.println("Iteration " + i + " -> " + sum);
	            }
	            return sum;
	        };


	        ExecutorService service = Executors.newSingleThreadExecutor();
	        Future<Integer> result = service.submit(task);

	        System.out.println("Final Result: " + result.get());

	        service.shutdown();
	    }
	
}
