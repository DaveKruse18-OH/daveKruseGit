package com.techelevator.testudent.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.testudent.domain.Student;

public interface StudentDAO {
	
	
	List<Student> retrieveListOfStudents();
	Student retrieveStudentById(int id);
	Student addStudent(Student newStudent);
	Student updateStudent(Student updateStudent, int id);
	void deleteStudent(int id);
	List<Student> searchStudents(String cohortName, String sectionName, String lastName);
}
