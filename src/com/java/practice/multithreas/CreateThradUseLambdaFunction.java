package com.java.practice.multithreas;

import java.util.ArrayList;
import java.util.List;

public class CreateThradUseLambdaFunction {

	public static void main(String[] args) {
		
		Runnable run = () ->{
			System.out.println("Thread Creadted Use lambda Function");
		};
		
		
		
		Thread thread=new Thread(run);
		thread.start();
		
		// above regular way 
		// parameter pass here
		
	      List<String> filePaths = new ArrayList<>();
	        for (int i = 1; i <= 1000; i++) {
	            filePaths.add("C:/files/file" + i + ".txt");
	        }
	        for (String path : filePaths) {
	        	 String threadName = "FileThread-" + path.substring(path.lastIndexOf("/") + 1); // or any unique part
	            Thread t = new Thread(() -> creataFile(path),threadName);
	            t.start();
	        }

	
	}
	
	static void creataFile(String i) {
		System.out.println(Thread.currentThread().getName() + " processing " + i);
	}

}
