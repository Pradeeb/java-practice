package com.java.test;

public class Test {
	public static void main(String[] args) {
		
		CarDealear newCar=new CarDealear();
		
		newCar.getAllCar().stream().forEach(x->System.out.println(x.name()+" "+x.brand()+" "+x.price()));
	}
}
