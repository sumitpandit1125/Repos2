package creat.pattern.factory;
/*
 * 
 * @sub class2
 * 
 *   
 * 
 */
public class PersonalLoan extends LoanAccount {
	
	private Double amount;
	private Integer year;

	public PersonalLoan(Float rateOfInterest) {
		super(rateOfInterest);
	}

	@Override
	public Double calculateIntersert() {
		
		return getInterst() * amount * year;
	}

}
