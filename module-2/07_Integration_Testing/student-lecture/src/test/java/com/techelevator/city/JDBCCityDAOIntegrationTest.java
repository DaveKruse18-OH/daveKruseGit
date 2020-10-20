package com.techelevator.city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JDBCCityDAOIntegrationTest {



	@Test
	public void save_new_city_and_read_it_back() throws SQLException {

	}

	@Test
	public void returns_cities_by_country_code() {

	}

	@Test
	public void returns_multiple_cities_by_country_code() {

	}

	@Test
	public void returns_cities_by_district() {

	}
	
	@Test
	public void delete_city() {
		
	}
	
	@Test void update_city() {
		
	}


}
