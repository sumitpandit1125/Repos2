package strupattern.decorator;
/*
 * 
 * Decorator
 * 
 */
import strupattern.decorator.BankAccount;

public abstract class FeatureDecorator extends BankAccount {

	protected BankAccount account;

	public FeatureDecorator(BankAccount account) {
		super();
		this.account = account;
	}
	
	
	
	
	

}
