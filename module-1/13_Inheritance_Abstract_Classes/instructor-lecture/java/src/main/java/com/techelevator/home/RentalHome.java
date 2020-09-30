package com.techelevator.home;

import java.math.BigDecimal;

public class RentalHome extends Home {

	private int leaseDurationInMonths;

	public RentalHome(Address address, int squareFeet, double numberOfBathrooms, int numberOfBedrooms, BigDecimal price,
			int leaseDurationInMonths) {

		super(address, squareFeet, numberOfBathrooms, numberOfBedrooms, price);
		this.leaseDurationInMonths = leaseDurationInMonths;

	}

	public int getLeaseDurationInMonths() {
		return leaseDurationInMonths;
	}

	public void setLeaseDurationInMonths(int leaseDurationInMonths) {
		this.leaseDurationInMonths = leaseDurationInMonths;
	}
	
	public String listSpecs() {
		// TODO Auto-generated method stub
		return super.listSpecs() + " , LeaseDuration(Months)" + leaseDurationInMonths;
	
	}

	@Override
	public BigDecimal calculateAnnualPropertyTaxes() {
		// TODO Auto-generated method stub
		return null;
	}

}
