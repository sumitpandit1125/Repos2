package com.training.samples;

public class PerfectNumber {
	
	public static Boolean checkNum(int i){
		int sum = 1;
		if(i<=1)
			return false;
		else{
			for(int j=2; j<=i/2; j++){
				if(i%j==0){
					sum += j;
				}
			}
			if(sum == i)
				return true;
			
		}		
		return false;
	}
}
