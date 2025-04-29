package com.java.learn.basic.oops.interfacel;

public class MainClass implements LearnInterface {

	public static void main(String[] args) {
		
		MainClass test=new MainClass();

		System.out.println(test.name);
		test.test1(0);
		test.test();
		test.test2();
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

}
