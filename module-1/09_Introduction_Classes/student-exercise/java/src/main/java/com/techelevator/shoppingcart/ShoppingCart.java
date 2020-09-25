package com.techelevator.shoppingcart;	

public class ShoppingCart {
	int totalNumberOfItems = 0;
	double totalAmountOwed = 0;
	
	public void ShoppingCart() {
		// Do nothing.
	}

	public double getAveragePricePerItem() {
		if (totalNumberOfItems == 0) {
			return 0.0d;
		} else {
			return totalAmountOwed / totalNumberOfItems;
		}
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = totalNumberOfItems + numberOfItems;
		totalAmountOwed = totalAmountOwed + (pricePerItem * numberOfItems);
	}
	
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0;
	}
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
}
