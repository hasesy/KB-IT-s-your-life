package org.scoula;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    static Connection conn = null;
    static {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/user_ex";
            String id = "root";
            String password = "2580";

            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, password);

            if (conn != null) {
                System.out.println("DB 접속에 성공!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void close() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(String email, String password) {
        String sql = "INSERT INTO users (email, password) VALUES (?, ?)";

       try (PreparedStatement stmt = conn.prepareStatement(sql)) {
           stmt.setString(1, email);
           stmt.setString(2, password);

           stmt.executeUpdate();
       } catch (SQLException e) {
           e.printStackTrace();
           throw new RuntimeException(e);
       }
    }

    public void getAllUsers() {
        String sql = "SELECT * FROM users";

        ArrayList<UserVo> result = new ArrayList<>();
        try (Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");

                UserVo user = new UserVo(id, email, password);
                result.add(user);
            }
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
