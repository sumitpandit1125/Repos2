package com.training;

public class InsuranceManagerApplication {
	
	public static void main(String[] args){
		
		LifeInsurance ins1=new LifeInsurance(101,"Ramesh","Qtr",450000);
		LifeInsurance ins2=new LifeInsurance(102,"Rajesh","Hlf",450000);
		LifeInsurance ins3=new LifeInsurance(103,"Dhamesh","Qtr",450000);
		LifeInsurance ins4=new LifeInsurance(104,"Pramesh","Yrly",450000);
		
		LifeInsurance[] list= new LifeInsurance[4];
		
		list[0]=ins1;
		list[1]=ins2;
		list[2]=ins3;
		list[3]=ins4;
		
	//	InsuranceManager insmgr= new InsuranceManager();
	//	insmgr.printPremiums(list);
		InsuranceManager.printPremiums(list);
	}
	

}

