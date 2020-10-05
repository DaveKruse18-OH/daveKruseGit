package com.techelevator.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicFileRead2 {

	public static void main(String[] args) {
		
		
		File myFile = new File("BasicFileRead2Dummy");
		
		List<Staff> staffMembers = new ArrayList<Staff>();
		
		try (Scanner scanner = new Scanner(myFile)){
			
			while (scanner.hasNextLine()) {
				
			
				String line = scanner.nextLine();
				System.out.println("Reading in data: " + line);
				
				//split into an array of fields
				String[] dataArray = line.split(","); 
				
				//populate a staff object with the fields
				Staff member = new Staff(dataArray[0], Integer.parseInt(dataArray[1]), dataArray[2]);
				
				
				staffMembers.add(member);
				
				
				
				
			}
			
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		

	}

}
