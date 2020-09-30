package com.techelevator.home;

import java.math.BigDecimal;

public class SingleFamilyHome extends Home{

	public SingleFamilyHome(Address address, int squareFeet, double numberOfBathrooms, int numberOfBedrooms,
			BigDecimal price) {
		super(address, squareFeet, numberOfBathrooms, numberOfBedrooms, price);

	}


	public BigDecimal calculateAnnualPropertyTaxes() {
		return new BigDecimal(2000);
	}

}
