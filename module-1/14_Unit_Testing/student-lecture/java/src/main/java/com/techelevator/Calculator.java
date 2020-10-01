package com.techelevator;

public class Calculator {
	
	public Calculator() {
		
	}
	
	//add b and a together 
	public int add (int a, int b) {
		return a + b;
	}
	
	// just an example of using objects (for sake of unit testing)
	public Result add (WrappedNumbers nums) {
		return new Result(nums.getNumber1() + nums.getNumber2());
	}
	
	//multiple a x b
	public int multiply(int a, int b) {
		return a * b;
	}	
	
	//subtract b from a
	public int subtract(int a, int b) {
		return a - b;
	}
	
	//simple method to see if a is greater than b
	public boolean isAGreaterThanB(int a, int b) {
		return  (a>b) ?  true : false;
	}
	
	//simple method to see if a is less than b
	public boolean isALessThanB(int a, int b) {
		return  (a<b) ?  true : false;
	}
	
	public String fizzBuzz (int num) {
		

		if (num % 3 == 0 && num % 5 == 0) {
			return "fizzbuzz";
		}
		else if (num % 3 == 0) {
			return "fizz";
		}
		else if (num % 5 == 0) {
			return "buzz";
		}
		else {
			return new Integer(num).toString();
		}
		
	}
	
	public String returnNull () {
		return null;
	}
	
	public int addArray(int[] nums) {
		
		//for loop to add these together
		return 0;
	}
	
	
	public int[] testArraysEqual123() {
		return new int[] {1,2,3};
	}
	
	public boolean isEvenNumber(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	
 	

}
