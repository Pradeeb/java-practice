package com.java.test;

import com.java.test.service.Car;

public class IndianCar implements Car {
	
	private String name;
	private String brand;
	private String price;
	
	public IndianCar(String name,String brand,String price){
		super();
		this.name=name;
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String price() {
		// TODO Auto-generated method stub
		return price;
	}

}
