package com.Inheritance;

public class Media {
	
	protected String name;
	protected int lendingLength;
	
	public Media(String name, int lendingLength) {
		super();
		this.name = name;
		this.lendingLength = lendingLength;
	}
	
	public Media() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLendingLength() {
		return lendingLength;
	}
	public void setLendingLength(int lendingLength) {
		this.lendingLength = lendingLength;
	}
	
	public void printMedia(){
		System.out.println("=====Media Detail=====");
		System.out.println("Name : "+ name);
		System.out.println("Lending Length :"+lendingLength);
	}
	
	

}
