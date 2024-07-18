package org.scoula.todo;

import org.scoula.common.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class TodoDaoImpl implements TodoDao {
    private final Connection conn;

    public TodoDaoImpl() {
        this.conn = JDBCUtil.getConnection();
    }

    @Override
    public int getTotalCount(String userId) {
        String sql = "SELECT COUNT(*) FROM todolist WHERE user_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);

            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getTodosByUserId(String userId) {
        String sql = "SELECT * FROM todolist WHERE user_id = ?";
        ArrayList<TodoVo> todos = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String todo = rs.getString("todo");
                    boolean isCompleted = rs.getBoolean("is_completed");
                    Timestamp created = rs.getTimestamp("created_at");

                    TodoVo todolist = new TodoVo(id, userId, todo, isCompleted, created);
                    todos.add(todolist);
                }
                todos.forEach(System.out::println);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    @Override
    public void getUncompletedTodosUserId(String userId) {
        String sql = "SELECT * FROM todolist WHERE user_id = ? AND is_completed = false";
        ArrayList<TodoVo> todos = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String todo = rs.getString("todo");
                    boolean isCompleted = rs.getBoolean("is_completed");
                    Timestamp created = rs.getTimestamp("created_at");

                    TodoVo todolist = new TodoVo(id, userId, todo, isCompleted, created);
                    todos.add(todolist);
                }

                if (todos.isEmpty()) {
                    System.out.println("미완료 목록이 없습니다.");
                } else {
                    todos.forEach(System.out::println);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getCompletedTodosByUserId(String userId) {
        String sql = "SELECT * FROM todolist WHERE user_id = ? AND is_completed = true";
        ArrayList<TodoVo> todos = new ArrayList<>();

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String todo = rs.getString("todo");
                    boolean isCompleted = rs.getBoolean("is_completed");
                    Timestamp created = rs.getTimestamp("created_at");

                    TodoVo todolist = new TodoVo(id, userId, todo, isCompleted, created);
                    todos.add(todolist);
                }
                if (todos.isEmpty()) {
                    System.out.println("완료 목록이 없습니다.");
                } else {
                    todos.forEach(System.out::println);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeTodoCompleted(int id, String userId) {
        String sql = "UPDATE todolist SET is_completed = 1 WHERE id = ? AND user_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, userId);

            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                System.out.println("ID가 " + id + "인 Todo 는 회원님의 Todo 가 아닙니다.");
            } else {
                System.out.println("ID가 " + id + "인 Todo 가 완료 처리되었습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createTodo(String todo, String userId) {
        String sql = "INSERT INTO todolist(user_id, todo) VALUES (?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, userId);
            stmt.setString(2, todo);

            stmt.executeUpdate();
            System.out.println("Todo 추가 성공!");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteTodo(int id, String userId) {
        String sql = "DELETE FROM todolist WHERE id = ? AND user_id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, userId);

            int affectedRows = stmt.executeUpdate();

            if (affectedRows == 0) {
                System.out.println("ID가 " + id + "인 Todo 는 회원님의 Todo 가 아닙니다.");
            } else {
                System.out.println("ID가 " + id + "인 Todo 가 삭제되었습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void getAllTodosWithUserName() {
        String sql = "SELECT tl.id, tl.user_id, tu.name, tl.todo, tl.is_completed, tl.created_at FROM todolist tl INNER JOIN todo_user tu ON tl.user_id = tu.user_id;";


        try (Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String userId = rs.getString("user_id");
                String name = rs.getString("name");
                String todo = rs.getString("todo");
                boolean isCompleted = rs.getBoolean("is_completed");
                Timestamp created = rs.getTimestamp("created_at");

                System.out.print("id : " + id + ", ");
                System.out.print("userId : " + userId + ", ");
                System.out.print("작성자 이름 : " + name + ", ");
                System.out.print("todo : " + todo + ", ");
                System.out.print("is_completed : " + isCompleted + ", ");
                System.out.print("created_at : " + created);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
