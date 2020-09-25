package com.techelevator.person;

public class Person {
	String firstName = null;
	String lastName = null;
	int age = 0;
	
	public void Person() {
		// Do nothing.
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public boolean isAdult() {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
