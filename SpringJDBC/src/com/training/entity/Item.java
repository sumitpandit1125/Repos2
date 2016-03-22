package com.training.entity;

import org.springframework.stereotype.Component;

@Component("item")
public class Item {
	
	private String productType;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String productType) {
		super();
		this.productType = productType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Item [productType=" + productType + "]";
	}
	
	

}
