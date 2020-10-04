package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class Lucky13Test {
	private Lucky13 lucky13;
	
	@Before
	public void beforeAllTests() {
		lucky13 = new Lucky13();
	}
	
	@Test
	public void testTrueArrays() {
		int[] input1 = new int[] {2, 4, 5, 6};
		boolean ret1 = lucky13.getLucky(input1);
		int[] input2 = new int[] {10, 11, 12, 14};
		boolean ret2 = lucky13.getLucky(input2);
		int[] input3 = new int[] {33, 34, 55, 113};
		boolean ret3 = lucky13.getLucky(input3);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(true, ret3);
	}
	
	@Test
	public void testFalseArrays() {
		int[] input1 = new int[] {1, 2, 4, 6};
		boolean ret1 = lucky13.getLucky(input1);
		int[] input2 = new int[] {3, 11, 12, 14};
		boolean ret2 = lucky13.getLucky(input2);
		int[] input3 = new int[] {13, 34, 3, 113};
		boolean ret3 = lucky13.getLucky(input3);
		
		Assert.assertEquals(false, ret1);
		Assert.assertEquals(false, ret2);
		Assert.assertEquals(false, ret3);
	}
	
	@Test
	public void testArraysWithZero() {
		int[] input1 = new int[] {1, 2, 0, 6};
		boolean ret1 = lucky13.getLucky(input1);
		int[] input2 = new int[] {3, 11, 0, 14};
		boolean ret2 = lucky13.getLucky(input2);
		int[] input3 = new int[] {0, 14, 34, 55, 113};
		boolean ret3 = lucky13.getLucky(input3);
		int[] input4 = new int[] {2, 14, 0, 55, 113};
		boolean ret4 = lucky13.getLucky(input4);
		
		Assert.assertEquals(false, ret1);
		Assert.assertEquals(false, ret2);
		Assert.assertEquals(true, ret3);
		Assert.assertEquals(true, ret4);
	}
	
	@Test
	public void testArraysWithNegatives() {
		int[] input1 = new int[] {1, -2, 0, 6};
		boolean ret1 = lucky13.getLucky(input1);
		int[] input2 = new int[] {3, 11, 0, -14};
		boolean ret2 = lucky13.getLucky(input2);
		int[] input3 = new int[] {0, 14, -34, 55, 113};
		boolean ret3 = lucky13.getLucky(input3);
		int[] input4 = new int[] {-2, 14, 0, 55, 113};
		boolean ret4 = lucky13.getLucky(input4);
		
		Assert.assertEquals(false, ret1);
		Assert.assertEquals(false, ret2);
		Assert.assertEquals(true, ret3);
		Assert.assertEquals(true, ret4);
	}
}
