package com.trainig.maps;

import java.util.*;

public class TranslateService {

	
	private Hashtable<String, String> hindiToEnglish;
	
	public TranslateService(){
		
		hindiToEnglish = new Hashtable<String, String>();
		init();
		
	}
	
	public void init(){
		
		hindiToEnglish.put("ek", "one");
		hindiToEnglish.put("kela", "banana");
		hindiToEnglish.put("chawal", "rice");
	}
	
	public String findEngWord(String hindiWord){
		
		return hindiToEnglish.get(hindiWord);
	}
	
	public void printWords(){
		
		Set<Map.Entry<String, String>> list = 
									hindiToEnglish.entrySet();
		System.out.println("Hindi - English Words");
		
		for(Map.Entry<String, String> words:list){
			System.out.println(words.getKey() + ":=" + words.getValue());
		}
	}
	
}
