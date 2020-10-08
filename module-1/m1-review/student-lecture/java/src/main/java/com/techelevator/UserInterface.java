package com.techelevator;

import java.util.List;
import java.util.Scanner;

import com.techelevator.inventory.InventoryItem;


/**
 * The purpose of this class to print menus, sub menus and any user messages. You should also collect 
 * user responses here. 
 * 
 * You should NOT implement business functionality here like working with the inventory, loading files, etc. 
 * 
 * @author Java Green Class
 *
 */

public class UserInterface {

	// Create Scanner object to capture user input and return choice
	// This is the ONLY place we should create a user console scanner... Why?
	private Scanner scanner = new Scanner(System.in);

    /**
     * This method prints the main menu AND returns the user's choice. This method is called from the 
     * application's run() method.
     * 
     * @return the user's choice
     */
	public String printMainMenu() {

		// Add code that lists our main menu options
		System.out.println("************** JG Inventory 3000 ****************\n" );
		System.out.println("1. View all items");
		System.out.println("2. Do a price check");
		System.out.println("3. Manage inventory");
		System.out.println("4. Exit program");
		
       
		return scanner.nextLine();

	}

    /**
     * This method prints the inventory sub-menu AND returns the user's choice. This menu 
     * will show if the user chooses '3. Manage inventory' in main menu above
     * 
     * @return the user's choice
     */
	public String printInventorySubMenu() {

		// Add code that lists our main menu options
		System.out.println("************** Manage Inventory ****************\n" );
		System.out.println("What would you like to do today?\n");
		System.out.println("1. Add a new item to existing inventory");
		System.out.println("2. Remove an item from the inventory ");
		System.out.println("3. Return to Previous Menu");
		
       
		return scanner.nextLine();

	}
	
	public void printItems(List<InventoryItem> list) {
		
		for (InventoryItem i : list) {
			System.out.println (i.getItemCode() + i.getDescription() + i.getPrice() + i.getQuantity());
		}
		
	}
	
	public String askUserForItemCode() {
		System.out.println("What item would you like the price for?\n");
		return scanner.nextLine();
	}
	
	public void printItemAndPriceInfo(InventoryItem item) {
		if (item != null) {
		    System.out.println (item.getItemCode() + item.getDescription() + item.getPrice() + item.getQuantity());
		}
		else {
			System.out.println("Item Not Found!");
		}
	}
	
	

}
