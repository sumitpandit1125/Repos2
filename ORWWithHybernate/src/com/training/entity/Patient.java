package com.training.entity;

import java.io.Serializable;

public class Patient implements Serializable {

	private String patName;
	private int age;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patName, int age) {
		super();
		this.patName = patName;
		this.age = age;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [patName=" + patName + ", age=" + age + "]";
	}
	
	
}
