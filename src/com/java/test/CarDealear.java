package com.java.test;

import java.util.Arrays;
import java.util.List;

import com.java.test.service.Car;

public class CarDealear {
	
	public List<Car> getAllCar(){
		
		Car baleno=new IndianCar("Baleno", "Susuki", "900000");
		ExportCar audi=new ExportCar("A6", "Audi", "5000000");
		Car audiAdop=new exportAdopter(audi);
				
		return Arrays.asList(baleno,audiAdop);
	}

}
