package com.techelevator;


import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
//import junit.framework.Assert;   //don't use this one, it is deprocated
import org.junit.Assert;           // use the newer one
import org.junit.Before;
import org.junit.BeforeClass;

public class CalculatorTest {
	
	Calculator calc;
	
	
	
	@BeforeClass
	public static void setUpOnce () {
		System.out.println("As the class loads for the first time");
	}
	
	@AfterClass
	public static void allDone () {
		System.out.println("Unloading the class");
	}
	
	
	@Before
	public void setUp () {
		calc = new Calculator();
		System.out.println("Before");
	}
	
	@After
	public void tearDown () {
		
		System.out.println("After");
	}
	
	
	@Test
	public void testCalculatorIsIntantiated() {
		
		Assert.assertNotNull(calc);	
		System.out.println("testCalculatorIsIntantiated");

	}
	
	
	@Test
	public void testAddWithWrappedNumbers() {
		
		WrappedNumbers num = new WrappedNumbers(2,3);
		WrappedNumbers num2 = new WrappedNumbers(5,3);
		
		Result result = calc.add(num);
		Result result2 = calc.add(num2);
		
		Assert.assertEquals(5, result.getResult());
		Assert.assertEquals(8, result2.getResult());
		
	}
	

	@Test
	public void testSimpleAddingOfIntegers() {

		
		//Assert
		Assert.assertEquals(4, calc.add(2, 2));
		Assert.assertEquals(0, calc.add(-2, 2));
		Assert.assertEquals(-4, calc.add(-2, -2));
		Assert.assertEquals(0, calc.add(0, 0));
		System.out.println("testSimpleAddingOfIntegers");
		
	}
	
	@Test
	public void testFizzBuzz() {
		
		
		//test all divisible by 3
		Assert.assertEquals("fizz", calc.fizzBuzz(3));
		Assert.assertEquals("fizz", calc.fizzBuzz(9));
		
		//divisible by 5
		Assert.assertEquals("buzz", calc.fizzBuzz(5));
		Assert.assertEquals("buzz", calc.fizzBuzz(25));
		
		//divisible by 3 and 5
		Assert.assertEquals("fizzbuzz", calc.fizzBuzz(15));
		Assert.assertEquals("fizzbuzz", calc.fizzBuzz(30));
		
		//other
		Assert.assertEquals("7", calc.fizzBuzz(7));
		Assert.assertEquals("0", calc.fizzBuzz(0));
		
		if (true) {
		 // Assert.fail();
		}  
		
		
		System.out.println("testFizzBuzz");
	}

}
