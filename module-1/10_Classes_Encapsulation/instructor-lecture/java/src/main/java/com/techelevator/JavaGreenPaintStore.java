package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaGreenPaintStore {

	public static void main(String[] args) {

				
	   //creating an instance of this class, so I can call the getItems() method below	
       JavaGreenPaintStore app = new JavaGreenPaintStore();
       
       //Lets create an instance of our inventory class (we only need and should only ever have one of these)
		Inventory inventory = new Inventory();
		
		System.out.println("Please Enter The Producty Number(Sku) You Want To Retrieve? Hint: Try A123 or B223...");
		Scanner scanner = new Scanner(System.in);
		String sku = scanner.nextLine();
		
		Paint foundCan = inventory.retrieveItemBySku(sku);
		
		if (foundCan != null) {
			System.out.println("We found: " + foundCan.getSize() + "," + foundCan.getColor() + ", " + foundCan.getPrice() + " " + foundCan.getBrand() );
		}
		else {
			System.out.println("Product Not Found!");
		}

		
	}



	

}
