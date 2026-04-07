package com.java.test;

public class Test implements a {

	public static void main(String[] args) {
		Test test=new Test();
		test.test();
	}
}

 interface a extends b{
	default void test() {
		b.super.test();
		System.out.println("a");
	};
}

 interface b{
	 default void test() {
			System.out.println("b");
		};
}