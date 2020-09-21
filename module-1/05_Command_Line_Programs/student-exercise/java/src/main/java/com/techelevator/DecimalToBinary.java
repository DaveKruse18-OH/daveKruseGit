package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String inputNums = myScanner.nextLine();
		String[] nums = inputNums.split(" ");
		
		String answer = null;
		for (int x = 0; x < nums.length; x++) {
			int divisor = 1;
			System.out.println("nums: " + nums[x]);
			int intNum = Integer.parseInt(nums[x]);
			
			if (intNum > 0) {
				// Start - find starting divisor (largest).
				boolean divFound = false;
				int whole = 0;
				while (!divFound) {
					whole = intNum / divisor;
					if (whole == 1) {
						divFound = true;
					} else {
						divisor = divisor * 2;
					}
				}
				System.out.println("Starting divisor: " + divisor);
				// End - find starting divisor.
				
				// Now find the answer, from the starting divisor.
				boolean answerFound = false;
				while (!answerFound) {
					if (divisor == 1) {
						answerFound = true;
					}
					//int rem = 0;
					whole = 0;
					//rem = intNum % divisor;
					whole = intNum / divisor;
					if (whole == 1) {
						if (answer == null) {
							answer = "1";
						} else {
							answer = answer + "1";
						}
						intNum = intNum - divisor;
						divisor = divisor / 2;
					} else {
						if (answer == null) {
							answer = "0";
						} else {
							answer = answer + "0";
						}
						//intNum = intNum - divisor;
						divisor = divisor / 2;
					}
					
				}
			} // End if (intNum > 0).
		}

		System.out.println("answer: " + answer);
	}

}
