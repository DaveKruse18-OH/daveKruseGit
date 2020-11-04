package com.techelevator.testudent.services;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


import com.techelevator.testudent.models.Student;


/**
 *  This is the CLIENT-SIDE service that contains the code to fetch/send data to the server (student controller)
 *  
 */
public class StudentService {
	
	public String AUTH_TOKEN = "";
	private final String BASE_URL = "http://localhost:8080/api";
	private final RestTemplate restTemplate = new RestTemplate();
	
	public Student[] retrieveListOfStudent() {
		
	    Student[] students = null;
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);
	    
	    //build and entity object so the header gets added
	    HttpEntity<Student[]> entity = new HttpEntity<>(headers);		
		
	    //call the web service on the server-side to retrieve an array of students...
		students = restTemplate.exchange(BASE_URL + "/students", HttpMethod.GET, entity, Student[].class).getBody();
		
		
		return students;
	
		
	}
	
	
	public Student addStudent(Student newStudent) {
		
		Student student = null;
		
	    //create HTTP header so we can set application/json AND AUTH_TOKEN
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setBearerAuth(AUTH_TOKEN);	
	    
	    HttpEntity<Student> entity = new HttpEntity<>(newStudent, headers);	
	    
		student = restTemplate.exchange(BASE_URL + "/students", HttpMethod.POST, entity, Student.class).getBody();
	    
		return student;
	}

	/**
	 * This gets set by the client once authentication occurs
	 * @param aUTH_TOKEN
	 */
	public void setAUTH_TOKEN(String aUTH_TOKEN) {
		AUTH_TOKEN = aUTH_TOKEN;
	}
	
	
	

}
