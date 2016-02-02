package com.training;

public class Application2 {
	public static void main(String[] args) {
		
		YourThread obj = new YourThread();
		
		Thread th1 = new Thread(new YourThread(),"RAm");
		
		Thread th2 = new Thread(new YourThread(),"Hari");
		
		Thread th3 = new Thread(obj,"Sham");
		
		th1.start();
		th2.start();
		th3.start();
	}
}
