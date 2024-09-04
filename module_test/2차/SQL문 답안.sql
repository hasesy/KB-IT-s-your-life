use world2;

SELECT * FROM city;
SELECT * FROM country;
SELECT * FROM countrylanguage;

# 1-1
SELECT * FROM city;

# 1-2
SELECT Language, Percentage
FROM countrylanguage
WHERE CountryCode = 'CHE';

# 1-3
INSERT INTO city (Name, CountryCode, District, Population)
VALUES ('Cairo', 'EGY', 'Cairo Governorate', 9500000);

# 1-4
UPDATE city
SET Name = 'GoodSite'
WHERE CountryCode = 'PNG';

# 1-5
SELECT * FROM country
ORDER BY Name DESC;

# 2-1
SELECT UPPER(Name) FROM city;

# 2-2
SELECT CONCAT(ID, "-", CountryCode) FROM city;

# 2-3
SELECT LENGTH(District) FROM city;

# 2-4
SELECT AVG(Population) FROM city;

# 2-5
SELECT Continent, MAX(GNP)
FROM country
GROUP BY Continent
ORDER BY MAX(GNP) ASC;

# 3-1
SELECT ci.Name, co.Name
FROM city ci
INNER JOIN country co
ON ci.CountryCode = co.Code;

# 3-2
SELECT co.Name, cl.Language
FROM country co
LEFT JOIN countrylanguage cl
ON co.Code = cl.CountryCode;

# 3-3
SELECT Name FROM city
WHERE Population = (SELECT MAX(Population) FROM city);

SELECT * FROM city
WHERE Name = 'Win';