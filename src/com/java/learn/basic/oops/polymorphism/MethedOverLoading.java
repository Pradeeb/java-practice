package com.java.learn.basic.oops.polymorphism;

public class MethedOverLoading {

	public static void main(String[] args) {
	 main();
	 main(26);
	 main("valan");
	}
	
	public static void main() {
		System.out.println("with out parameter method over Loading");
	}
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(String name) {
		System.out.println(name);
	}

}
