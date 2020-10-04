package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuss(int num) {
		if ((num % 3) == 0) {
			return "Fizz";
		} else {
			return String.valueOf(num);
		}
	}

}
