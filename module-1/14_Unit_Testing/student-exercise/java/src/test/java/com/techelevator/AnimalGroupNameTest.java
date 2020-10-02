package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class AnimalGroupNameTest {
	private AnimalGroupName ag;
	
	@Before
	public void beforeAllTests() {
		ag = new AnimalGroupName();
	}
	
	@Test
	public void testHashMap() {
		// Arrange (see @Before)
		
		// Act
		String result1 = ag.getHerd("Rhino");
		String result2 = ag.getHerd("Giraffe");
		String result3 = ag.getHerd("Elephant");
		String result4 = ag.getHerd("Lion");
		String result5 = ag.getHerd("Crow");
		String result6 = ag.getHerd("Pigeon");
		String result7 = ag.getHerd("Flamingo");
		String result8 = ag.getHerd("Deer");
		String result9 = ag.getHerd("Dog");
		String result10 = ag.getHerd("Crocodile");
		
		// Assert
		Assert.assertEquals("Crash", result1);
		Assert.assertEquals("Tower", result2);
		Assert.assertEquals("Herd", result3);
		Assert.assertEquals("Pride", result4);
		Assert.assertEquals("Murder", result5);
		Assert.assertEquals("Kit", result6);
		Assert.assertEquals("Pat", result7);
		Assert.assertEquals("Herd", result8);
		Assert.assertEquals("Pack", result9);
		Assert.assertEquals("Float", result10);
	}
	
	@Test
	public void testEmptyString() {
		// Arrange (see @Before)
		
		// Act
		String result = ag.getHerd("");

		
		// Assert
		Assert.assertEquals("unknown", result);
	}
	
	@Test
	public void testLowerCaseString() {
		// Arrange (see @Before)
		
		// Act
		String result = ag.getHerd("elephant");

		
		// Assert
		Assert.assertEquals("Herd", result);
	}
	
	@Test
	public void testMixCaseString() {
		// Arrange (see @Before)
		
		// Act
		String result = ag.getHerd("giRafFe");

		
		// Assert
		Assert.assertEquals("Tower", result);
	}
	
	@Test
	public void testValueNotPresent() {
		// Arrange (see @Before)
		
		// Act
		String result = ag.getHerd("Otter");

		// Assert
		Assert.assertEquals("unknown", result);
	}
	
	@Test
	public void testNullValue() {
		// Arrange (see @Before)
		
		// Act
		String result = ag.getHerd(null);

		// Assert
		Assert.assertEquals("unknown", result);
	}
}
