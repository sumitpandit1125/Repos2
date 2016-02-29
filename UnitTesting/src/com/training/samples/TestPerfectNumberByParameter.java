package com.training.samples;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPerfectNumberByParameter {
	
	int numbers;
	
	public TestPerfectNumberByParameter(int numbers) {
		super();
		this.numbers = numbers;
	}

	@Test
	public void testPerfectByParam(){
		
		boolean actual = PerfectNumber.checkNum(numbers);
		assertTrue(numbers + " is not perfect number", actual);
		 
	}
	
	@Parameters
	public static Collection<Object> data() {
		
		Object[] data = new Object[] {6,33,28,4};
		return Arrays.asList(data);
		
	}

}
