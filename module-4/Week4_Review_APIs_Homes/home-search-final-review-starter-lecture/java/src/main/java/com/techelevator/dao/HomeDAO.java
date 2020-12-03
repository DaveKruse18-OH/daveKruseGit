package com.techelevator.dao;

import java.util.List;

import com.techelevator.model.Home;

public interface HomeDAO {
	
	List<Home> getHomes();
	void addHome(Home home);

}
