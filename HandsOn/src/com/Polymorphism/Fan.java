package com.Polymorphism;

public class Fan extends RentItems {
	protected static int quantity;
	

	public Fan(int serialNumber, float rent, String type) {
		super(serialNumber, rent, type);
		quantity++;
	}




	@Override
	public void itemInfo() {
		System.out.println("===Item Information===");
		System.out.println("Serial Number :"+serialNumber);
		System.out.println("Rent :"+rent);
		System.out.println("ItemType :"+type);
		System.out.println("Quantity :"+quantity);
		
	}

}
