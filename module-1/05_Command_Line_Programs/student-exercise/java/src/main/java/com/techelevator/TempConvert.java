package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the temperature: ");
		float temp = myScanner.nextFloat();
		myScanner.nextLine();	// Eat newline character at end of number line.
		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String cOrF = myScanner.nextLine().toUpperCase();
		//System.out.println("temp: " + temp);
		//System.out.println("cOrF: " + cOrF);
		
		float newTemp = 0;
		if (cOrF.equals("C")) {
			// Tf = Tc * 1.8 + 32
			newTemp = temp * 1.8F + 32F;
			System.out.println(temp + "C" + " is " + newTemp + "F");
		} else {
			// Tc = (Tf - 32) / 1.8
			newTemp = (temp - 32F) / 1.8F;
			System.out.println(temp + "F" + " is " + newTemp + "C");
		}
		
		myScanner.close();
	}

}
