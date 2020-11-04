package com.techelevator.view;


import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import com.techelevator.testudent.models.AuthenticatedUser;
import com.techelevator.testudent.models.Student;

public class ConsoleService {

	private PrintWriter out;
	private Scanner in;

	public ConsoleService(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output, true);
		this.in = new Scanner(input);
	}
	
	public String printLoginMenu() {
		
		System.out.println("**********************************************");
		System.out.println("*   Welcome to the Tech Elevator Student App *");
		System.out.println("**********************************************");
		System.out.println("\n");
		System.out.println("Please select from the following choices to get started:\n");
		System.out.println("1.  Login");
		System.out.println("2.  Register a new user");
		
		return in.nextLine();
	
	}
	
	public String printMainMenu(AuthenticatedUser currentUser) {
		
		System.out.println("**********************************************************");
		if (currentUser == null) {
		    System.out.println("*        Welcome to the Tech Elevator Student App        *");
		}
		else {
			System.out.println("*     Welcome " + currentUser.getUser().getUsername() + " to the Tech Elevator Student App      *");
		}
		System.out.println("**********************************************************");
		System.out.println("\n");
		System.out.println("Please select from the following choices to get started:\n");
		System.out.println("1.  Retrieve list of students");
		System.out.println("2.  Retrieve student by id");
		System.out.println("3.  Add a student");
		System.out.println("4.  Update a student");
		System.out.println("5.  Delete a student");
		System.out.println("6.  Exit");
		
		return in.nextLine();
	
	}
	
	public void printLoginPrompt() {
		System.out.println("Please log in");
	}
	
	public String getUserInput(String userInputField) {
		System.out.println("Please enter a " + userInputField );
		return in.nextLine();
	}
	
	public void prinRegisterNewUserPrompt() {
		System.out.println("Please register a new user:");
	}	
	
	public void registrationSuccessful() {
		System.out.println("Registration successful. You can now login.");
	}
	
	
	public void printListOfStudents(Student[] students) {
		for (int i=0; i<students.length; i++ ) {
			System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
		}
	}
	
	
	public Student askUserForStudentInfo() {
		
		Student student = new Student();
		
		System.out.println("Please enter the student's first name: ");
		student.setFirstName(in.nextLine());
		
		System.out.println("Please enter the student's last name: ");
		student.setLastName(in.nextLine());
		
		System.out.println("Please enter the student's cohort: ");
		student.setCohort(in.nextLine());
		
		System.out.println("Please enter the student's section: ");
		student.setSection(in.nextLine());
		
		System.out.println("Please enter the student's email: ");
		student.setEmail(in.nextLine());
		
		System.out.println("Please enter the student's phone: ");
		student.setPhone(in.nextLine());
		
		return student;
		
	}
	
	public void printStudentConfirmation(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " has been added with id: " + student.getId());
	}
	

}	


