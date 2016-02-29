package strupattern.decorator;
/*
 * 
 * Concrete Component
 * 
 */
public class SavingsAccount extends BankAccount {

	@Override
	public double balanceToMaintain() {
		
		return 1000.00;
	}

}
