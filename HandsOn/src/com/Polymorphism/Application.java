package com.Polymorphism;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		 
		RentItems item = new Fan(101, 100, "Fan");
		ItemHandler.addItem(item);
		item = new Fan(102, 100, "Fan");
		ItemHandler.addItem(item);
		item = new Furniture(103, 200, "Furniture", "BED");
		ItemHandler.addItem(item);
		item = new Furniture(104, 150, "Furniture", "Chair");
		ItemHandler.addItem(item);
		item = new AirConditioner(105, 500, "AC", "Window", 1);
		ItemHandler.addItem(item);
		item = new AirConditioner(106, 750, "AC", "Split", 1.5f);
		ItemHandler.addItem(item);
		
		ItemHandler.display();
		
		System.out.println("Enter days and serial number of item :");
		Scanner in = new Scanner(System.in);
		int days = in.nextInt();
		int serialNumber = in.nextInt();
		System.out.println("RENT :" +ItemHandler.calculateRent(days, serialNumber));
		in.close();
	}

}
