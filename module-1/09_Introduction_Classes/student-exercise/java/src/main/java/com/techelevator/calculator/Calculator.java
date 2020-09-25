package com.techelevator.calculator;

public class Calculator {
	int result = 0;
	
	public void Calculator() {
		// Do nothing.
	}

	public int add(int addend) {
		result = result + addend;
		return result;
	}
	
	public int multiply(int multiplier) {
		result = result * multiplier;
		return result;
	}
	
	public int power(int exponent) {
		if (exponent < 0) {
			result =  Math.abs(result^exponent);
		} else {
			result = (int) Math.pow((int) result, (int) exponent);
		}
		return result;
	}
	
	public void reset() {
		result = 0;
	}
	
	public int subtract(int subtrahand) {
		result = result - subtrahand;
		return result;
	}
	
	public int getResult() {
		return result;
	}
	
}
