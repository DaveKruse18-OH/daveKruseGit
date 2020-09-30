package com.techelevator.home;

import java.math.BigDecimal;

public abstract class Home implements Saleable {
	
	private int squareFeet;
	private Address address;
	private double numberOfBathrooms;
	private int numberOfBedrooms;
	private BigDecimal price;
	
	
	//constructor
	public Home (Address address, int squareFeet, double numberOfBathrooms, int numberOfBedrooms, BigDecimal price) {
		this.address = address;
		this.numberOfBathrooms = numberOfBathrooms;
		this.numberOfBedrooms = numberOfBedrooms;
		this.squareFeet = squareFeet;
		this.price = price;
	}
	
	/**
	 * Subclass must implement this method to calculate your specific property tax
	 * @return
	 */
	public abstract BigDecimal calculateAnnualPropertyTaxes();
	
	public final void doSomethingHouseRelated() {
		System.out.println("Doing Something!");
	}

	
	
	public int getSquareFeet() {
		return squareFeet;
	}

	public Address getAddress() {
		return address;
	}


	public double getNumberOfBathrooms() {
		return numberOfBathrooms;
	}


	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}


	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	@Override
	public String listSpecs() {
		// TODO Auto-generated method stub
		return "SPECS: NumberOfBathrooms - " + this.numberOfBathrooms + "\n" + "SquareFeet: " + this.squareFeet;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
