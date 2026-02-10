package com.java.learn.collection.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/*
 
 Hashtable VS ConcurrentHashMap

******************* Hashtable
Thread-safe
Uses synchronized methods
Only one thread can access the map at a time

****************** ConcurrentHashMap 
Thread-safe
Uses fine-grained locking
Multiple threads can read/write simultaneously
 
 * */
public class concurrentHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> cm=new ConcurrentHashMap<>();
		
		//create
		cm.put(1,"valan");
		System.out.println(cm.put(2,"valan"));
		
		//Read
		System.out.println(cm.get(2));
		
		//Update
		System.out.println(cm.replace(2, "pradeeb")); // befor value
		
		// Remove
		System.out.println(cm.remove(2)); // return removed value
		System.out.println(cm);
		
		cm.put(1,"valan1");
		
		//iteration
		for(int m:cm.keySet()) System.out.println(cm.get(m));
		for(String m:cm.values()) System.out.println(m);
		
	}


}
