package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class StringBitsTest {
	private StringBits stringBits;
	
	@Before
	public void beforeAllTests() {
		stringBits = new StringBits();
	}
	
	@Test
	public void testSimpleStrings() {
		// Arrange (see @Before)
		
		// Act
		String input1 = "Hello";
		String input2 = "hleyl9lqo";
		String input3 = "498200";
		String return1 = stringBits.getBits(input1);
		String return2 = stringBits.getBits(input2);
		String return3 = stringBits.getBits(input3);
		
		// Assert
		Assert.assertEquals("Hlo", return1);
		Assert.assertEquals("hello", return2);
		Assert.assertEquals("480", return3);
	}
	
	@Test
	public void testEmptyString() {
		// Arrange (see @Before)
		
		// Act
		String input1 = "";
		String return1 = stringBits.getBits(input1);
		
		// Assert
		Assert.assertEquals("", return1);
	}
	
	@Test
	public void testNullString() {
		// Arrange (see @Before)
		
		// Act
		String input1 = null;
		String return1 = stringBits.getBits(input1);
		
		// Assert
		Assert.assertEquals("", return1);
	}
}
