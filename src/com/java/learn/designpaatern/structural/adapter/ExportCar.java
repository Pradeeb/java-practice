package com.java.learn.designpaatern.structural.adapter;

public class ExportCar {

	private String carName;
	private String carBrand;
	private String carPrice;
	
	public ExportCar(String carName, String carBrand, String carPrice) {
		super();
		this.carName = carName;
		this.carBrand = carBrand;
		this.carPrice = carPrice;
	}
	
	public String getCarName() {
		return carName;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public String getCarPrice() {
		return carPrice;
	}
	
	
}
