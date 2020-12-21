package dek.root.test;

import static org.junit.Assert.*;
import org.junit.Test;

import dek.root.DriverTripReport;

public class DriverTripReportTest {

	@Test
	public void testGetTotalTime() {
		DriverTripReport dtr = new DriverTripReport();
		dtr.setTotalTime(10.4);
		double result = dtr.getTotalTime();
		
		assertTrue("Not Equal", result == 10.4);
	}

}
