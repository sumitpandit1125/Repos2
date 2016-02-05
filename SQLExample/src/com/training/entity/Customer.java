package com.training.entity;


public class Customer {

	private long handPhone;	
	private int cust_id;
	private String name;
	private String email;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Customer(long handPhone, int cust_id, String name, String email) {
		super();
		this.handPhone = handPhone;
		this.cust_id = cust_id;
		this.name = name;
		this.email = email;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	
	
	public int getCust_id() {
		return cust_id;
	}
	
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getHandPhone() {
		return handPhone;
	}



	@Override
	public String toString() {
		return "Customer [handPhone=" + handPhone + ", cust_id=" + cust_id + ", name=" + name + ", email=" + email
				+ "]";
	}
	
	
	
}
