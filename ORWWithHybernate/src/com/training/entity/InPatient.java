package com.training.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class InPatient extends Patient implements Serializable {
	
	private String wardNumber;
	private Timestamp admissionDate;
	public InPatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InPatient(String patName, int age) {
		super(patName, age);
		// TODO Auto-generated constructor stub
	}
	
	public InPatient(String patName, int age,String wardNumber, Timestamp admissionDate) {
		super(patName, age);
		this.wardNumber = wardNumber;
		this.admissionDate = admissionDate;
	}
	public String getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(String wardNumber) {
		this.wardNumber = wardNumber;
	}
	public Timestamp getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Timestamp admissionDate) {
		this.admissionDate = admissionDate;
	}
	@Override
	public String toString() {
		return "InPatient [wardNumber=" + wardNumber + ", admissionDate=" + admissionDate + "]";
	} 
	
}
