package com.techelevator;

public class Customer {
	
	public Customer() {
		this.isRewardsMemmber = false;
	}
	
	public Customer(boolean isRewardsMember) {
		this.isRewardsMemmber = isRewardsMember;
	}
	
	private long customerId;
	private String firstName;
	private String lastName;

	private String phoneNumber;
	private boolean isRewardsMemmber;
	private String emailAddress;
	
	public String getFullName() {
		return this.firstName +  " " + this.lastName;
	}
	
	//GETTERS AND SETTERS
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isRewardsMemmber() {
		return isRewardsMemmber;
	}
	public void setRewardsMemmber(boolean isRewardsMemmber) {
		this.isRewardsMemmber = isRewardsMemmber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	

}
