package com.techelevator.enginewithinheritance;

public class Engine {
	
	private int horsePower;
	private int size;
	private boolean isStarted;
	
	public boolean calculateEfficiency() {
		
		//calculate whether or not this engine is efficient
		
		return false;
	}
	
	public boolean startEngine() {
		isStarted = true;
		return true;
	}
	
	public boolean stopEngine() {
		return isStarted = false;
	}
	
	
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isStarted() {
		return isStarted;
	}

	
	
	

}
