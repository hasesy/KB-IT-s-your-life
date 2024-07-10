# 첫번째 페이지
SHOW DATABASES;
USE employees;
SHOW TABLES;
DESC employees;

# 두번째 페이지
SELECT * FROM titles;
SELECT first_name FROM employees;
SELECT first_name, last_name, gender FROM employees;

# 세번째 페이지
SELECT first_name AS 이름, gender AS 성별, hire_date AS '회사 입사일' FROM employees;

# 네번째 페이지
USE sqldb;

# 다섯번째 페이지
SELECT * FROM usertbl WHERE name = '김경호';
SELECT * FROM usertbl WHERE birthyear >= 1970 AND height >= 182;

# 여섯번째 페이지
SELECT * FROM usertbl WHERE height BETWEEN 180 AND 183;
SELECT * FROM usertbl WHERE addr IN ('경남', '전남', '경북');
SELECT * FROM usertbl WHERE name LIKE '김%';

# 일곱번째 페이지
SELECT name, height FROM usertbl WHERE height > (SELECT height FROM usertbl WHERE name = '김경호');

# 여덟번째 페이지
SELECT * FROM usertbl ORDER BY mDate ASC;
SELECT * FROM usertbl ORDER BY mDate DESC;
SELECT * FROM usertbl ORDER BY height DESC, name DESC;

# 아홉번째 페이지
SELECT DISTINCT addr FROM usertbl ORDER BY addr ASC;