package com.techelevator.inventory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techelevator.auditreport.ReportExistsException;
import com.techelevator.auditreport.ReportFileWriter;

public class Inventory {
	
	private InventoryLoader loader;
	private ReportFileWriter auditLog;


	private Map<String, InventoryItem> inventoryMap;

	/* 
	 * 
	 */
	public Inventory() {
		loader = new InventoryLoader();
		try {
			auditLog = new ReportFileWriter("AuditLogDir", "auditLog.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ReportExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		inventoryMap = loader.loadInventoryFromFile("inventory.txt");
	}
	
	

	//PUBLIC METHODS

	public void addItemToInventory(InventoryItem newItem) {

		inventoryMap.put(newItem.getItemCode(), newItem);
	}


	public void removeItemFromInventory(String itemCodeToRemove) {

		inventoryMap.remove(itemCodeToRemove);
		auditLog.writeLine("Removed an Item From Inventory: " + itemCodeToRemove);

	}
	
	//TODO: Return a list of inventory items
    public List<InventoryItem> retrieveInventoryItems() {
    	
    	List<InventoryItem> list = new ArrayList<InventoryItem> ();
    	
    	Set<String> keys = inventoryMap.keySet();
    	for (String key : keys) {
    		list.add(inventoryMap.get(key));
    	}
    	
    	return list;
    	
    }
    
    
    //method --> find the item
    public InventoryItem retrieveItemByItemCode (String itemCode) {
    	return inventoryMap.get(itemCode);
    }


}
