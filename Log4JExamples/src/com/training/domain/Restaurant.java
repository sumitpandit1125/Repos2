package com.training.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Restaurant {

	Logger log = Logger.getRootLogger();
	
	private ArrayList<FoodItem> items;
	
	public Restaurant() {
		log.info("Restaurant costructor");
		items = new ArrayList<FoodItem>();
		init();
	}

	public void init(){
		
		FoodItem item1 = new FoodItem(101, "Chicken Tandoori", 300, false);
		items.add(item1);
		FoodItem item2 = new FoodItem(102, "Sahi Paneer", 250, true);
		items.add(item2);
		FoodItem item3 = new FoodItem(103, "Tandoori Roti", 30, true);
		items.add(item3);
		FoodItem item4 = new FoodItem(104, "Paneer Tikka", 200, true);
		items.add(item4);
		FoodItem item5 = new FoodItem(105, "Chicken Biryani", 250, false);
		items.add(item5);
		FoodItem item6 = new FoodItem(106, "Fish Tandoori", 400, false);
		items.add(item6);
		
		
		log.info("Items Added");
		
	}
	
	public List<FoodItem> getItems(String type){
		
		ArrayList<FoodItem> list = new ArrayList<FoodItem>();
		
		if (type.equalsIgnoreCase("Veg")){
			
			for (FoodItem item : items ){
				if(item.isVegetarian()){
					list.add(item);
				}
			}
			
		}
		else {
			
			for (FoodItem item : items ){
				if(!item.isVegetarian()){
					list.add(item);
				}
			}
			
		}
		
		return list;
	}
	
	public List<FoodItem> getMenuCard(){
		ArrayList<FoodItem> list = new ArrayList<FoodItem>();
		for (FoodItem item : items ){
			
				list.add(item);
			
		}
		return list;
	}
	
	public static void printItem(ArrayList<FoodItem> list){
		for (FoodItem item : list ){
			
				System.out.println(item);
			
		}
	}
}
