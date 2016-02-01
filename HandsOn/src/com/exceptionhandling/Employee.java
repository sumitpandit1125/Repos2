package com.exceptionhandling;

public class Employee {
	
	private String name;
	private String skill;
	private double salary;
	
	public Employee(String name, String skill, double salary) {
		super();
		this.name = name;
		this.skill = skill;
		this.salary = salary;
	}
	
	public void showData(){
		System.out.println(name+"->"+skill+"->"+salary);
	}

}
