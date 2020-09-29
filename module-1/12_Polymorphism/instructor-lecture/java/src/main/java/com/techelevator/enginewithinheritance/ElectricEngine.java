package com.techelevator.enginewithinheritance;

public class ElectricEngine extends Engine {
	
	public boolean startEngine() {
		System.out.println("Push a button and magic happens!");
		return super.startEngine();
		
	}

}
