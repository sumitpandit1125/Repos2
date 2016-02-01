package com.Polymorphism;

public class Furniture extends RentItems {

	protected static int quantity;
	private String subType;
	
	public Furniture(int serialNumber, float rent, String type, String subType) {
		super(serialNumber, rent, type);
		this.subType = subType;
		quantity++;
	}
	
	
	
	@Override
	public void itemInfo() {
		System.out.println("===Item Information===");
		System.out.println("Serial Number :"+serialNumber);
		System.out.println("Rent :"+rent);
		System.out.println("ItemType :"+type);
		System.out.println("Item Subtype :"+subType);
		System.out.println("Quantity :"+quantity);
		
	}	
	
}
