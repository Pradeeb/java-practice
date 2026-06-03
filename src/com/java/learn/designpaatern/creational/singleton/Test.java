package com.java.learn.designpaatern.creational.singleton;

public class Test {
	
	private Test() {}
	
	private static class HelperTest{
		private final static Test INTANCE=new Test();
	}
	
	public static Test objCreate() {
		return HelperTest.INTANCE;
	}
	
	private String name="valan";
	private int age=27;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
