package com.Inheritance;

import java.util.Scanner;

public class MediaHandler {
	
	private static Media[] store = new Media[10];
	private static int amount = -1;
	
	public static void mainMenu(){
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an option");
		System.out.println("1:View Detail of Media");
		System.out.println("2:Set new media");
		int key = in.nextInt();
		switch(key){
		case 1:
			MediaHandler.viewMedia();
			break;
		case 2: 
			MediaHandler.setMedia();
			break;
		default:
			System.exit(1);
			
		}

		in.close();
	}
	
	/*
	private static void deleteMedia() {
		System.out.println("Enter the serial number of media to be deleted:");
		MediaHandler.viewMedia();
		Scanner in = new Scanner(System.in);
		int key = in.nextInt();
		if(key>=amount){
			System.out.println("Enter valid media");
			MediaHandler.deleteMedia();
			
			
		}
		store
		
		
	}*/

	private static void viewMedia() {
		int traverser = 0;
		for(;traverser<=amount;traverser++){
			System.out.println(traverser+1+":");
			store[traverser].printMedia();
		}
		MediaHandler.mainMenu();
		
	}

	public static void setMedia(){
		
		Media media = null;
		System.out.println("Which type of media do you want to Set:");
		System.out.println("1:Book");
		System.out.println("2:Periodicals");
		System.out.println("3:Dvd");
		
		Scanner in = new Scanner(System.in);
		int key = in.nextInt();
		System.out.println("Enter name :");
		String name = in.nextLine();
		System.out.println("Enter lending length in weeks:");
		int lendingLength = in.nextInt();
		switch(key){
		case 1:
			System.out.println("Enter author :");
			String author = in.nextLine();
			System.out.println("Enter ISBN :");
			String isbn = in.nextLine();
			System.out.println("Enter Edition");
			int edition = in.nextInt();
			media = new Book(name, lendingLength, author, isbn, edition);
			break;
		case 2:
			System.out.println("Enter frequency :");
			String frequency = in.nextLine();
			System.out.println("Enter Volume :");
			int volume = in.nextInt();
			media = new Periodicals(name, lendingLength, frequency, volume);
			break;
		case 3:
			System.out.println("Enter Artist :");
			String artist = in.nextLine();
			System.out.println("Enter length :");
			float length = in.nextFloat();
			media = new Dvd(name, lendingLength, artist, length);
			break;
		default:
			System.out.println("Enter option from the given list");
			MediaHandler.setMedia();	
		}
		in.close();
		store[++amount] = media;
		MediaHandler.mainMenu();

		
		
	}

}
