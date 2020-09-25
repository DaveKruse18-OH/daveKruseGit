package com.techelevator;

public class Paint {
	

	
	//declare member variables
	private String color;
	private String size;      //size is gallons, quarts, pint
    private boolean isExterior;
    private double price;
    private String brand;
    
    
    //constructor
    Paint(String brand, boolean isExterior, String color, String size) {
    	this.brand = brand;
    	this.isExterior = isExterior;
    	this.size = size;
    	
    	if (color == null) {
    		this.color = "base";
    	}
    	else {
    		this.color = color;
    	}
    	
    }   
    
    
    
    //public methods
    
    public void mixPaint (String newColor) {
    	color = newColor;

    }
    
    
    
    
    // GETTERS AND SETTERS
	public String getColor() {
		return color;
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
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}

	
	
	
	

}
