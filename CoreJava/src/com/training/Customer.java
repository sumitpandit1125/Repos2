package com.training;

import com.training.myException.RangeCheckException;

public class Customer {

	private long handPhone;	
	private int cust_id;
	private String name;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Declare rule
	public Customer(long handPhone, int cust_id, String name) throws RangeCheckException {
		super();
		if(handPhone>9999999999L || handPhone<1000000000L){
			
				throw new RangeCheckException(handPhone);
			
		}
		else{
			this.handPhone = handPhone;
		}
		this.cust_id = cust_id;
		this.name = name;
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
	
	//Handle Rule
	public void setHandPhone(long handPhone) {
		
		if(handPhone>9999999999L || handPhone<1000000000L){
			try{
				throw new RangeCheckException(handPhone);
			}
			catch(RangeCheckException e){
				System.out.println(e.getMessage());
			}
			
		}
		else{
			this.handPhone = handPhone;
		}
		
	}
	
}
