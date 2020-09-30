package com.techelevator.home;

import java.math.BigDecimal;

public class MultiFamilyHome extends Home {

	public MultiFamilyHome(Address address, int squareFeet, double numberOfBathrooms, int numberOfBedrooms,
			BigDecimal price) {
		super(address, squareFeet, numberOfBathrooms, numberOfBedrooms, price);

	}

	@Override
	public BigDecimal calculateAnnualPropertyTaxes() {
		// TODO Auto-generated method stub
		return null;
	}


}
