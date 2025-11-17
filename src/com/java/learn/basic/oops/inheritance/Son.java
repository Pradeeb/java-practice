package com.java.learn.basic.oops.inheritance;

public class Son extends Father {

	public static void main(String [] args) {
		
		Son son=new Son();
		son.have();
		
		Father father=new Father();
		father.have();

	}

}

class Father{
	public void have() {
		System.out.println("I have a car");
	}
}
