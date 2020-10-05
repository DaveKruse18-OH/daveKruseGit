package com.techelevator.file;

public class Staff {
	
	private String firstName;
	private int id;
	private String misc;
	
	public Staff (String firstName, int id, String misc) {
		this.firstName = firstName;
		this.id = id;
		this.misc = misc;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMisc() {
		return misc;
	}
	public void setMisc(String misc) {
		this.misc = misc;
	}
	
	
	

}
