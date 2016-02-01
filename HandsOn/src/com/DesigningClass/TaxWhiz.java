package com.DesigningClass;

public class TaxWhiz {
	
	private float currentTax;
	
	public TaxWhiz(){
		currentTax = 0;
	}

	public TaxWhiz(float currentTax) {
		super();
		this.currentTax = currentTax;
	}

	public float getCurrentTax() {
		return currentTax;
	}

	public void setCurrentTax(float currentTax) {
		this.currentTax = currentTax;
	}
	
	public double calcTax(double purchase){
		return purchase * currentTax;
	}

}
