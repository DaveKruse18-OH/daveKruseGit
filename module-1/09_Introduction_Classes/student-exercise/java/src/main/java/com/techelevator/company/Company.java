package com.techelevator.company;

public class Company {
	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	// Constructor.
	public Company() {
		// Do nothing.
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompanySize() {
		String ret = null;
		if (numberOfEmployees <= 50) {
			ret  = "small";
		} else if ((numberOfEmployees >= 51) && (numberOfEmployees <= 250)) {
			ret = "medium";
		} else {
			ret = "large";
		}
		return ret;
	}
	
	public double getProfit() {
		return revenue - expenses;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public double getRevenue() {
		return revenue;
	}
	
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	public double getExpenses() {
		return expenses;
	}
	
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
}
