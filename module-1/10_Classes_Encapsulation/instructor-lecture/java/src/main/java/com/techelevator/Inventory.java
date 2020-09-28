package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	//MEMBER VARIABLES (aka Properties, Instance variables, etc)
	private Map<String, Paint> inventoryMap = new HashMap<String, Paint>();

	/* 
	 * CONSTRUCTOR
	 * We want to load the initial inventory only ONCE. A good place to do this is
	 * when the inventory object is created. Thus, I am calling the load method
	 * below. We 'could' have put the code here, but I want to make use of some
	 * private methods so my code is clean and compact.
	 */
	public Inventory() {
		loadInitialInventory();
	}
	
	

	//PUBLIC METHODS

	/**
	 * 
	 * @param newItem - Represents the new paint item being added
	 */
	public void addItemToInventory(Paint newItem) {

		inventoryMap.put(newItem.getSku(), newItem);

	}

	/**
	 * 
	 * @param skuToRemove - Product sku (this is the key to the map)
	 */
	public void removeItemFromInventory(String skuToRemove) {

		inventoryMap.remove(skuToRemove);

	}

	/**
	 * 
	 * @param sku
	 * @return Paint or null if not found
	 * 
	 */
	public Paint retrieveItemBySku(String sku) {

		return inventoryMap.get(sku);

	}

	// TODO: search for an item
	

	// TODO: update item

	// TODO: update quantity on an item
	
	
	// PRIVATE METHODS

	/**
	 * load the initial inventory - For now we will hard code... Later we may want
	// to read in from database or file... This is only called ONCE via the constructor
	 */
	private void loadInitialInventory() {

		Paint paintCan = new Paint("A123", "Olympic", true, "Green", "Gallon");
		// set the initial price
		paintCan.setPrice(19.99);
		inventoryMap.put(paintCan.getSku(), paintCan);

		Paint paintCan2 = new Paint("B223", "Behr", false, "base", "Quart");
		paintCan2.setPrice(29.99);
		inventoryMap.put(paintCan2.getSku(), paintCan2);

	}

}
