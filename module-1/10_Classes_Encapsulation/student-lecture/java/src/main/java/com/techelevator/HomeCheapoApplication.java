package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class HomeCheapoApplication {

	public static void main(String[] args) {
		// Sell paint
		
		
		//Declaring a paintCan object and setting initial values through the constructor
		Paint paintCan = new Paint("Olympic", true, "Green", "Gallon");
		//set the price
		paintCan.setPrice(19.99);
		
			
		Paint paintCan2 = new Paint("Behr", false, "base", "Quart");
		paintCan2.setPrice(29.99);
		
		
		List<Paint> listOfPaint = new ArrayList<Paint>();
		listOfPaint.add(paintCan);
		listOfPaint.add(paintCan2);
		
		for (Paint p : listOfPaint) {
			System.out.println(p.getSize() + "," + p.getColor() + ", " + p.getPrice() + " " + p.getBrand() );
		}		



		Customer name = new Customer();
		name.setFirstName("Steve");
		name.setLastName("C");
		
		Customer name2 = new Customer(true);
		name2.setFirstName("Matty");
		name2.setLastName("L");
		
		name.setRewardsMemmber(true);
		
		System.out.println(name.getFirstName());
		System.out.println(name.getLastName());
		
		System.out.println(name.getFullName());
		

		
	}

}
