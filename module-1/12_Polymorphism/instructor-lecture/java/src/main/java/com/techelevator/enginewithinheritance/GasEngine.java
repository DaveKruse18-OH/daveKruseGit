package com.techelevator.enginewithinheritance;

public class GasEngine extends Engine {
	
	public boolean startEngine() {
		System.out.println("Turn key!");
		return super.startEngine();
		
	}

}
