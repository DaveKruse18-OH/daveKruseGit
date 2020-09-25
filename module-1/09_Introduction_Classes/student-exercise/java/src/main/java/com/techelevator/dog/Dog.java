package com.techelevator.dog;

public class Dog {
	boolean isSleeping = false;
	
	public void Dog () {
		// Do nothing.
	}

	public String makeSound() {
		if (isSleeping) {
			return ("Zzzzz...");
		} else {
			return ("Woof!");
		}
	}
	
	public void sleep() {
		isSleeping = true;
	}
	
	public void wakeUp() {
		isSleeping = false;
	}
	
	public boolean isSleeping() {
		return isSleeping;
	}
}
