package com.techelevator;

import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;
import org.junit.Assert;

public class CigarPartyTest {
	private CigarParty cigarParty;
	
	@Before
	public void beforeAllTests() {
		cigarParty = new CigarParty();
	}
	
	@Test
	public void testNotWeekend() {
		boolean ret1 = cigarParty.haveParty(40, false);
		boolean ret2 = cigarParty.haveParty(60, false);
		boolean ret3 = cigarParty.haveParty(39, false);
		boolean ret4 = cigarParty.haveParty(61, false);
		boolean ret5 = cigarParty.haveParty(0, false);
		boolean ret6 = cigarParty.haveParty(-2, false);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(false, ret3);
		Assert.assertEquals(false, ret4);
		Assert.assertEquals(false, ret5);
		Assert.assertEquals(false, ret6);
	}

	@Test
	public void testWeekend() {
		boolean ret1 = cigarParty.haveParty(40, true);
		boolean ret2 = cigarParty.haveParty(60, true);
		boolean ret3 = cigarParty.haveParty(39, true);
		boolean ret4 = cigarParty.haveParty(61, true);
		boolean ret5 = cigarParty.haveParty(0, true);
		boolean ret6 = cigarParty.haveParty(-2, true);
		
		Assert.assertEquals(true, ret1);
		Assert.assertEquals(true, ret2);
		Assert.assertEquals(false, ret3);
		Assert.assertEquals(true, ret4);
		Assert.assertEquals(false, ret5);
		Assert.assertEquals(false, ret6);
	}

}
