package com.java.learn.designpaatern.creational.factory;

public class VehicleFactory {
	public static Vehicle getVehicle(String type) {

        if (type == null) return null;

        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } 
        else if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }

        return null;
    }
}
