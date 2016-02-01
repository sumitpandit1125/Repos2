package com.Polymorphism;

public abstract class RentItems {
	
	protected int serialNumber;
	protected float rent;
	protected String type;
	
	
	public float getRent() {
		return rent;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
	
	public RentItems(int serialNumber, float rent, String type) {
		super();
		this.serialNumber = serialNumber;
		this.rent = rent;
		this.type = type;
	}


	public abstract void itemInfo();


	
	

}
