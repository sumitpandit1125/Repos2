package com.training;

public class YourThread implements Runnable {
	static double j=100;
	
	@Override
	public void run() {
		for(int i = 0;i<=1;i++) {
			System.out.println(Thread.currentThread().getName()+calculate());
		}
	}
	
	public double calculate(){
		 
		return ++j;
	}

}
