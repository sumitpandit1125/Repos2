package com.trainig.maps;

import java.util.ArrayList;

public class ManagerApplication {

	public static void main(String[] args) {
		
		Manager mgr;
		EmployeeHandler empHand = new EmployeeHandler();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sumit");
		list.add("rehman");
		list.add("Pritam");
		
		mgr = new Manager("Srivatsan", list);
		
		empHand.addTeam(101, mgr);
		
		list = new ArrayList<String>();
		list.add("Tom");
		list.add("Jerry");
		list.add("Scooby");
		
		mgr = new Manager("Cartoon", list);
		empHand.addTeam(102, mgr);
		
		empHand.display();
		
		empHand.searchManager(102);
		
		
		
		
		
		
		

	}

}
