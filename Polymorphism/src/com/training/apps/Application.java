package com.training.apps;

import java.util.Scanner;

import com.training.domain.NewShowRoom;
import com.training.ifaces.Automobile;

public class Application {
	
	public static void main (String[] args){
		
		NewShowRoom showRoom = new NewShowRoom();
		Automobile polyAuto = null;
		
		int key;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a valid integer between 1 and 4");
		key = sc.nextInt();
		
		while(showRoom.getItem(key) != null){
			
			polyAuto = showRoom.getItem(key);
			showRoom.printQuote(polyAuto);
			System.out.println("enter a valid integer between 1 and 4");
			key = sc.nextInt();
			
		}
			
		sc.close();	
		
	}

}
