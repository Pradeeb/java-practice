package com.java.learn.OptionalClass;


public class AllMenthodsLearn {

	public static void main(String[] args) {
		  Car car = new Car();
	        car.start();
	        car.fuel(); // Calls default method
	        	}

}

interface Vehicle {

    void start();

    // Default method
    default void fuel() {
        System.out.println("Default fuel method: Petrol");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }
}
