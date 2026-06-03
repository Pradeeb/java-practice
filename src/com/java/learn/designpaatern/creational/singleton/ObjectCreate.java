package com.java.learn.designpaatern.creational.singleton;

public class ObjectCreate {

	public static void main(String[] args) {
		
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(s1 == s2);
		
		Test t1=Test.objCreate();
		System.out.println(t1.getName());
		Test t2=Test.objCreate();
		t2.setName("Pradeeb");
		System.out.println(t1.getName()+" "+t2.getName());
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