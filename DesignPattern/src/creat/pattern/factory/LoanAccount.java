package creat.pattern.factory;

/*
 * 
 * @super class
 * 
 * 
 */

public abstract class LoanAccount {
	
	private Float rateOfInterest;
	
	public LoanAccount (Float rateOfInterest){
		this.rateOfInterest = rateOfInterest;
	}
	
	public Float getInterst(){
		return rateOfInterest;
	}
	
	public abstract Double calculateIntersert();
	
}
