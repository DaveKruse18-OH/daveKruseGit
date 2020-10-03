package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class FrontTimesTest {
	private FrontTimes frontTimes;
	
	@Before
	public void beforeAllTests() {
		frontTimes = new FrontTimes();
	}
	
	@Test
	public void testGoodString() {
		String ret1 = frontTimes.generateString("Abc", 3);
		String ret2 = frontTimes.generateString("Pokey", 4);
		String ret3 = frontTimes.generateString("zXy", 2);
		
		Assert.assertEquals("AbcAbcAbc", ret1);
		Assert.assertEquals("PokPokPokPok", ret2);
		Assert.assertEquals("zXyzXy", ret3);
	}
	
	@Test
	public void testSmallString() {
		String ret1 = frontTimes.generateString("A", 3);
		String ret2 = frontTimes.generateString("4", 4);
		String ret3 = frontTimes.generateString("z", 2);
		
		Assert.assertEquals("AAA", ret1);
		Assert.assertEquals("4444", ret2);
		Assert.assertEquals("zz", ret3);
	}
	
	@Test
	public void testZeroRepeat() {
		String ret1 = frontTimes.generateString("Abc", 0);
		String ret2 = frontTimes.generateString("4y7K", 0);
		String ret3 = frontTimes.generateString("z", 0);
		
		Assert.assertEquals("", ret1);
		Assert.assertEquals("", ret2);
		Assert.assertEquals("", ret3);
	}
	
	@Test
	public void testNegRepeat() {
		String ret1 = frontTimes.generateString("Abc", -2);
		String ret2 = frontTimes.generateString("4y7K", -4);
		String ret3 = frontTimes.generateString("z", -1);
		
		Assert.assertEquals("", ret1);
		Assert.assertEquals("", ret2);
		Assert.assertEquals("", ret3);	
	}

}
