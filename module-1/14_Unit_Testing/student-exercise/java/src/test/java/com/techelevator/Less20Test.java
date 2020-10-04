package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class Less20Test {
	private Less20 less20;
	
	
	@Before
	public void beforeAllTests() {
		less20 = new Less20();
	}
	
	@Test
	public void testTrueReturns() {
		boolean ret1 = less20.isLessThanMultipleOf20(19);
		boolean ret2 = less20.isLessThanMultipleOf20(18);
		boolean ret3 = less20.isLessThanMultipleOf20(59);
		boolean ret4 = less20.isLessThanMultipleOf20(58);
		boolean ret5 = less20.isLessThanMultipleOf20(139);
		boolean ret6 = less20.isLessThanMultipleOf20(138);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(true, ret3);
		Assert.assertEquals(true, ret4);
		Assert.assertEquals(true, ret5);
		Assert.assertEquals(true, ret6);
	}
	
	@Test
	public void testFalseReturns() {
		boolean ret1 = less20.isLessThanMultipleOf20(20);
		boolean ret2 = less20.isLessThanMultipleOf20(21);
		boolean ret3 = less20.isLessThanMultipleOf20(60);
		boolean ret4 = less20.isLessThanMultipleOf20(65);
		boolean ret5 = less20.isLessThanMultipleOf20(140);
		boolean ret6 = less20.isLessThanMultipleOf20(147);
		
		Assert.assertEquals(false, ret1);
		Assert.assertEquals(false, ret2);
		Assert.assertEquals(false, ret3);
		Assert.assertEquals(false, ret4);
		Assert.assertEquals(false, ret5);
		Assert.assertEquals(false, ret6);
	}
	
	@Test
	public void testZero() {
		boolean ret1 = less20.isLessThanMultipleOf20(0);
		
		Assert.assertEquals(false, ret1);

	}
	
	@Test
	public void testNegativeNums() {
		boolean ret1 = less20.isLessThanMultipleOf20(-1);
		boolean ret2 = less20.isLessThanMultipleOf20(-19);
		boolean ret3 = less20.isLessThanMultipleOf20(-18);
		
		Assert.assertEquals(false, ret1);
		Assert.assertEquals(false, ret2);
		Assert.assertEquals(false, ret3);
	}
}
