package com.restaurant.entity;

public class Item {

	private Integer itemCode;
	private String name;
	private String type;
	private float rate;
	private Boolean inStock;
	private Boolean isVeg;
	
	public Item(Integer itemCode, String name, String type, float rate, Boolean inStock, Boolean isVeg) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.type = type;
		this.rate = rate;
		this.inStock = inStock;
		this.isVeg = isVeg;
	}

	public Integer getItemCode() {
		return itemCode;
	}

	public void setItemCode(Integer itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Boolean isInStock() {
		return inStock;
	}

	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

	public Boolean isVeg() {
		return isVeg;
	}

	public void setIsVeg(Boolean isVeg) {
		this.isVeg = isVeg;
	}
	
	
}
