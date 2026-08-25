package com.java.test;

public class ExportCar {

	private String name;
	private String brand;
	private String price;
	
	ExportCar(String name,String brand,String price){
		super();
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	
	public String name() {
		return name;
	}
	public String brand() {
		return brand;
	}
	public String price() {
		return price;
	}
}
