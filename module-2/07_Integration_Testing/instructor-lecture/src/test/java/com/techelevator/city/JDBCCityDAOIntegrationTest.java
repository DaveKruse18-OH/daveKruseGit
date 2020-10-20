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

    private static SingleConnectionDataSource dataSource;
    private JDBCCityDAO dao;
    private static final String TEST_COUNTRY = "XYZ";
    
    @BeforeClass
    public static void setupDataSource() {
    	
    	dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
    	dataSource.setAutoCommit(false);     // prevent accidental saves or updates to the db
 
    }
    
    @AfterClass
    public static void closeDataSource() {
    	dataSource.destroy();
    }

    @Before
    public void setUp() {
    	
    	// used to insert dummy data
    	String sqlInsertCountry = "INSERT INTO country (code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2) VALUES (?, 'Afghanistan', 'Asia', 'Southern and Central Asia', 652090, 1919, 22720000, 45.9000015, 5976.00, NULL, 'Afganistan/Afqanestan', 'Islamic Emirate', 'Mohammad Omar', 1, 'AF')";
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
    	jdbcTemplate.update(sqlInsertCountry, TEST_COUNTRY);
    	
    	// create a new instance of our dao so we can test it later
    	dao = new JDBCCityDAO(dataSource);

    }
    
    @After
    public void rollback() throws SQLException {
    	dataSource.getConnection().rollback();
    }
    
    
    
	@Test
	public void save_new_city_and_read_it_back() throws SQLException {
		
		
		//Arrange - create a new city so we can save it using our .save method in our DAO
		City expectedCity = getCity("JavaGreen", "ColumbusOnline", TEST_COUNTRY, 18);
		
		dao.save(expectedCity);   // this is the method we are testing
		
		City savedCity = dao.findCityById(expectedCity.getId());
		
		assertNotEquals(null, expectedCity.getId() );   // the dao.save() updated the id when it saved...
		assertCitiesAreEqual(expectedCity, savedCity);
		

	}

	@Test
	public void returns_cities_by_country_code() {
		
		City city1 = getCity("Dave", "District9", TEST_COUNTRY, 15);
		dao.save(city1);
		City city2 = getCity("Tamagne", "District10", TEST_COUNTRY, 14);
		dao.save(city2);
		
		List<City> results = dao.findCityByCountryCode(TEST_COUNTRY);
		
		assertNotNull(results);
	    assertEquals(2, results.size());
	    
	    City actual1 = results.get(0);
	    City actual2 = results.get(1);
	    
	    if (actual1.getName().equalsIgnoreCase("Dave")) {
	    	assertCitiesAreEqual(city1,actual1);
	    }
	    else {
	    	assertCitiesAreEqual(city2,actual1);
	    }

	    
   
	    
	}

	@Test
	public void returns_multiple_cities_by_country_code() {
		 Assert.fail();
	}

	@Test
	public void returns_cities_by_district() {
		 Assert.fail();
	}
	
	@Test
	public void delete_city() {
		
		City city1 = getCity("Dave", "District9", TEST_COUNTRY, 15);
		dao.save(city1);
		
		City found = dao.findCityById(city1.getId());
		assertNotNull(found);
		
		dao.delete(city1.getId());
		
		City notFound = dao.findCityById(city1.getId());
		Assert.assertNull(notFound);
	}
	
	@Test 
	public void update_city() {
		 Assert.fail();
		
	}
	
	private City getCity(String name, String district, String countryCode, int population) {
		City theCity = new City();
		theCity.setName(name);
		theCity.setDistrict(district);
		theCity.setCountryCode(countryCode);
		theCity.setPopulation(population);
		return theCity;
	}	
	
	private void assertCitiesAreEqual(City expected, City actual) {
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getName(), actual.getName());
		assertEquals(expected.getDistrict(), actual.getDistrict());
		assertEquals(expected.getCountryCode(), actual.getCountryCode());
		assertEquals(expected.getPopulation(), actual.getPopulation());
	}	


}
