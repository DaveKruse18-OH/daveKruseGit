package com.techelevator.home;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JGRealty {

	public static void main(String[] args) {
		

		
		
		
		

	    //create a single family home 
//		Address homeAddress = new Address();
//		homeAddress.setCity("Columbus");
//		homeAddress.setState("Ohio");
//		homeAddress.setStreetName("Java Lane");
//		homeAddress.setStreetNumber("123");
//		homeAddress.setZip("43201");
//		
//		Home genericHome = new Home(homeAddress, 1000, 2.0, 3, new BigDecimal(100000));
//		
//
//		
//		

		
	    //create a single family home 
		Address sfAddress = new Address();
		sfAddress.setCity("Columbus");
		sfAddress.setState("Ohio");
		sfAddress.setStreetName("Java Lane");
		sfAddress.setStreetNumber("123");
		sfAddress.setZip("43201");
		
		sfAddress.streetName = "ABC";
		
		System.out.println(sfAddress.toString());
	
		
		SingleFamilyHome sfHome = new SingleFamilyHome(sfAddress, 1000, 2.0, 3, new BigDecimal(100000));
		
		
	    //create a multifamily home 
		Address mfAddress = new Address();
		mfAddress.setCity("Lewis Center");
		mfAddress.setState("Ohio");
		mfAddress.setStreetName("Matty Lane");
		mfAddress.setStreetNumber("100");
		mfAddress.setZip("43035");
		
		MultiFamilyHome mfHome = new MultiFamilyHome(mfAddress, 6000, 8.0, 5, new BigDecimal(400000));
		
		
		if (sfAddress.equals(mfAddress)) {
			//these two addresses are equal
		}
		
	    //create  rental home 
		Address rhAddress = new Address();
		rhAddress.setCity("Lewis Center");
		rhAddress.setState("Ohio");
		rhAddress.setStreetName("Matty Lane");
		rhAddress.setStreetNumber("100");
		rhAddress.setZip("43035");
		
		RentalHome rHome = new RentalHome(rhAddress, 2000, 2.0, 4, new BigDecimal(200000), 12);
		
		
		List<Home> homesForSale = new ArrayList<Home> ();
		
		homesForSale.add(sfHome);
		homesForSale.add(mfHome);
		homesForSale.add(rHome);
		
		for (Home home : homesForSale) {
			System.out.println(home.listSpecs());
			BigDecimal propertyTaxes = home.calculateAnnualPropertyTaxes();
		}
		
		
		
		
		
	}

}
