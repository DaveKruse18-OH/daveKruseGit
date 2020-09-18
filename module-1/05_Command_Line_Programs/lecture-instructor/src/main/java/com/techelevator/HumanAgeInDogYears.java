package com.techelevator;

import java.util.Scanner;

public class HumanAgeInDogYears {

	public static void main(String[] args) {
		
		
		Scanner keyboardInputScanner = new Scanner(System.in);
		
		System.out.println("How old are you human!");
		
		int age = keyboardInputScanner.nextInt();
		keyboardInputScanner.nextLine();
		
		System.out.println("You are " + (age * 7) + " in dog years.");
		
		
		System.out.println("What is your name!");
		String name = keyboardInputScanner.nextLine();
		
        System.out.println(name);
	}

}
