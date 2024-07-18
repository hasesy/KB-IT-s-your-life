package org.scoula.lib.cli.dao;

import org.scoula.lib.cli.domain.Todo;

import java.util.List;

public interface TodoDao {
    Todo getTodo(int id);

    List<Todo> getList();

    void add(Todo todo);

    void update(Todo todo);

    void delete(int id);
}
