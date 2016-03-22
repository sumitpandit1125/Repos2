package com.training.domains;

public class Item {
	
	private int itemNumber;
	private String itemName;
	private double price;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemNumber, String itemName, double price) {
		super();
		this.itemNumber = itemNumber;
		this.itemName = itemName;
		this.price = price;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	

}
