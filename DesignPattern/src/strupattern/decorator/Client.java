package strupattern.decorator;

public class Client {

	public static void main(String[] args) {
		
		BankAccount account = new SavingsAccount();
		System.out.println("Savings Account " + account.balanceToMaintain());
		
		account = new OnlineBanking(account);
		System.out.println("Savings Account + Online Banking " + account.balanceToMaintain());
		
		account = new SocialBankAccount(account);
		System.out.println("Savings Account + Online Banking + Social Account " + account.balanceToMaintain());

	}

}
