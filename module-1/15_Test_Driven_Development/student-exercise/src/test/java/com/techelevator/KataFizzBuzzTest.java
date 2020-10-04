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
	public void testRetNum() {
		String ret1 = fB.fizzBuss(1);
		String ret2 = fB.fizzBuss(3);
		String ret3 = fB.fizzBuss(5);
		String ret4 = fB.fizzBuss(15);
		
		Assert.assertEquals("1", ret1);
		Assert.assertEquals("Fizz", ret2);
		Assert.assertEquals("Buzz", ret3);
		Assert.assertEquals("Buzz", ret4);
	}
	
	@Test
	public void testRetFizz() {
		String ret1 = fB.fizzBuss(3);
		String ret2 = fB.fizzBuss(12);
		String ret3 = fB.fizzBuss(15);
		String ret4 = fB.fizzBuss(21);
		
		Assert.assertEquals("Fizz", ret1);
		Assert.assertEquals("Fizz", ret2);
		Assert.assertEquals("Buzz", ret3);
		Assert.assertEquals("Fizz", ret4);
	}
	
	@Test
	public void testRetBuzz() {
		String ret1 = fB.fizzBuss(5);
		String ret2 = fB.fizzBuss(10);
		String ret3 = fB.fizzBuss(15);
		String ret4 = fB.fizzBuss(220);
		
		Assert.assertEquals("Buzz", ret1);
		Assert.assertEquals("Buzz", ret2);
		Assert.assertEquals("Buzz", ret3);
		Assert.assertEquals("Buzz", ret4);
	}	
}
