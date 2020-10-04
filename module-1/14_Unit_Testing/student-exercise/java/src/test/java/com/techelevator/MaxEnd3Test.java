package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class MaxEnd3Test {
	private MaxEnd3 maxEnd3;
	
	@Before
	public void beforeAllTests() {
		maxEnd3 = new MaxEnd3();
	}
	
	@Test
	public void testAllPositives() {
		int[] input1 = new int[] {1, 2, 3};
		int[] ret1 = maxEnd3.makeArray(input1);
		int[] expected1 = new int[] {3, 3, 3};
		Assert.assertArrayEquals(expected1, ret1);
		
		int[] input2 = new int[] {11, 22, 3};
		int[] ret2 = maxEnd3.makeArray(input2);
		int[] expected2 = new int[] {22, 22, 22};
		Assert.assertArrayEquals(expected2, ret2);
		
		int[] input3 = new int[] {100, 78, 3};
		int[] ret3 = maxEnd3.makeArray(input3);
		int[] expected3 = new int[] {100, 100, 100};
		Assert.assertArrayEquals(expected3, ret3);
	}
	
	@Test
	public void testTooManyElements() {
		int[] input1 = new int[] {1, 2, 3, 4};
		int[] ret1 = maxEnd3.makeArray(input1);
		int[] expected1 = new int[] {3, 3, 3};
		Assert.assertArrayEquals(expected1, ret1);
		
		int[] input2 = new int[] {11, 22, 3, 78, 100};
		int[] ret2 = maxEnd3.makeArray(input2);
		int[] expected2 = new int[] {22, 22, 22};
		Assert.assertArrayEquals(expected2, ret2);
		
		int[] input3 = new int[] {100, 78, 3, 55, 33};
		int[] ret3 = maxEnd3.makeArray(input3);
		int[] expected3 = new int[] {100, 100, 100};
		Assert.assertArrayEquals(expected3, ret3);
	}

	@Test
	public void testWithZero() {
		int[] input1 = new int[] {1, 0, 3};
		int[] ret1 = maxEnd3.makeArray(input1);
		int[] expected1 = new int[] {3, 3, 3};
		Assert.assertArrayEquals(expected1, ret1);
		
		int[] input2 = new int[] {11, 0, 3, 78, 100};
		int[] ret2 = maxEnd3.makeArray(input2);
		int[] expected2 = new int[] {11, 11, 11};
		Assert.assertArrayEquals(expected2, ret2);
		
		int[] input3 = new int[] {100, 78, 0};
		int[] ret3 = maxEnd3.makeArray(input3);
		int[] expected3 = new int[] {100, 100, 100};
		Assert.assertArrayEquals(expected3, ret3);
	}
	
	@Test
	public void testWithNegatives() {
		int[] input1 = new int[] {1, 0, -3};
		int[] ret1 = maxEnd3.makeArray(input1);
		int[] expected1 = new int[] {1, 1, 1};
		Assert.assertArrayEquals(expected1, ret1);
		
		int[] input2 = new int[] {11, 0, 3, -78, 100};
		int[] ret2 = maxEnd3.makeArray(input2);
		int[] expected2 = new int[] {11, 11, 11};
		Assert.assertArrayEquals(expected2, ret2);
		
		int[] input3 = new int[] {-100, 78, 0};
		int[] ret3 = maxEnd3.makeArray(input3);
		int[] expected3 = new int[] {78, 78, 78};
		Assert.assertArrayEquals(expected3, ret3);
	}
	
}
