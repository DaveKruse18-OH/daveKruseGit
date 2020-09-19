package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		// Please enter the Fibonacci number: 25
		System.out.println("Please enter the Fibonacci number: ");
		int num = myScanner.nextInt();
		myScanner.nextLine();	// Eat newline character at end of previous input line.
		//System.out.println("Fib num: " + num);

		int prevNum = 0;
		int curNum = 1;
		int fibNum = 1;
		
		if (num >= 1) {
			System.out.print(prevNum);
		}
		if (num >= 2) {
			System.out.print(", ");
			System.out.print(curNum);
		}
		
		while (fibNum <= num) {
			//if (x != 0) {
				System.out.print(", ");
			//}
			System.out.print(fibNum);
			
			prevNum = curNum;
			curNum = fibNum;
			fibNum = prevNum + curNum;
		}
		
		myScanner.close();
	}

}
