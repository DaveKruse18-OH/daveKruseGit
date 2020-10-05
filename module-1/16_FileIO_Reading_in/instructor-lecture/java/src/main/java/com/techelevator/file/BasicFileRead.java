package com.techelevator.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 * This is a basic example... NOrmally we would loop through until end of file is reached...
 * @author scarmichael
 *
 */

public class BasicFileRead {

	public static void main(String[] args) {
		
		File dummyFile = new File("Dummy.txt");
	
		//Scanner userScanner = new Scanner(System.in);   // read from keyboard
		
		
		try (Scanner fileScanner = new Scanner(dummyFile)){    // try with resource

			String firstLine = fileScanner.nextLine();
			
			String[] fields = firstLine.split(" ");
			for (String field : fields) {
				System.out.println(field);
			}
			
			
			System.out.println(firstLine);
			
			String secondLine = fileScanner.nextLine();
			System.out.println(secondLine);
		
			
			System.out.println(dummyFile.getAbsolutePath());
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {

		
		
		
		}
		

	}

}
