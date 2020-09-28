package com.techelevator;

public class Shoe {
	
	private boolean hasLaces;
	private String soleType;
	private double size;
	private double price;
	
	public Shoe (double size, double price) {
		this.size = size;
		this.price = price;
	}
	
	public Shoe() {
		//do something
	}
	
	
	public String walk() {
		System.out.println("walking.... in the parent class");
		return "walking in the parent class";
	}
	
	
	public boolean isHasLaces() {
		return hasLaces;
	}
	public void setHasLaces(boolean hasLaces) {
		this.hasLaces = hasLaces;
	}
	public String getSoleType() {
		return soleType;
	}
	public void setSoleType(String soleType) {
		this.soleType = soleType;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
