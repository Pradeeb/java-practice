package com.java.test;

import com.java.test.service.Car;


public class exportAdopter implements Car{
	private ExportCar exportCar;
	
	exportAdopter(ExportCar exportCar){
		this.exportCar=exportCar;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return exportCar.name();
	}

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return exportCar.brand();
	}

	@Override
	public String price() {
		// TODO Auto-generated method stub
		return exportCar.price();
	}}
