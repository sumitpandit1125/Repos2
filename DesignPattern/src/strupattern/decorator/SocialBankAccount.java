package strupattern.decorator;

public class SocialBankAccount extends FeatureDecorator {

	
	
	public SocialBankAccount(BankAccount account) {
		super(account);
		
	}

	@Override
	public double balanceToMaintain() {
		return account.balanceToMaintain()+10000.00;
	}

}
