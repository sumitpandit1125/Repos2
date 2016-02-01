package com.Polymorphism;

public class ItemHandler {
	private static RentItems list[] = new RentItems[10];
	private static int size = -1;
	
	public static void display(){
		int i = 0;
		for(;i<=size;i++){
			list[i].itemInfo();
		}
	}
	
	public static void addItem(RentItems item){
		list[++size] = item;
	}
	
	
	public static double calculateRent(int days,int serialNumber ){
		float rent = 0;
		int i = 0;
		for(;i<=size;i++){
			if(list[i].getSerialNumber()==serialNumber){
				rent = list[i].getRent();
			}
		}
	
		return rent * days;
	}
	
}
