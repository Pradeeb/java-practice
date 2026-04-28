package com.java.learn.designpaatern.structural.decorator;

public class ColdCoffee implements ICoffee {

	@Override
	public String getDescription() {
		
		return "Cold coffee";
	}

	@Override
	public double getCost() {
		
		return 10;
	}

}
