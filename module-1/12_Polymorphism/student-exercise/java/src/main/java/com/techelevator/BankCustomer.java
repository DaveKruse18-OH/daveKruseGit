package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
	private String name = null;
	private String address = null;
	private String phoneNumber = null;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	private int balanceOfAllAccounts = 0;
	
	@Override
	public int getBalance() {
		for (int x = 0; x < accounts.size(); x++) {
			Accountable tempAcct = accounts.get(x);
			balanceOfAllAccounts += tempAcct.getBalance();
		}
		
		return balanceOfAllAccounts;
	}
	
	public boolean isVip() {
		boolean ret = false;
		this.getBalance();
		if (balanceOfAllAccounts >= 25000) {
			ret = true;
		} else {
			ret = false;
		}
		
		return ret;
	}
	
	public void addAccount(Accountable newAccount) {
		accounts.add(newAccount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//public List<Accountable> getAccounts() {
	public Accountable[] getAccounts() {
		Accountable[] ret = new Accountable[accounts.size()];
		for (int x = 0; x < accounts.size(); x++) {
			ret[x] = accounts.get(x);
		}
		return ret;
	}

}
