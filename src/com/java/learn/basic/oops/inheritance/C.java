package com.java.learn.basic.oops.inheritance;

public class C{

	public static void main(String [] args) {
		B obj=new B(); //Child can access parent (B object=new B()) but parent can not access Child (B object=new A())
		
		obj.have();
	//	obj.have1();

	}

}

class A{
	public void have() {
		System.out.println("I have a car");
	}
	public void have1() {
		System.out.println("I have a car");
	}
}

class B extends A{
	@Override
	public void have() {
	
		System.out.println("I have a Bike");
	}
}

@FunctionalInterface
interface Test{
	public void test();
}
