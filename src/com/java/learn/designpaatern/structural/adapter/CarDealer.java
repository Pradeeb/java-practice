package com.java.learn.designpaatern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
	public List<Car> getCarList(){
		List<Car> carList=new ArrayList<>();
		
		Car punch1=new IndianCar("Punch", "TATA", "8000000");
		
		ExportCar benz=new ExportCar("BENZ", "Mericidic", "100000000");
		Car benzc=new ExportCarAdator(benz);
		
		carList.add(punch1);
		carList.add(benzc);
	    
		return carList;
	}
}
