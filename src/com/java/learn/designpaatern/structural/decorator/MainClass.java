package com.java.learn.designpaatern.structural.decorator;

public class MainClass {
	
	public static void main(String[] args) {
		
		// default object because it have direct class SimpleCoffee
		SimpleCoffee coffe=new SimpleCoffee();
		System.out.println(coffe.getDescription()+" "+coffe.getCost());
		
		// default object because it have direct class ColdCoffee
		ColdCoffee cold=new ColdCoffee();
		System.out.println(cold.getDescription()+" "+cold.getCost());
		
		// this is used decorator add the price in which coffee we use like normal coffee+1 || COLD coffee+1 depends on Object
		ExtraMilk extraMilk=new ExtraMilk(cold);
		System.out.println(extraMilk.getDescription()+" "+extraMilk.getCost());

	}

}
