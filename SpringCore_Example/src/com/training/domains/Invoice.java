package com.training.domains;

import java.util.HashMap;

public class Invoice {
	
	
	private Customer cust;
	
	private HashMap<Integer,Item> itemList;

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(Customer cust, HashMap<Integer,Item> itemList) {
		super();
		this.cust = cust;
		this.itemList = itemList;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public HashMap<Integer,Item> getItemList() {
		return itemList;
	}

	public void setItemList(HashMap<Integer,Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Invoice [cust=" + cust + ", itemList=" + itemList + "]";
	}
	
	
	
	
}
