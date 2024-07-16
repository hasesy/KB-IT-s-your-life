package org.scoula.user;

import org.scoula.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class ManageUser {
    public void getAllUsers() {
        Connection conn = JDBCUtil.getConnection();

        String sql = "SELECT * FROM user_table";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ArrayList<User> users = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String userId = rs.getString("userid");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                boolean membership = rs.getBoolean("membership");
                Timestamp signup = rs.getTimestamp("signup_date");

                User user = new User(id, userId, name, password, age, membership, signup);

                users.add(user);
            }
            // users.forEach((user) -> System.out.println(user)); 같은 것임
            users.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void addUser(User newUser) {
        // 데이터베이스 접속
        Connection conn = JDBCUtil.getConnection();

        String sql = "INSERT INTO user_table (userId, name, password, age, membership) VALUES (?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newUser.getUserId());
            pstmt.setString(2, newUser.getName());
            pstmt.setString(3, newUser.getPassword());
            pstmt.setInt(4, newUser.getAge());
            pstmt.setBoolean(5, newUser.isMembership());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        System.out.println("회원이 성공적으로 추가되었습니다!");
    }

    public void deleteUserById(int id) {
        Connection conn = JDBCUtil.getConnection();

        String sql = "DELETE FROM user_table WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows == 0) {
                System.out.println("ID가 " + id + "인 회원이 존재하지 않습니다!");
            } else {
                System.out.println("ID가 " + id + "인 회원 정보가 성공적으로 제거되었습니다!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void searchUsersByName(String namePart) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user_table WHERE name LIKE ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ArrayList<User> users = new ArrayList<>();
            pstmt.setString(1, namePart);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (!rs.next()) {
                    System.out.println("해당 철자가 포함된 회원이 존재하지 않습니다.");
                }
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String userId = rs.getString("userid");
                    String name = rs.getString("name");
                    String password = rs.getString("password");
                    int age = rs.getInt("age");
                    boolean membership = rs.getBoolean("membership");
                    Timestamp signup = rs.getTimestamp("signup_date");

                    User user = new User(id, userId, name, password, age, membership, signup);

                    users.add(user);
                }
                users.forEach(System.out::println);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
