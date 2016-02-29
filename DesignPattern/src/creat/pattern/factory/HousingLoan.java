package creat.pattern.factory;

/*
 * 
 * @sub class1
 * 
 *   
 * 
 */
public class HousingLoan extends LoanAccount {

	private Double amount;
	private Integer year;
	
	public HousingLoan(Float rateOfInterest) {
		super(rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculateIntersert() {
		
		return getInterst() * amount * year + 2000;
	}

}
