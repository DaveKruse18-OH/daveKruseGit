package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the length: ");
		float length = myScanner.nextFloat();
		myScanner.nextLine();	// Eat newline character at end of number line.
		System.out.println("Is the measurement in (m)eters, or (f)eet?");
		String mOrF = myScanner.nextLine().toUpperCase();
		//System.out.println("length: " + length);
		//System.out.println("mOrF: " + mOrF);
		
		float newLen = 0;
		if (mOrF.equals("M")) {
			// f = m * 3.2808399;
			newLen = length * 3.2808399F;
			System.out.println(length + "m" + " is " + newLen + "f");
		} else {
			// m = f * 0.3048
			newLen = length * 0.3048F;
			System.out.println(length + "f" + " is " + newLen + "m");
		}
		
		myScanner.close();
	}

}
