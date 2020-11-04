package com.techelevator.testudent.dao.jdbc;

import java.util.ArrayList;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.testudent.dao.StudentDAO;
import com.techelevator.testudent.model.Student;

@Component
public class JDBCStudentDAO implements StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JDBCStudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	@Override
	public List<Student> retrieveListOfStudents() {
		
        List<Student> students = new ArrayList<>();
        
		String sql = "Select * from student";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		
		while (results.next()) {
			//map the row
			students.add(mapRowToStudents(results));
		}
		
		return students;
	}
	
	private Student mapRowToStudents(SqlRowSet rs) {
		Student student = new Student();
		
		student.setCohort(rs.getString("cohort"));
		student.setSection(rs.getString("section"));
		student.setEmail(rs.getString("email"));
		student.setFirstName(rs.getString("first_name"));
		student.setLastName(rs.getString("last_name"));
		student.setPhone(rs.getString("phone"));
		student.setId(rs.getInt("id"));
		
		return student;
	}

	@Override
	public Student retrieveStudentById(int id) {
		Student student = null;
		
		String sql = "Select * from student where id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
		
		if(results.next()) {
			//map the row
			student = mapRowToStudents(results);
		}
		
		return student;
	}

	@Override
	public Student addStudent(Student newStudent) {
		
		String sql = "INSERT INTO student (id, first_name, last_name, section, cohort, phone, email) VALUES (DEFAULT, ?,?,?,?,?,?) RETURNING ID";
		Integer id = jdbcTemplate.queryForObject(sql, Integer.class, newStudent.getFirstName(), newStudent.getLastName(), newStudent.getSection(), newStudent.getCohort(), newStudent.getPhone(), newStudent.getEmail()); 
		newStudent.setId(id);
		return newStudent;
		
	}

	@Override
	public Student updateStudent(Student updateStudent, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> searchStudents(String cohortName, String sectionName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
