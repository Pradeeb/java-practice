package com.java.learn.designpaatern.structural.adapter;

public class ExportCarAdator implements Car {
	
	private ExportCar exportCar;

	public ExportCarAdator(ExportCar exportCar){
		this.exportCar=exportCar;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return exportCar.getCarName();
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return exportCar.getCarBrand();
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return exportCar.getCarPrice();
	}
	

}
