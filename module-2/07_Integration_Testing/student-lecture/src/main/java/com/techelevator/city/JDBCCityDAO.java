package com.techelevator.city;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

public class JDBCCityDAO implements CityDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCCityDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(City newCity) {
		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) "
				+ "VALUES(?, ?, ?, ?, ?)";
		newCity.setId(getNextCityId());
		jdbcTemplate.update(sqlInsertCity, newCity.getId(), newCity.getName(), newCity.getCountryCode(),
				newCity.getDistrict(), newCity.getPopulation());
	}

	@Override
	public City findCityById(long id) {
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population " + "FROM city " + "WHERE id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if (results.next()) {
			theCity = mapRowToCity(results);
		}
		return theCity;
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		ArrayList<City> cities = new ArrayList<>();
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population " + "FROM city "
				+ "WHERE countrycode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, countryCode);
		while (results.next()) {
			City theCity = mapRowToCity(results);
			cities.add(theCity);
		}
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		ArrayList<City> cities = new ArrayList<>();
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population " + "FROM city "
				+ "WHERE district = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, district);
		while (results.next()) {
			City theCity = mapRowToCity(results);
			cities.add(theCity);
		}
		return cities;
	}

	@Override
	public void update(City city) {
	    // create an update sql query 
		
		String sql = "UPDATE city SET name = ?, countrycode = ?, district =?, population = ? WHERE id = ?";
	
		
		jdbcTemplate.update(sql, city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation(), city.getId());

	}

	@Override
	public void delete(long id) {

		
		String sql = "DELETE FROM city WHERE id = ?";
		
		jdbcTemplate.update(sql, id);

	}

	/**
	 * Gets the next id from the sequence for the city table.
	 *
	 * @return The next id in the city id sequence.
	 */
	private long getNextCityId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");

		// Remember, we only get a single row back, so we just need to check if we got a
		// row.
		if (nextIdResult.next()) {
			// While we usually get the columns by name explicitly (see the mapCityToRow
			// method), we can also get a column at a specific index. Keep in mind the index
			// starts at one (1), unlike arrays that start at an index of zero (0).
			return nextIdResult.getLong(1);
		} else {
			// in this case, if we weren't able to get a single row back, we need to throw
			// an unchecked RuntimeException.
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

	private City mapRowToCity(SqlRowSet results) {
		City theCity;
		theCity = new City();
		theCity.setId(results.getLong("id"));
		theCity.setName(results.getString("name"));
		theCity.setCountryCode(results.getString("countrycode"));
		theCity.setDistrict(results.getString("district"));
		theCity.setPopulation(results.getInt("population"));
		return theCity;
	}
}
