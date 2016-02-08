package com.trainig.maps;

import java.util.List;

public class Manager {
	
	private String name;
	private List<String> subordinates;
	
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Manager(String name, List<String> subordinates) {
		super();
		this.name = name;
		this.subordinates = subordinates;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getSubordinates() {
		return subordinates;
	}


	public void setSubordinates(List<String> subordinates) {
		this.subordinates = subordinates;
	}



	@Override
	public String toString() {
		return "Manager [name=" + name + ", subordinates=" + subordinates + "]";
	}
	
	
	
	

}
