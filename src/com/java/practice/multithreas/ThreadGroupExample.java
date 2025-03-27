package com.java.practice.multithreas;

public class ThreadGroupExample {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup group = new ThreadGroup("Group-1");

		Thread thread1 = new Thread(group, () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " in " + group.getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName() + " interrupted.");
				}
			}
		},"Thread 1");
		
		Thread thread2 = new Thread(group, () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " in " + group.getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName() + " interrupted.");
				}
			}
		},"Thread 2");
		
        thread1.start();
        thread2.start();
        

        System.out.println("Active Threads: " + group.activeCount());
        System.out.println("Active Groups: " + group.activeGroupCount());
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        group.interrupt();  // Interrupts all threads in the group

	}

}
