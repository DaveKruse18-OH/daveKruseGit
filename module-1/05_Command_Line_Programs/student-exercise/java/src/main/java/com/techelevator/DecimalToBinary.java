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
			//System.out.println("nums: " + nums[x]);
			int intNum = Integer.parseInt(nums[x]);
			
			if (intNum > 0) {	// Don't calculate binary code for 0 or negative numbers.
				// Start - find starting divisor (largest).
				boolean divFound = false;
				int quotient = 0;
				while (!divFound) {
					quotient = intNum / divisor;
					if (quotient == 1) {
						divFound = true;
					} else {
						divisor = divisor * 2;
					}
				}
				//System.out.println("Starting divisor: " + divisor);
				// End - find starting divisor.
				
				// Now find the answer, from the starting (largest) divisor.
				boolean answerFound = false;
				while (!answerFound) {
					if (divisor == 1) {
						answerFound = true;
					}
					quotient = 0;
					quotient = intNum / divisor;
					if (quotient == 1) {
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
			if (answer == null) {
				answer = "0";
			}
			//460 in binary is 111001100
			System.out.println(nums[x] + " in binary is " + answer);
			answer = null;
		}
	}

}
