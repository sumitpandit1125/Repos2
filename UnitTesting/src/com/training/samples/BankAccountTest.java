package com.training.samples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	BankAccount obj;
	
	@Before
	public void setUp() throws NullPointerException {
		
		obj = new BankAccount(85692l, "Sumit", 8000.0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNullObject() throws NullPointerException{
		
		BankAccount obj1 = new BankAccount(0l, null, 0.0);
		assertNull(obj1);
		
	}
	
	@Test
	public void testConsistency() throws NullPointerException {
		
		Long acNo = 123654789l;
		String name = "Sumit";
		Double bal = 152000.0;	
		
		BankAccount obj1 = new BankAccount(acNo, name, bal);
				
		assertEquals(acNo,obj1.getAccountNumber());
		assertEquals(name,obj1.getAccountHolderName());
		assertEquals(bal,obj1.getBalance(),0);
				
	}
	
	@Test
	public void testDeposit() {
				
		Double actual = obj.deposit(-8100.0);
		assertFalse("Deposit Amount Should Be Positive",actual<8000);
		
	}
	
	@Test
	public void testWithdraw() {
				
		Double actual = obj.withdraw(8100.0);
		assertFalse("Overdraft not allowed", actual<0);	
		
	}
	
	@Test
	public void depositPlusAmount() {
				
		Double actual = obj.deposit(8100.0);
		assertTrue("Deposit Amount not added properly", actual==16100);
		
	}
	
	@Test (timeout = 1000)
	public void infiniteLoop(){
				
		obj.withdraw(8100.0);
		
	}
	
	@Test (expected = NullPointerException.class)
	public void noNullParameter() throws Exception{
		
		obj = new BankAccount(0l, null, 8000.0);
	}

}
