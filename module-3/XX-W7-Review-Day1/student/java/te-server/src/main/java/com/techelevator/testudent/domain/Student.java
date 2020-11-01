package com.techelevator.testudent.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Student {
	
	private int id;
	
	@NotBlank(message = "The `firstName` field is required")
	private String firstName;
	
	@NotBlank(message = "The `lastName` field is required")
	private String lastName;
	
	@NotBlank(message = "The `cohort` field is required")
	private String cohort;
	
	@NotBlank(message = "The `section` field is required")
	private String section;
	
	//@Pattern(regexp="//\d{3}[-]\d{3}[-]\d{4}$")
	
	private String phone;
	
	@Email(message = "The `email` field is in an invalid format")
	@NotBlank(message = "The `email` field is required")
	private String email;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCohort() {
		return cohort;
	}
	public void setCohort(String cohort) {
		this.cohort = cohort;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

	
}
