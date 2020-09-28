package com.techelevator.account;

public class Account {
	
	
	private String accountNumber;
	private double accountBalance;
	private String country;
	
	
	public void withdraw(double amount) {
		this.accountBalance -= amount;
	}
	
	public void deposit(double amount) {
		this.accountBalance += amount;
	}	
	
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String acctNum) {
		this.accountNumber = acctNum;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

	
	
	

}
