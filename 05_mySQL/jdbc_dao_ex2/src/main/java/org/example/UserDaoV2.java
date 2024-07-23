package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoV2 {
    Connection conn = null;

    public UserDaoV2() {
        try {
            // 1. Driver 커넥터 설정
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            System.out.println("1. 드라이버 설정 OK");

            //2. DB 연결
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "2580";

            this.conn = DriverManager.getConnection(url, id, password);
            System.out.println("2. DB 연결 OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addUser(UserVo newUser) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<UserVo> getAllUsers() {
        List<UserVo> userList = new ArrayList<>();

        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 6. 결과 리턴
        return userList;
    }

    public void updateUser(int userId, String newEmail, String newPassword) {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 회원 삭제
    public void deleteUser(int userId) {
        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
