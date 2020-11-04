package com.techelevator.testudent.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.testudent.dao.StudentDAO;
import com.techelevator.testudent.model.Student;

@PreAuthorize("isAuthenticated()")
@RestController
@RequestMapping(path = "/api")
public class StudentController {

	private StudentDAO studentDAO;

	public StudentController(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	/*
	 * /api/students (GET) Gets a list of all students Success: 200 - Returns a list
	 * of students
	 */
	@RequestMapping(path = "/students", method = RequestMethod.GET)
	public List<Student> retrieveListOfStudents() {
		return studentDAO.retrieveListOfStudents();
	}

	/*
	 * /api/students/:id (GET) Gets a single student by id Success: Returns a single
	 * student if the id is valid Error: returns a 404 if the student id does not
	 * exist
	 */
	@RequestMapping(path = "/students/{id}", method = RequestMethod.GET)
	public Student retrieveStudentById(@PathVariable int id) {
		return studentDAO.retrieveStudentById(id);
	}

	/*
	 * /api/students (POST) Creates a new student Success: returns a 201 (Created)
	 * when successful
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(path = "/students", method = RequestMethod.POST)
	public Student addStudent(@Valid @RequestBody Student newStudent, Principal principal) {
		
		// print out to log who user was that added the student
		System.out.println("Added by: " + principal.getName());
		
		return studentDAO.addStudent(newStudent);
	}

	/*
	 * /api/students/:id (PUT) Updates a specific student Success: returns a 200
	 * (OK) when successful Error: returns a 404 if the student id does not exist
	 */
	@RequestMapping(path = "/students/{id}", method = RequestMethod.PUT)
	public Student updateStudent(@Valid @RequestBody Student updateStudent, @PathVariable int id) {
		return studentDAO.updateStudent(updateStudent, id);
	}

	/*
	 * /api/students/:id (DELETE) Deletes a specific student Success: returns a 200
	 * (OK) when successful Error: returns a 404 if the id does not exist
	 */
	@RequestMapping(path = "/students/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable int id) {
		studentDAO.deleteStudent(id);

	}

	/*
	 * /api/students/filter (GET)
	 * 
	 * Filter students by cohort only Filter students by cohort and section
	 * 
	 * Required Parameters: cohort = Gets a list of all students by cohort name
	 * 
	 * Usage example: /api/students/filter?cohort=12
	 * 
	 * Optional Parameters: sectionName = Gets a list of all students by section
	 * Usage example: /api/students/filter?cohort=12&section=green
	 * 
	 * Optional lastName = Gets a list of students by last name Usage example:
	 * /api/students/filter?cohort=12&lastName=smith
	 * 
	 * 
	 * Success: 200
	 */

	@RequestMapping(path = "/students/filter", method = RequestMethod.GET)
	public List<Student> searchStudents(@RequestParam String cohortName,
			@RequestParam(required = false) String sectionName, @RequestParam(required = false) String lastName) {
		return studentDAO.searchStudents(cohortName, sectionName, lastName);
	}

}
