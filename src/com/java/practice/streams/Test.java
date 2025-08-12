package com.java.practice.streams;

interface Cat{
	default void eat() {
		System.out.println("Cat eating");
	}
}
interface Dog {
	
	default void eat() {
		System.out.println("Dog Eating");
	}
}

class Animal implements Cat,Dog{

	@Override
	public void eat() {
		Cat.super.eat();
		Dog.super.eat();
	}
	
}

public class Test {

	public static void main(String[] args) {
		Animal car=new Animal();
		car.eat();
	}

}
