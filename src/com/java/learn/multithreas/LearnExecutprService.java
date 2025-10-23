package com.java.learn.multithreas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LearnExecutprService {

	static String folderName = "D:\\T&F";
	static Path folderPath = Paths.get(folderName);

	public static void main(String[] args) {

		/*
		 * 
		 * Yes — your current code creates 1 million threads when you want to make 1
		 * million files. That will crash or hang your system because threads are heavy:
		 * each thread consumes memory and CPU. You cannot create so many threads at
		 * once.
		 * 
		 * Instead, you should use a thread pool — a limited number of threads that
		 * re-use themselves to handle many tasks. This way, you can still process 1
		 * million files without creating 1 million threads.
		 * 
		 * int i = 1; while (i <= 1000) { final int fileIndex=i; Runnable run = () ->
		 * createFile(fileIndex); Thread thred = new Thread(run); thred.start();
		 * System.out.println(i); i++; }
		 */

		ExecutorService executor = Executors.newFixedThreadPool(10);
		int i = 1;
		while (i <= 1000) {
			final int fileIndex = i;
			executor.submit(() -> createFile(fileIndex));
			i++;
			System.out.println(i);
			if (i % 10000 == 0) {
				System.out.println("Submitted " + i + " tasks");
			}
		}
	}

	public static synchronized void createFile(int i) {
		// int i=0;
		String fileName = i + ".txt";
		Path filePath = folderPath.resolve(fileName);

		// Define the content for the file
		String fileContent = "This is file number " + i + ".";

		// Write the content to the file
		try {
			Files.writeString(filePath, fileContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(i);

	}
}
