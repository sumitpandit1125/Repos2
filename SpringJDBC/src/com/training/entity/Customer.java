package com.training.entity;

import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	private String cutomerName;
	private long phoneNumber;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cutomerName, long phoneNumber) {
		super();
		this.cutomerName = cutomerName;
		this.phoneNumber = phoneNumber;
	}
	public String getCutomerName() {
		return cutomerName;
	}
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [cutomerName=" + cutomerName + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
