package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	private KataFizzBuzz fB;
	
	@Before
	public void beforeAllTests() {
		fB = new KataFizzBuzz();
	}
	
	@Test
	public void testDivBy3() {
		String ret1 = fB.fizzBuss(3);
	}

}
