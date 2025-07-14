package com.java.learn.designprofiles.signleresponsibility;

public class MessageService {
  
	public String sendMessage(String type) {
		if(type.equalsIgnoreCase("SMS")) {
			return null;
		}	
		else if(type.equalsIgnoreCase("Whhatsup")) {
			return null;
		}else {
			// remaining is mail
			return null;
		}
	}
}
