package dek.root.test;

import static org.junit.Assert.*;
import org.junit.Test;
import dek.root.Driver;
import dek.root.Trip;

public class TripTest {

	@Test
	public void testSetDriverName() {
		Trip trip = new Trip();
		trip.setDriverName("testDriverName");
		String result = trip.getDriverName();
		
		assertEquals("testDriverName", result);
	}
	
	@Test
	public void testStartTime() {
		Trip trip = new Trip();
		trip.setStartHour(15);
		trip.setStartMinute(25);
		int result1 = trip.getStartHour();
		int result2 = trip.getStartMinute();
		
		assertEquals(15, result1);
		assertEquals(25, result2);
	}

	@Test
	public void testStopTime() {
		Trip trip = new Trip();
		trip.setStopHour(16);
		trip.setStopMinute(30);
		int result1 = trip.getStopHour();
		int result2 = trip.getStopMinute();
		
		assertEquals(16, result1);
		assertEquals(30, result2);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSetMiles() {
		Trip trip = new Trip();
		trip.setMiles(300.3);;
		double result = trip.getMiles();
		assertTrue("Not Equals", result == 300.3);
	}
}
