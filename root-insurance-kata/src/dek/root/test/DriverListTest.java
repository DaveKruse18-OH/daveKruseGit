package dek.root.test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import dek.root.Driver;
import dek.root.DriverList;

public class DriverListTest {
	@Test
	public void testAddDriver() {
		DriverList dl = new DriverList();
		dl.addDriver("testDriver1");
		dl.addDriver("testDriver2");
		List<Driver> driverList = dl.getDriversList();
			
		assertEquals(driverList.size(), 2);
	}
	
	@Test
	public void testSetDriverList() {
		DriverList dl = new DriverList();
		dl.addDriver("testDriver1");
		dl.addDriver("testDriver2");
		dl.addDriver("testDriver3");
		List<Driver> newDriverList = new ArrayList<Driver>();
		Driver driver1 = new Driver();
		driver1.setName("newTestDriver1");
		newDriverList.add(driver1);
		dl.setDriversList(newDriverList);
		
		assertEquals(dl.getDriversList().size(), 1);
	}
}
