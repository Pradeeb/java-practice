package com.java.learn.designpaatern.structural.decorator;

//this is new change coffee get old price from direct object then add here price future
//create like this class if you want extra sugar future
public class ExtraMilk extends CoffeeDecorater {

	public ExtraMilk(ICoffee coffee) {
		super(coffee);
	}
	
	public String getDescription() {
		return coffee.getDescription()+",Extra Milk";
	};
	
	public double getCost() {
		return coffee.getCost()+1;
	};

}
