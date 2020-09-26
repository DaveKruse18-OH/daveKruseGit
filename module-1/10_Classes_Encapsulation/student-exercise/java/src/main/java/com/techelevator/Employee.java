package com.techelevator;

public class Employee {
	private int employeeId = 0;
	private String firstName = null;
	private String lastName = null;
	private String fullName = null;
	private String department = null;
	private double annualSalary = 0;
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		annualSalary = salary;
		fullName = lastName + ", " + firstName;
	}
	
	public void raiseSalary(double percent) {
		double raiseAmount = annualSalary * (percent / 100);
		annualSalary = annualSalary + raiseAmount;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getFullName() {
		fullName = lastName + ", " + firstName;
		return fullName;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
}
