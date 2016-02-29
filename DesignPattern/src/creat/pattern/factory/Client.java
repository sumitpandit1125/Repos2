package creat.pattern.factory;

import creat.pattern.factory.LoanFactory.LoanType;

public class Client {
	
	public static void main(String[] args) {
		
		LoanAccount pAcnt1 = LoanFactory.getInstance();
		LoanAccount pAcnt2 = LoanFactory.getInstance(LoanType.PERSONALLOAN);
		LoanAccount hAcnt1 = LoanFactory.getInstance(LoanType.HOUSINGLOAN);
		
	}

}
