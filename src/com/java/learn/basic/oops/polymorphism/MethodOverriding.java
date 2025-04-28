package com.java.learn.basic.oops.polymorphism;

public class MethodOverriding extends MethedOverLoading {

	public static void main(String[] args) {
 
		MethodOverriding methodOverriding = new MethodOverriding();
		methodOverriding.main();
		
		MethedOverLoading methedOverLoading = new MethedOverLoading();
		methedOverLoading.main();
	}
	
	public static void main() {
		System.out.println("with out parameter method over riding");
	}
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(String name) {
		System.out.println(name);
	}

}
