package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class SameFristLastTest {
	private SameFirstLast sameFirstLast;
	
	@Before
	public void beforeAllTests() {
		sameFirstLast = new SameFirstLast();
	}
	
	@Test
	public void testPositiveTrue() {
		int[] new1 = new int[] {1, 2, 3, 1};
		boolean ret1 = sameFirstLast.isItTheSame(new1);
		int[] new2 = new int[] {4, 4};
		boolean ret2 = sameFirstLast.isItTheSame(new2);
		int[] new3 = new int[] {4, 99, 88, 42, 4};
		boolean ret3 = sameFirstLast.isItTheSame(new3);
		int[] new4 = new int[] {4, 99, 88, 42, 4};
		boolean ret4 = sameFirstLast.isItTheSame(new4);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(true, ret3);
		Assert.assertEquals(true, ret4);
	}
	
	@Test
	public void testPositiveFalse() {
		int[] new1 = new int[] {1, 2, 3, };
		boolean ret1 = sameFirstLast.isItTheSame(new1);
		int[] new2 = new int[] {4, 5};
		boolean ret2 = sameFirstLast.isItTheSame(new2);
		int[] new3 = new int[] {4, 99, 88, 42, 7};
		boolean ret3 = sameFirstLast.isItTheSame(new3);
		int[] new4 = new int[] {4, 99, 88, 42};
		boolean ret4 = sameFirstLast.isItTheSame(new4);
		
		Assert.assertEquals(false, ret1);
		Assert.assertEquals(false, ret2);
		Assert.assertEquals(false, ret3);
		Assert.assertEquals(false, ret4);
	}
	
	@Test
	public void testNegativeTrue() {
		int[] new1 = new int[] {-1, 2, 3, -1};
		boolean ret1 = sameFirstLast.isItTheSame(new1);
		int[] new2 = new int[] {-4, -4};
		boolean ret2 = sameFirstLast.isItTheSame(new2);
		int[] new3 = new int[] {-4, 99, 88, 42, -4};
		boolean ret3 = sameFirstLast.isItTheSame(new3);
		int[] new4 = new int[] {-4, 99, 88, 42, -4};
		boolean ret4 = sameFirstLast.isItTheSame(new4);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(true, ret3);
		Assert.assertEquals(true, ret4);
	}
	
	@Test
	public void testNegativeFalse() {
		int[] new1 = new int[] {-1, 2, -3};
		boolean ret1 = sameFirstLast.isItTheSame(new1);
		int[] new2 = new int[] {-4, -5};
		boolean ret2 = sameFirstLast.isItTheSame(new2);
		int[] new3 = new int[] {-4, 99, 88, 42, -5};
		boolean ret3 = sameFirstLast.isItTheSame(new3);
		int[] new4 = new int[] {-4, 99, 88, -42};
		boolean ret4 = sameFirstLast.isItTheSame(new4);
		
		Assert.assertEquals(false, ret1);
		Assert.assertEquals(false, ret2);
		Assert.assertEquals(false, ret3);
		Assert.assertEquals(false, ret4);
	}
	
	@Test
	public void testMixTrueFalse() {
		int[] new1 = new int[] {-1, 2, -1};
		boolean ret1 = sameFirstLast.isItTheSame(new1);
		int[] new2 = new int[] {4, 4};
		boolean ret2 = sameFirstLast.isItTheSame(new2);
		int[] new3 = new int[] {-4, 99, 88, 42, 4};
		boolean ret3 = sameFirstLast.isItTheSame(new3);
		int[] new4 = new int[] {4, 99, 88, -42};
		boolean ret4 = sameFirstLast.isItTheSame(new4);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(false, ret3);
		Assert.assertEquals(false, ret4);
	}

	@Test
	public void testZero() {
		int[] new1 = new int[] {0, 2, 0};
		boolean ret1 = sameFirstLast.isItTheSame(new1);
		int[] new2 = new int[] {0, 0};
		boolean ret2 = sameFirstLast.isItTheSame(new2);
		int[] new3 = new int[] {0, -6, -3, 0};
		boolean ret3 = sameFirstLast.isItTheSame(new3);
		int[] new4 = new int[] {-0, 06, 4, -0};
		boolean ret4 = sameFirstLast.isItTheSame(new4);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(true, ret3);
		Assert.assertEquals(true, ret4);
	}

	@Test
	public void testOneElement() {
		int[] new1 = new int[] {0};
		boolean ret1 = sameFirstLast.isItTheSame(new1);

		Assert.assertEquals(true, ret1);
	}
	
	@Test
	public void testEmptyList() {
		int[] new1 = new int[] {};
		boolean ret1 = sameFirstLast.isItTheSame(new1);

		Assert.assertEquals(false, ret1);
	}
	
	@Test
	public void testNullList() {
		boolean ret1 = sameFirstLast.isItTheSame(null);

		Assert.assertEquals(false, ret1);
	}
}
