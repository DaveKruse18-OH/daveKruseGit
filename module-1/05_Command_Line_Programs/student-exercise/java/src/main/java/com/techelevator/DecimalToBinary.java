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
			int divisor = 2;
			System.out.println("nums: " + nums[x]);
			int intNum = Integer.parseInt(nums[x]);
			
			while (intNum > 0) {
				int rem = 0;
				rem = intNum % divisor;
				
				// Special case to get started (divisor = 2, num = 0, 1, 2, or 3).
				if (divisor == 2) {
					if (rem == 0) {
						answer = "10";
						intNum -= divisor;
						divisor = divisor * 2;
					} else { // Odd number.
						int temp = (intNum - 1) / divisor;
						if (temp == 1) {
							answer = "11";
							intNum -= 3;
							divisor = divisor * 2;
						} else {
							answer = "1";
							intNum -= 1;
							divisor = divisor * 2;
						}
					}
				}
				// End special case.
				
				
				//if (rem == 0) {
				//	answer = "1" + answer;
				//	intNum -= divisor;
				//	divisor = divisor * 2;
				//}
			}
			
			System.out.println("divisor: " + divisor);
		}

		System.out.println("answer: " + answer);
	}

}
