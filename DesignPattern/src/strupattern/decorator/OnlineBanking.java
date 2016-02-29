package strupattern.decorator;

import strupattern.decorator.BankAccount;

public class OnlineBanking extends FeatureDecorator {

	
	public OnlineBanking(BankAccount account) {
		super(account);
		
	}



	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain()+5000.00;
	}

}
