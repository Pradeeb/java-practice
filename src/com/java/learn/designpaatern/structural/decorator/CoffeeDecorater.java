package com.java.learn.designpaatern.structural.decorator;

//this is medium in decorator its super implements come here from where extends
public abstract class CoffeeDecorater implements ICoffee {
	
	protected ICoffee coffee;
	
	public CoffeeDecorater(ICoffee coffee) {
		this.coffee=coffee;
	}

	public String getDescription() {
		return coffee.getDescription();
	};
	
	public double getCost() {
		return coffee.getCost();
	};
}
