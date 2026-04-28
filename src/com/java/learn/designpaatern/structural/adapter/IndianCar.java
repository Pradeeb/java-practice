package com.java.learn.designpaatern.structural.adapter;

public class IndianCar implements Car{

	private String name;
	private String brand;
	private String price;
		
	public IndianCar(String name, String brand, String price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}


}
