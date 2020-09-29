package com.techelevator.paint;

public class Paint {

	// declaing member variables
	private String sku;
	private String color;
	private String size; // size is gallons, quarts, pint
	private boolean isExterior;
	private double price;
	private String brand;
	private int quantity;

	/*
	 * This is a constructor. The reason I am initialize these values is because 
	 * we know these things (or need these things) when the can of paint was created. 
	 * So we are initializing the object at creation time.
	 */
	Paint(String sku, String brand, boolean isExterior, String color, String size) {
		this.sku = sku;
		this.brand = brand;
		this.isExterior = isExterior;
		this.size = size;

		if (color == null) {
			this.color = "base";
		} else {
			this.color = color;
		}

	}

	//PUBLIC METHODS

	public void mixPaint(String newColor) {
		color = newColor;

	}

	// GETTERS - These return the data that we want to expose outside this class

	public String getColor() {
		return color;
	}

	public String getSku() {
		return sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getSize() {
		return size;
	}

	public boolean isExterior() {
		return isExterior;
	}

	public double getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	

    // SETTERS - These 'set' new values. Since we do not want other member variables to change after 
	// creation, we are not exposing setters for variables other than those listed below.
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

}
