package com.techelevator;

public class BankAccount {
	private String accountHolderName = null;
	private String accountNumber = null;
	private int balance = 0;
	
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int deposit(int amountToDeposit) {
		return balance += amountToDeposit;
	}
	
	public int withdraw(int amountToWithdraw) {
		return balance -= amountToWithdraw;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
}
