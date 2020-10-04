package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class NonStartTest {
	private NonStart nonStart;
	
	@Before
	public void beforeAllTests() {
		nonStart = new NonStart();
	}
	
	@Test
	public void testLowerCaseString() {
		String st1 = "hello";
		String st2 = "there";
		String expected = "ellohere";
		String actual = nonStart.getPartialString(st1, st2);
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testUpperCaseString() {
		String st1 = "LETTUCE";
		String st2 = "PATCH";
		String expected = "ETTUCEATCH";
		String actual = nonStart.getPartialString(st1, st2);
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testMixedCaseString() {
		String st1 = "Chop";
		String st2 = "shoP";
		String expected = "hophoP";
		String actual = nonStart.getPartialString(st1, st2);
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testFirstEmptyString() {
		String st1 = "";
		String st2 = "There";
		String expected = "here";
		String actual = nonStart.getPartialString(st1, st2);
		Assert.assertEquals(expected, actual);
		
	}

	@Test
	public void testSecondEmptyString() {
		String st1 = "showMan";
		String st2 = "";
		String expected = "howMan";
		String actual = nonStart.getPartialString(st1, st2);
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testBothEmptyString() {
		String actual = "";
		
		String st1 = "";
		String st2 = "";
		String expected = "";
		try {
			actual = nonStart.getPartialString(st1, st2);
		}
		catch (Exception e) {
			// Do nothing in this case.  We expect a failure.
		}
		
		Assert.assertEquals(expected, actual);
		
	}
	
}
