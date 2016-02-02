package com.training;

public class Application {
	public static void main(String[] args) {
		Thread.currentThread().setName("Main Thread");
		System.out.println(Thread.currentThread().getName());
		MyThread obj = new MyThread();
		//obj.setName("Sumit");
		obj.start();
	}
		
}
