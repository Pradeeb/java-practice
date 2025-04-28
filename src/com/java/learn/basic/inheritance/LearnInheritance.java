package com.java.learn.basic.inheritance;

public class LearnInheritance extends john {

	public static void main(String [] args) {
		
		john father=new john();
		
		father.who();
		
	}

}

class john{
	public void who() {
		System.out.println("I am father");
	}
}
