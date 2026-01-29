package com.java.learn.designpaatern.creational.factory;

public class FactoryTest {
	public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("CAR");
        v1.drive();

        Vehicle v2 = VehicleFactory.getVehicle("BIKE");
        v2.drive();
    }
}
/*

Factory 
1. It creates objects without exposing the creation logic to the client.

✔ Loose coupling
✔ Centralized object creation (VehicleFactory)
✔ Easy to extend       
✔ Cleaner & testable code

Problems without Factory:

✔ new keyword everywhere
✔ Tight coupling
✔ Hard to add new object types
✔ Violates Open–Closed Principle

2. Used by Spring ApplicationContext
*/