package com.DesigningClass;

public class ApplicationTaxWhiz {

	public static void main(String[] args) {
		
		TaxWhiz tax1 = new TaxWhiz();
		tax1.setCurrentTax(5.4f);
		System.out.println("First Tax : "+ tax1.calcTax(1000000));
		TaxWhiz tax2 = new TaxWhiz(4.5f);
		System.out.println("Second Tax : "+ tax2.calcTax(2000000));
	}

}
