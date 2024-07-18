package org.scoula.todo;

import org.scoula.common.JDBCUtil;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    private final Connection conn;

    public UserDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public UserVo loginUser(String userId, String password) {
        String sql = "SELECT * FROM todo_user WHERE user_id = ? AND password = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("name");
                    Timestamp created = rs.getTimestamp("created_at");

                    return new UserVo(userId, name, password, created);
                } else return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
