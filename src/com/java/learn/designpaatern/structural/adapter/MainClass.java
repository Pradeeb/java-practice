package com.java.learn.designpaatern.structural.adapter;

import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		CarDealer carList=new CarDealer();
		
		List<Car> cars=carList.getCarList();

		for(Car car:cars) {
			System.out.println(car.getName()+", "+car.getBrand()+", "+car.getPrice());
		}
	}

}
