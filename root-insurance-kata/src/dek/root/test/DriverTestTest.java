package dek.root.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dek.root.Driver;

public class DriverTestTest {

	@Test
	public void testDriverGetName() {
		Driver driver = new Driver();
		String inputString = "testName";
		driver.setName(inputString);
		String result = driver.getName();
		System.out.println(result);
		
		assertEquals(inputString, result);
	}
}
