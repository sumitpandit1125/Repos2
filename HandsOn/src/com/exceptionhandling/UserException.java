package com.exceptionhandling;

public class UserException extends Exception {
	
	String message = "Salalry not valid";

	@Override
	public String getMessage() {
		
		return message;
	}
	
	

}
