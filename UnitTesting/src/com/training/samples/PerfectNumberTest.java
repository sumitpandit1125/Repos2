package com.training.samples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTest {
	Boolean actual;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPositiveInteger() {
		actual = PerfectNumber.checkNum(1);
		assertFalse(actual);
	}
	
	@Test
	public void testResult(){
		actual = PerfectNumber.checkNum(28);
		assertTrue(actual);
	}
	
	@Test(timeout = 1000)
	public void testLoop(){
		PerfectNumber.checkNum(28);
	}
	
	@Test
	public void testReturnType(){
		Object obj = PerfectNumber.checkNum(28);
		actual = obj.getClass().equals(Boolean.class);
		assertTrue(actual);
	}
	
	

}
