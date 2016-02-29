package com.training.domain;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.training.ifaces.Automobile;

public class NewShowRoomTest {
	
	NewShowRoom obj;
	Object newObj;
	Boolean actual;
	
	@Before
	public void setUp() throws Exception {
		
		obj = new NewShowRoom();	
		
	}
	@Test
	public void testReturnType() {
		newObj = obj.getItem(5);
		actual = newObj instanceof Automobile || newObj == null;
		assertTrue("ReturnType not valid",actual);
		
	}
	@Test
	public void testPassengerCar() {
		newObj = obj.getItem(1);
		actual = newObj.getClass().equals(PassengerCar.class);
		assertTrue("ReturnType not valid",actual);
	}
	@Test
	public void testLuxuryCar() {
		newObj = obj.getItem(2);
		actual = newObj.getClass().equals(LuxuryCar.class);
		assertTrue("ReturnType not valid",actual);
	}
	@Test
	public void testSportsCar() {
		newObj = obj.getItem(3);
		actual = newObj.getClass().equals(SportsCar.class);
		assertTrue("ReturnType not valid",actual);
	}
	@Test
	public void testSportsBike() {
		newObj = obj.getItem(4);
		actual = newObj.getClass().equals(SportsBike.class);
		assertTrue("ReturnType not valid",actual);
	}
	@Test
	public void testDefault() {
		newObj = obj.getItem(5);		
		assertNull(newObj);
	}

}
