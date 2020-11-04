package com.techelevator.testudent.dao.jdbc;

import java.util.ArrayList;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.testudent.dao.StudentDAO;
import com.techelevator.testudent.domain.Student;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student addStudent(Student newStudent) {
		// TODO Auto-generated method stub
		return null;
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
