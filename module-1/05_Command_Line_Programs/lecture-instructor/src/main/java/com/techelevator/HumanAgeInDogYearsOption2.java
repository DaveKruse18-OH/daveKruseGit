package com.techelevator;

import java.util.Scanner;

public class HumanAgeInDogYearsOption2 {

	public static void main(String[] args) {
		
		
		Scanner keyboardInputScanner = new Scanner(System.in);
		
		System.out.println("How old are you human!");

		String ageAsString = keyboardInputScanner.nextLine();  // "7"  --> 7
		int age = Integer.parseInt(ageAsString);
		
		//example using Double
		double ageAsDouble = Double.parseDouble(ageAsString);
		System.out.println(ageAsDouble);
		
		//int  --> Integer
		//long --> Long
		
		System.out.println("You are " + (age * 7) + " in dog years.");
		
		
		System.out.println("What is your name!");
		String name = keyboardInputScanner.nextLine();
		
        System.out.println(name);
	}

}
