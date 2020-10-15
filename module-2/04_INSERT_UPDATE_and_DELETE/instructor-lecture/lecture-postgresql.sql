-- INSERT

-- 1. Add Klingon as a spoken language in the USA

SELECT * FROM countrylanguage where countrycode = 'USA';

INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('USA', 'Klingon', false, 50);


SELECT * FROM countrylanguage where countrycode = 'GBR';
-- 2. Add Klingon as a spoken language in Great Britain
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('GBR', 'Klingon', true, 50);


SELECT * from city where countrycode = 'USA' AND name = 'Java Green';
INSERT INTO city (name, countrycode, district, population )
VALUES ('Java Green', 'USA', 'TechElevator', 19);

INSERT INTO city (name, countrycode, district, population )
VALUES ('Java Green', 'USA', 'TechElevator', 19);

-- UPDATE

-- 1. Update the capital of the USA to Houston
SELECT * FROM country where code = 'USA';

SELECT * FROM city where name = 'Houston';

UPDATE country
SET capital = 3796
WHERE code = 'USA';



-- 2. Update the capital of the USA to Washington DC and the head of state
-- SELECT * FROM city where countrycode = 'USA' ORDER BY name DESC  3813

UPDATE country
SET capital = 3813, headofstate = 'Matty Lange'
WHERE code = 'USA';



-- DELETE

-- 1. Delete English as a spoken language in the Klingon
DELETE FROM countrylanguage
WHERE countrycode = 'USA' AND language = 'Klingon';

-- 2. Delete all occurrences of the Klingon language

DELETE FROM countrylanguage;

START TRANSACTION;
-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('USA', 'Elvish', true, 50);

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('GBR', 'Elvish', true, 50);

-- 3. Try deleting the country USA. What happens?
DELETE from country where code = 'USA';

COMMIT;

-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA

-- 2. Try again. What happens?

-- 3. Let's relocate the USA to the continent - 'Outer Space'


-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.

START TRANSACTION;

DELETE FROM countrylanguage;

SELECT * FROM countrylanguage;
ROLLBACK;
COMMIT;

-- 2. Try updating all of the cities to be in the USA and roll it back

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.