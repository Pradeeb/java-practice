package com.java.test;

public class Test implements A, B {
    public static void main(String[] args) {

    	Test t=new Test();
    	
    	t.test();
    }

	@Override
	public void test() {
		// TODO Auto-generated method stub
		B.super.test();
	}

}

interface A {

    default void test() {
        System.out.println("Interface A default method");
    }
}

interface B {
    default void test() {
        System.out.println("Interface B default method");
    }
}

