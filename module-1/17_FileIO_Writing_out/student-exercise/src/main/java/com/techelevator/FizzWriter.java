package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		FizzWriter fizzWriter = new FizzWriter();
		fizzWriter.doFizzBuzzStuff();
	}
	
	private boolean doFizzBuzzStuff() {
		boolean ret = false;
		
		try {
			File myFile = new File("/users/student/Development/individual/davekruse-java-green-material/module-1/17_FileIO_Writing_out/student-exercise/",
								"FizzBuzz.txt");
			PrintWriter myWriter = new PrintWriter(myFile);
			//myWriter.println("test");
			for (int x = 1; x <= 300; x++) {
				if (((x % 3) == 0) && ((x % 5) == 0)) {
					myWriter.println("FizzBuzz");
				} else if ((x % 3) == 0) {
					myWriter.println("Fizz");
				} else if ((x % 5) == 0) {
					myWriter.println("Buzz");
				} else {
					myWriter.println(x);
				}
			}
			myWriter.close();
			ret = true;
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Unknown Error!");
			e.printStackTrace();
		}
		
		return ret;
	}

}
