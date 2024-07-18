package org.scoula.todo;

public interface TodoDao {
    int getTotalCount(String userId);
    void getTodosByUserId(String userId);
    void getCompletedTodosByUserId(String userId);
    void getUncompletedTodosUserId(String userId);
    void makeTodoCompleted(int id, String userId);
    void createTodo(String todo, String userId);
    void deleteTodo(int id, String userId);
    void getAllTodosWithUserName();
}
