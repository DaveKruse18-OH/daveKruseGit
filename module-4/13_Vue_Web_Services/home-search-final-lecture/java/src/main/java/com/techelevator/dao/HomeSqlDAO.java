package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.techelevator.model.Home;
import com.techelevator.model.User;

@Service
public class HomeSqlDAO implements HomeDAO {
	
    private JdbcTemplate jdbcTemplate;

    public HomeSqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }	
    
    
public void addHome(Home home) {

		
		String sqlInsertHome = "INSERT INTO home (mlsNumber, address, city, state, zip, price, imageName) VALUES (?, ?, ?, ?, ?, ?, ?)"; 
        
             
        jdbcTemplate.update(sqlInsertHome, 
            		                home.getMlsNumber(),
            		                home.getAddress(),
            		                home.getCity(),
            		                home.getState(),
            		                home.getZip(),
            		                home.getPrice(),
            		                home.getImageName());
       
	
}    
    

	@Override
	public List<Home> getHomes() {
		
		List<Home> homes = new ArrayList<Home>();

		String sql = "SELECT * FROM home";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		

        while(results.next()) {
            Home home = mapRowToHome(results);
            homes.add(home);
        }	
        
        return homes;
		
		
	}
	
    private Home mapRowToHome(SqlRowSet rs) {
        Home home = new Home();
        home.setMlsNumber(rs.getString("mlsNumber"));
        home.setAddress(rs.getString("address"));
        home.setCity(rs.getString("city"));
        home.setImageName(rs.getString("imageName"));
        home.setPrice(rs.getDouble("price"));
        home.setState(rs.getString("state"));
        home.setZip(rs.getString("zip"));

        return home;
    }	

}
