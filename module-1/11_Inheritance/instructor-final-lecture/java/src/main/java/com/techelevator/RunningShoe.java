package com.techelevator;

public class RunningShoe extends Shoe {

	public RunningShoe(double size, double price) {
		super(size, price);
		
	}
	
	public RunningShoe() {
		super();
	}

	
	public String walk() {
		System.out.println("run in my running shoe class");
		super.walk()
;		return "walking.... faster in my running shoe class";
	}
	
}
