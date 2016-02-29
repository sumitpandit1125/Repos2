package com.training.samples;

public class BankAccount {
	
	private Long accountNumber;
	private String accountHolderName;
	private Double balance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(Long accountNumber, String accountHolderName, Double balance) throws NullPointerException{
		super();
		if(accountNumber == null || accountHolderName == null || balance == null) {
			throw new NullPointerException();
		}
		else {
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.balance = balance;
		}
		
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public double deposit(Double depositAmount) {
		
		balance += depositAmount;
		return balance;
	}
	
	public double withdraw(Double withdrawAmount) {
		
		Double newBal = balance - withdrawAmount;
		if(newBal>=0)
			balance = newBal;
		return balance;
		
	}
}
