package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuss(int num) {
		if ((num < 1) || (num > 100)) {
			return "";
		}
		
		if (((num % 3) == 0) && ((num % 5) == 0)) {
			return "FizzBuzz";
		}
		
		if ((num % 5) == 0)  {
			return "Buzz";
		}
		
		if ((num % 3) == 0) {
			return "Fizz";
		}
		
		return String.valueOf(num);
	}

}
