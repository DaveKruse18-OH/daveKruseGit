package com.techelevator.inventory;

public class InventoryItem {

	private String itemCode;
	private String description;
	private int quantity;
	private double price;


	InventoryItem(String itemCode, String description, int quantity, double price) {
		this.itemCode = itemCode;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
