# user_ex 데이터 베이스 생성
CREATE DATABASE user_ex;

# user_ex 데이터 베이스 사용
USE user_ex;

# user 테이블 생성
CREATE TABLE users
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    email    VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100)        NOT NULL
);

# 생성한 user 테이블 확인
SELECT *
FROM users;

# user 테이블에 회원 정보 삽입
# id 값은 자동으로 생성되므로 전달 필요 X
INSERT INTO users (email, password)
VALUES ('tetz', '1234'),
       ('siwan', '1234'),
       ('na', '1234');

# user_info 테이블 생성
# 해당 테이블은 user 테이블의 id 를 외래키(FOREIGN KEY) 로 가지며 회원 id 를 가지고
# 회원의 이름을 알 수 있는 목적을 가지는 테이블 입니다
CREATE TABLE user_info
(
    id   INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    # user 테이블의 id 와 user_info 의 id 가 서로 참조하는 관계임을 외래키로 설정
    FOREIGN KEY (id) REFERENCES users (id) ON DELETE CASCADE
    # JOIN 문 연습을 위해, 억지로 만든 테이블이며 해당 테이블은 제2 정규형을(2NF)를 위배합니다
    # name 컬럼도 id 에 종속이기 때문에 해당 테이블은 굳이 따로 나눌 필요가 없기 때문입니다
);

# 생성한 user 테이블 확인
SELECT *
FROM user_info;

# 각각의 테이블에 필요한 데이터 삽입
INSERT INTO user_info (id, name)
VALUES ('1', '이효석'),
       ('2', '김시완'),
       ('3', '나건우');