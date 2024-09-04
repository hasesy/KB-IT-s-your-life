USE world;

SELECT * FROM city;
SELECT * FROM country;
SELECT * FROM countrylanguage;

INSERT INTO `city` (Name, CountryCode, District, Population) VALUES ('TETZ', 'KOR', 'TETZ', 1);

SELECT * FROM city WHERE Name = 'TETZ';

UPDATE `city` SET Population = 0 WHERE Name = 'TETZ';

DELETE FROM city WHERE Name = 'TETZ';

SELECT Name, CountryCode, Population FROM city ORDER BY Population DESC;

# 함수
SELECT * FROM country;

SELECT Name, IFNULL(IndepYear, '독립 연도 없음') FROM country;

SELECT LOWER(Code) AS 국가코드 FROM country;
SELECT UPPER(Name) AS 국가명 FROM country;

# CONCAT 컬럼 합치기
SELECT CONCAT(ID, ' / ', Name, ' / ', Population) FROM city;

# 값 바꾸기
SELECT REPLACE(Continent, 'Asia', '아시아당') FROM country;

# 올림
SELECT Name, CEILING(LifeExpectancy) FROM country;

# 버림
SELECT Name, FLOOR(LifeExpectancy) FROM country;

# 반올림
SELECT Name, ROUND(LifeExpectancy) FROM country;

# 값의 길이
SELECT Name, LENGTH(Name) FROM country;

# 최대, 최소, 평균
SELECT MAX(Population) FROM city;
SELECT MIN(Population) FROM city;
SELECT AVG(Population) FROM city;

SELECT CountryCode, SUM(Population) FROM city
GROUP BY CountryCode;

# JOIN
SELECT co.Code, ci.Name, co.Name
FROM city ci
INNER JOIN country co on co.Code = ci.CountryCode;

SELECT co.Code, co.Name, cl.Language
FROM countrylanguage cl
RIGHT JOIN country co on cl.CountryCode = co.Code;

# JOIN 함수
SELECT ci.CountryCode, co.Name, AVG(ci.Population)
FROM city ci
INNER JOIN country co
ON ci.CountryCode = co.Code
GROUP BY ci.Countrycode;

# 서브쿼리
SELECT *
FROM city
WHERE Population >
      (SELECT Population FROM city WHERE Name = 'Amsterdam');