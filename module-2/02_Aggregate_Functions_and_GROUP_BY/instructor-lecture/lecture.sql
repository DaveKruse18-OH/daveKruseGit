-- ORDERING RESULTS



-- Populations of all countries in descending order

SELECT name, population 
FROM country
ORDER BY population DESC;


--Names of countries and continents in ascending order

SELECT continent, name 
FROM country
ORDER BY continent, name;


-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.

SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;


-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city

SELECT (name || ', ' || district) AS name_and_state
FROM CITY




-- AGGREGATE FUNCTIONS

-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy)
FROM country;



-- Total population in Ohio - SUM(column)
SELECT SUM(population)
FROM city
WHERE district = 'Ohio';




-- The surface area of the smallest country in the world - min

SELECT MIN(surfacearea) 
FROM country;



-- The 10 largest countries by surface area in the world -

SELECT name, surfacearea
FROM country
ORDER BY surfacearea DESC
LIMIT 10;


-- The number of countries who declared independence in 1991 - count

SELECT count(*)
FROM country
WHERE indepyear = '1991';





-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least



SELECT language, count(*) AS countries
FROM countrylanguage
GROUP BY language
ORDER BY countries DESC;



-- Average life expectancy of each continent ordered from highest to lowest

SELECT continent, avg(lifeexpectancy) AS averageLE
FROM country
WHERE continent != 'Antarctica'
GROUP BY continent
ORDER BY averageLE DESC;



-- Exclude Antarctica from consideration for average life expectancy



-- Sum of the population of cities in each state in the USA ordered by state name

SELECT district, SUM(population) AS TotalPopulation
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;



-- The average population of cities in each state in the USA ordered by state name

SELECT district, AVG(population) AS Average_Population
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;


SELECT district, Round(AVG(population), 2) AS Average_Population
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;

-- Rounding values (Not in starter code) - round takes two parameters (value, and scale) - try changing 2 to 4
-- Calculate each country's GNP by population. Round to two decimal places

SELECT name, round ( gnp / population, 2) as result
FROM country
WHERE population > 0;


-- Now round to 4 decimal places
SELECT name, round ( gnp / population, 4) as result
FROM country
WHERE population > 0;

-- SUBQUERIES

-- Select all cities that are in Europe where the country's GNP is greater than one 
-- million (do it without a subquery first. Hint: It takes 2 separate queries...)


SELECT * FROM country 
WHERE continent = 'Europe' AND gnp > 1000000

SELECT * FROM city where countrycode IN ('GBR', 'ITA', 'FRA', 'DEU');

-- Now try using a subquery (can now do it in one query)

SELECT * FROM city
WHERE countrycode IN (SELECT code FROM country WHERE continent = 'Europe' AND gnp > 1000000 )
ORDER BY population DESC;

-- Table and column aliases
-- You may alias column and table names to be more descriptive



SELECT c.name, co.name
FROM city as c, country as co;

SELECT city.name, country.name
FROM city, country;

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.







-- Additional samples if time allows:


-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

-- Gets the MIN population and the MAX population from the city table.

-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
