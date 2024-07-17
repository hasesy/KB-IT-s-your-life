package org.scoula.user2;

import org.scoula.common.JDBCUtil;
import org.scoula.user.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO {
    private final Connection conn;

    public UserDAO() {
        this.conn = JDBCUtil.getConnection();
    }

    public void addUser(UserVO newUser) {
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

    public void getAllUsers() {
        String sql = "SELECT * FROM user_table";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ArrayList<UserVO> users = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String userId = rs.getString("userid");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                boolean membership = rs.getBoolean("membership");
                Timestamp signup = rs.getTimestamp("signup_date");

                UserVO user = new UserVO(id, userId, name, password, age, membership, signup);

                users.add(user);
            }
            // users.forEach((user) -> System.out.println(user)); 같은 것임
            users.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
