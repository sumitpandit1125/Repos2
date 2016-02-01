package com.Polymorphism;

public class AirConditioner extends RentItems {

	protected static int quantity;
	private String subType;
	private float capacity;
	
	
	public AirConditioner(int serialNumber, float rent, String type, String subType, float capacity) {
		super(serialNumber, rent, type);
		this.subType = subType;
		this.capacity = capacity;
		quantity++;
	}
	
	@Override
	public void itemInfo() {
		System.out.println("===Item Information===");
		System.out.println("Serial Number :"+serialNumber);
		System.out.println("Rent :"+rent);
		System.out.println("ItemType :"+type);
		System.out.println("Item Subtype :"+subType);
		System.out.println("Capacity :"+capacity+"ton");
		System.out.println("Quantity :"+quantity);
		
	}	
}
