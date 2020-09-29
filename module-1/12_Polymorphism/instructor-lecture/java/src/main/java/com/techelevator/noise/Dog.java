package com.techelevator.noise;

public class Dog implements INoise {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String makeNoise(boolean isStrangerPresent) {
		return "Barking really loud at strangers!";
	}

	
	public String makeNoise() {
		return "Bark";
	}
	
	

}
