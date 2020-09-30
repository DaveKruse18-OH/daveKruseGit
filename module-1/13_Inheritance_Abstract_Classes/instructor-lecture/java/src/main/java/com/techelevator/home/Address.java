package com.techelevator.home;

public class Address {
	
	String streetName;
	private String streetNumber;
	private String city;
	private String state;
	private String zip;
	
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

	
	public String toString() {
		return "Address: " + "\n" +
	        this.streetNumber + " \n" +
			this.streetName + " \n" +
	        this.city;
	}
	
	public boolean equals (Address addressToCheck) {
		
		
		//missing logot to compare each field
		this.city = addressToCheck.city;
		return true;
	}


}
