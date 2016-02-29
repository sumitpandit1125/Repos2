package com.training;


import java.util.Scanner;

public class InsuranceApplication {
	
	public static void main(String[] args)
	{
		LifeInsurance ins1=new LifeInsurance();
		
		//instance variable has a default value
		System.out.println(ins1.calculate());
	//command line	
		LifeInsurance ins3=new LifeInsurance(Long.parseLong(args[0]),args[1],args[2],Double.parseDouble(args[3]));
		
		LifeInsurance ins2=new LifeInsurance(988,"rahman","Qtr",690);
		System.out.println(ins3.calculate());
		
		//using scanner class
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Policy Number");
             long policyNumber=sc.nextLong();
             
             System.out.println("Enter Policy Holdr name");
             String policyHolderName=sc.next();
             
             System.out.println("Enter Pymnt mode");
             String paymentMode=sc.next();
             
             System.out.println("Enter Premium amount");
             double policyAmount=sc.nextDouble();
             LifeInsurance ins4 =new LifeInsurance(policyNumber, policyHolderName, paymentMode, policyAmount);
             System.out.println(ins4.calculate());
             System.out.println(ins4.calculate(15.0));
	}

	
	}


