package com.java.learn.designpaatern.creational.singleton;

public class ObjectCreate {

	public static void main(String[] args) {
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(s1 == s2);

	}

}
//✔️ Configuration Manager
//✔️ Cache
//✔️ Logger
//✔️ Resource Manager
//
//❌ Entity
//❌ DTO
//❌ Request data