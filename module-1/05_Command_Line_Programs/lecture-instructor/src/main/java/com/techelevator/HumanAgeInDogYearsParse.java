package com.techelevator;

import java.util.Scanner;

public class HumanAgeInDogYearsParse {

	public static void main(String[] args) {
		
		
		Scanner keyboardInputScanner = new Scanner(System.in);
		
		System.out.println("Enter a series of human ages (separated by commas)");

		String seriesOfNumbers = keyboardInputScanner.nextLine();

        String[] ages = seriesOfNumbers.split(",");
				
		for (int i=0; i<ages.length; i++) {
			
			int age = Integer.parseInt(ages[i]);
		    System.out.println("You are " + ( age * 7) + " in dog years.");
		    
		    
		}
				
				
	
		
	}

}
