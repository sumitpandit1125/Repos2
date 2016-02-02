package com.training;

import java.io.IOException;

public class JoinExample {

	public static void main(String[] args) {
		Thread obj = new Thread(){
			
			
			@Override
			public void run() {
				
				System.out.println("Reading");
				
				try {
					System.in.read();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				System.out.println("Finished reading");
				
			}
		};
			
		System.out.println("Starting Main");
		obj.start();
		
		try {
			obj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Finished");

	}

}
