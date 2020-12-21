package dek.root.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import dek.root.Driver;
import dek.root.DriverList;
import dek.root.Trip;
import dek.root.TripList;

public class TripListTest {
	@Test
	public void testAddTrip() {
		TripList tl = new TripList();
		tl.addTrip("testTripDriver", "10:10", "11:11", "110.0");
		List<Trip> tripList = tl.getTripList();
		Trip trip = tripList.get(0);
		String driverName = trip.getDriverName();
		
		assertEquals(driverName, "testTripDriver");
		assertEquals(tripList.size(), 1);
	}
	
	@Test
	public void testRemoveTrip() {
		TripList tl = new TripList();
		tl.addTrip("testTripDriver1", "10:10", "11:11", "110.0");
		tl.addTrip("testTripDriver2", "10:20", "11:30", "200.0");
		List<Trip> tripList = tl.getTripList();
		Trip trip = tripList.get(0);
		tl.removeTrip(trip);
		
		assertEquals(tripList.size(), 1);
		assertEquals(tripList.get(0).getDriverName(), "testTripDriver2");
	}
	
	@Test
	public void testGetMph() {
		TripList tl = new TripList();
		tl.addTrip("testTripDriver1", "10:00", "11:00", "65.0");
		List<Trip> tripList = tl.getTripList();
		Trip trip = tripList.get(0);
		double mph = tl.getMilesPerHour(trip);
		
		assertTrue("Not true", mph == 65.0);
	}
	
	@Test
	public void testSetTripList() {
		TripList tl = new TripList();
		tl.addTrip("testTripDriver1", "10:10", "11:11", "110.0");
		tl.addTrip("testTripDriver2", "10:20", "11:30", "200.0");
		List<Trip> newTripList = new ArrayList<Trip>();
		Trip trip = new Trip();
		trip.setDriverName("testDriver1");
		newTripList.add(trip);
		tl.setTripList(newTripList);
		
		assertEquals(tl.getTripList().size(), 1);
	}
}