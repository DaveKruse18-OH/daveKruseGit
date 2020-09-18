package com.techelevator;

import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		
		// Create a scanner
		Scanner myScanner = new Scanner(System.in);
	
		
		boolean notThere = true;
		
		while (notThere) {
			
			
			System.out.println("Are we there yet? Enter (Y)es or (N)o");
			
			String answer = myScanner.nextLine();
			
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) { 		
				System.out.println("Cowabunga!");
				notThere = false;
			}
			else {
				System.out.println("Eat my shorts!");
			}			
			
			
		}
		

		
		System.out.println("We are there!");
		

	}

}
