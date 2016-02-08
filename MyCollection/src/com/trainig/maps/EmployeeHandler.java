package com.trainig.maps;

import java .util.*;

public class EmployeeHandler {
	
	private Hashtable<Integer, Manager> team;
	

	public EmployeeHandler() {
		super();
		team = new Hashtable<Integer, Manager>();
		
	}
	
	public void addTeam(Integer key, Manager mgr){
		team.put(key, mgr);
	}
	
	public void searchManager(int key){
		
		
		
		Manager mgr = team.get(key);
		List<String> subordinates = mgr.getSubordinates();
		System.out.println(mgr.getName());
		
		for(String str : subordinates){
			System.out.println("\t:"+str);
		}
		
	}

	public void display(){
		
		Set<Map.Entry<Integer, Manager>> list = team.entrySet();
		for(Map.Entry<Integer, Manager> mgr : list){
			
			System.out.println(mgr.getKey()+"  :=  "+mgr.getValue());
			
		}
		
	}

	
	
	

}
