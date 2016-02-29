package creat.pattern.factory;

/*
 * 
 * @factory Class with a static method to create Instance of subclass
 * 
 *   
 * 
 */

public class LoanFactory {
	
	public enum  LoanType {HOUSINGLOAN,PERSONALLOAN};
	
	public static LoanAccount getInstance(LoanType type){
		
		switch (type){
		case HOUSINGLOAN :
			return new HousingLoan(12.00f);
		case PERSONALLOAN:	
			return new PersonalLoan(13.00f);
		default :
			return null;
				
		}
		
	}
	
	public static LoanAccount getInstance(){
		return new PersonalLoan(13.00f);
	}

}
