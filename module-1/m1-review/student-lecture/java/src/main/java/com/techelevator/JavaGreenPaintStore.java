package com.techelevator;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.inventory.Inventory;
import com.techelevator.inventory.InventoryItem;

public class JavaGreenPaintStore {
	
	private UserInterface ui;
	private Inventory inventory;
	
	private final String VIEW_ALL_ITEMS = "1";
	private final String EXIT_PROGRAM = "4";
	
	
	public JavaGreenPaintStore () {
		ui = new UserInterface();
		
		
		inventory = new Inventory();
	}
	
	
    /**
     * The main method is the entry into our program.  This method has one function.... 
     * Create an instance of this class and use it to call the run method. No other logic 
     * should be here.
     * @param args
     */
	public static void main(String[] args) {

				
	   //creating an instance of this class, so I can call the run method below	
       JavaGreenPaintStore app = new JavaGreenPaintStore();
       app.run();
		
	}
	
	/**
	 * This method is the main loop that keeps the program active and displays the menus,  takes the 
	 * user's response (from the UserInterface class) and the calls handler methods to 
	 * do the work (like calling the other classes - Inventory, InventoryLoader, Report Generator, etc
	 */
	
	private void run() {
	

		boolean finished = false;

		// this is where we will print the main menu. We will use a loop to keep the user on this menu
		// unless the user enters "3. Update Inventory" or "4. Exit".   If the enter "3. Update Inventory"
		// we should call the updateInventorySubMenuHandler

		while (!finished) {
			String response = ui.printMainMenu();	
			
			if (response.equals(VIEW_ALL_ITEMS)) {
				//view all items
				List<InventoryItem> list = inventory.retrieveInventoryItems();
				ui.printItems(list);
			}
			else if (response.equals("2")) {
				//ask the user for an item code
				String itemCode = ui.askUserForItemCode();
				InventoryItem foundItem = inventory.retrieveItemByItemCode(itemCode);
				ui.printItemAndPriceInfo(foundItem);
			}
			else if (response.equals("3")) {
				//manage inventory  - call sub menu
				System.out.println("Manage inventory");
				manageInventorySubMenuHandler();
			}
			else if (response.equals(EXIT_PROGRAM)) {
				break;
			}
			else {
				System.out.println("Invalid Choice! Please try again ");
			}
			
		}

		System.out.println("Goodbye!");
		System.exit(1);
	}
	
	
	/**
	 * This method handles calling the sub menu.  It has it's own loop which will keep the user 
	 * on this menu until they choose to return to previous menu
	 */
	private void manageInventorySubMenuHandler() {
		

		boolean finished = false;

		while (!finished) {
			
			String response = ui.printInventorySubMenu();

			if (response.equals("1")) {
				//add item to inventory
			} 
			else if (response.equals("2")) {
				//remove item
			} 			
			else if (response.equals("3")) {
				finished = true;
			} 
			else {
				System.out.println("Invalid Choice: " + response);
			}
		}	
	}



}
