package com.training.apps;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.training.domain.FoodItem;
import com.training.domain.Restaurant;

public class Application {

	public static void main(String[] args) {
		ArrayList<FoodItem> list = new ArrayList<FoodItem>();
		
		Logger log = Logger.getRootLogger();
		
		Restaurant Arsalan = new Restaurant();
		
		log.info("Restaurant Initialized");
		
		list = (ArrayList<FoodItem>)Arsalan.getItems("Veg");
		System.out.println("\n\n====Veg Items===");
		Restaurant.printItem(list);
		
		
		list = (ArrayList<FoodItem>)Arsalan.getItems("Non Veg");
		System.out.println("\n\n====NonVeg Items===");
		Restaurant.printItem(list);
		
		list = (ArrayList<FoodItem>)Arsalan.getMenuCard();
		System.out.println("\n\n====Menu Card===");
		Restaurant.printItem(list);
		

	}

}
