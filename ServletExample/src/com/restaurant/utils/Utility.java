package com.restaurant.utils;

public class Utility {
	
	public static Boolean stringToBoolean(String str){
		
		if(str.equalsIgnoreCase("false"))
			return false;
		else
			return true;
	}
	
	public static String booleanToString(Boolean bool){
		if(bool)
			return "TRUE";
		else
			return "FALSE";
	}

}
