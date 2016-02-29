package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {
	CurrencyConverter conv = new CurrencyConverter();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("After Class");
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Before Called=====");
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Called=====");
		
	}

	@Test
	public void test1() {
		//fail("Test 1 Not yet implemented");
		
		double actual = conv.dollarToRupees(10);
		
		assertEquals(1004.0, actual, 4);
			
	}
	
	@Test
	public void test2() {
		
		Double actual = conv.dollarToRupees(10);
		assertNotNull(actual);
	}

}
