package com.training.beans;

import java.io.Serializable;
import java.util.logging.Logger;



public class Customer implements Serializable {
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	private long customerId;
	private String customerName;
	private long mobile;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customerId, String customerName, long mobile, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
		this.email = email;
	}
	public long getCustomerId() {
		
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getInfo(){
		return customerName;
	}
	
	

}
