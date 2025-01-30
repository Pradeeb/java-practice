package com.java.practice.multithreas;

class CackeCounter {
	
	int cakeCount=0;
	
	public synchronized void increment() {
		cakeCount++;
	}

}

class Team implements Runnable{
	
	CackeCounter cakeCounter;
	
	Team(CackeCounter cakeCounter){
		this.cakeCounter=cakeCounter;
	}
	

	public void run() {
		
		for(int i = 0; i<1000 ; i++) {
			
			cakeCounter.increment();
		}
		
	}
	
}

public class LearnSynchronized {
	
	public static void main(String[] arg) {
		
		CackeCounter counter=new CackeCounter();
		
		Thread team1=new Thread(new Team(counter));
		Thread team2=new Thread(new Team(counter));
		
		team1.start();
		team2.start();
		
		try {
			team1.join();
			team2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(counter.cakeCount);
	}
	
}
