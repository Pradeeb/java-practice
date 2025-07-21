package com.java.learn.designprofiles.openclosed;

//Open for extension close for modification
public interface NodificationService {
	
	/* 
	 * 1.This is spring boot service implement concept
	 * 2.create a interface what a common function is here. then where to we need implement this
	 * 3.In case new future come like notification sent to insta we create a new class and implement this 
	 *   so old future we have already(Whatsup , SMS) its not affect any issue will come so we changes made only insta class.
	 * 4.this is called Open for extension close for modification
	 * */
	
	public void setNotification();


}
