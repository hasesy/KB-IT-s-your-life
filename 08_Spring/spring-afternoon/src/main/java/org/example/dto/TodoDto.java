package org.example.dto;

public class TodoDto {
    private String todo;

    public TodoDto(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
