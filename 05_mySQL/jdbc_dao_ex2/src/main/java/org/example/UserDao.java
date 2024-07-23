package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public void addUser(UserVo newUser) {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            //2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "2580";

            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3. SQL 문 생성
            String sql = "INSERT INTO users (email, password) VALUES (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newUser.getEmail());
            pstmt.setString(2, newUser.getPassword());
            System.out.println("3. SQL문 생성 OK");

            // 4. SQL 문 전송
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("회원 추가 성공!");
            } else {
                System.out.println("회원 추가 실패");
            }

            // 5. 자원 해제
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<UserVo> getAllUsers() {
        List<UserVo> userList = new ArrayList<>();

        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            //2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "2580";

            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3. SQL 문 생성
            String sql = "SELECT * FROM users";
            Statement stmt = conn.createStatement();
            System.out.println("3. SQL문 생성 OK");

            // 4. SQL 문 전송
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int userId = rs.getInt("id");
                String email = rs.getString("email");
                String pw = rs.getString("password");

                UserVo user = new UserVo(userId, email, pw);
                userList.add(user);
            }

            // 5. 자원 해제
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 6. 결과 리턴
        return userList;
    }

    public void updateUser(int userId, String newEmail, String newPassword) {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            //2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "2580";

            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3. SQL 문 생성
            String sql = "UPDATE users SET email = ?, password = ? WHERE id = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newEmail);
            pstmt.setString(2, newPassword);
            pstmt.setInt(3, userId);
            System.out.println("3. SQL문 생성 OK");

            // 4. SQL 문 전송
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("회원 정보 수정 성공!");
            } else {
                System.out.println("회원 정보 수정 실패");
            }

            // 5. 자원 해제
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 회원 삭제
    public void deleteUser(int userId) {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            //2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "2580";

            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3. SQL 문 생성
            String sql = "DELETE FROM users WHERE id = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);

            // 4. SQL 문 전송
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("회원 삭제 성공!");
            } else {
                System.out.println("회원 삭제 실패");
            }

            // 5. 자원 해제
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 테이블을 합친 뒤, 회원의 이름 정보까지 전부 출력하는 메서드
    public void getAllUsersWithName() {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            //2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "2580";

            Connection conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");

            // 3. SQL 문 생성
            String sql = "SELECT u.id, u.email, u.password, ui.name FROM users u JOIN user_info ui ON u.id = ui.id";

            Statement stmt = conn.createStatement();
            System.out.println("3. SQL 문 생성 OK");

            // 4. SQL 문 전송
            ResultSet rs = stmt.executeQuery(sql);
             while (rs.next()) {
                 int userId = rs.getInt("id");
                 String email = rs.getString("email");
                 String pw = rs.getString("password");
                 String name = rs.getString("name");

                 System.out.printf("ID: %d, Email: %s, Password: %s, Name: %s%n", userId, email, pw, name);
             }

             // 5. 자원 해제
            stmt.close();
             conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
