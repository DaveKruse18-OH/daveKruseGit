SELECT name, countrycode, district 
FROM city;

SELECT *
FROM city
WHERE district = 'Zuid-Holland'
AND population < 100000;

SELECT name as stevesnewcolumnname, region, indepyear AS independenceyear FROM country;

SELECT name from country where indepyear > 1776 AND indepyear < 2000 AND population > 1000000;

SELECT name, indepyear from country where indepyear IS NOT NULL;
SELECT name, indepyear from country where indepyear IS NULL;

SELECT name, continent from country where continent <> 'Asia';   -- not equal
SELECT name, continent from country where continent != 'Asia';   -- same as above
SELECT name, continent from country where continent = 'Asia';

SELECT name, continent from country where continent IN ('North America', 'South America');
SELECT name, continent from country where continent NOT IN ('North America', 'South America');


SELECT name, countrycode, district 
FROM city ORDER BY district, name DESC;

SELECT name, countrycode, district, population
FROM city ORDER BY population DESC LIMIT 10;


SELECT name, continent, population, surfacearea,lifeexpectancy, (population / surfacearea) AS density 
FROM country 
WHERE continent = 'Asia';


SELECT name, continent, population, surfacearea,lifeexpectancy, (population / surfacearea) AS density 
FROM country 
WHERE continent = 'Asia'
ORDER BY density DESC
LIMIT 5;


SELECT DISTINCT name from city;


SELECT name, continent, indepyear from country
WHERE indepyear > 1776
AND continent = 'Asia'
AND name like '%s';  -- all names ending is s

SELECT name, continent, indepyear from country
WHERE indepyear > 1776
AND continent = 'Asia'
AND name like '%es';  -- all names ending is s

SELECT name, continent, indepyear from country
WHERE indepyear > 1776
AND continent = 'Asia'
AND name like 'M%';  -- all names start with 'm' 

SELECT name, continent, indepyear from country
WHERE 
name like '%an%';  -- all names start with 'm' 

