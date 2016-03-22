package com.training.domains;

import java.util.logging.*;

public class Customer {

	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private Address add;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, long phoneNumber, Address add) {
		super();
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.add = add;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Customer [log=" + log + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", phoneNumber=" + phoneNumber + ", add=" + add + "]";
	}
	
	
	
	
}
