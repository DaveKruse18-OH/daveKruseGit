package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class DateFashionTest {
	DateFashion dateFashion;

	@Before
	public void beforeAllTests() {
		dateFashion = new DateFashion();
	}
	
	@Test
	public void testMyStyle() {
		int ret1 = dateFashion.getATable(8, 5);
		int ret2 = dateFashion.getATable(2, 5);
		int ret3 = dateFashion.getATable(5, 5);
		
		Assert.assertEquals(2, ret1);
		Assert.assertEquals(0, ret2);
		Assert.assertEquals(1, ret3);
	}

	@Test
	public void testDatesStyle() {
		int ret1 = dateFashion.getATable(5, 8);
		int ret2 = dateFashion.getATable(5, 2);
		int ret3 = dateFashion.getATable(5, 5);
		
		Assert.assertEquals(2, ret1);
		Assert.assertEquals(0, ret2);
		Assert.assertEquals(1, ret3);
	}
}
