package org.scoula.lib.cli.command;

import org.scoula.lib.cli.dao.TodoDao;
import org.scoula.lib.cli.dao.TodoListDao;
import org.scoula.lib.cli.domain.Todo;
import org.scoula.lib.cli.ui.Input;

public class UpdateTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute() {
        int id = Input.getInt("수정할 Id : ");
        Todo todo = dao.getTodo(id);

        System.out.println("[Todo 수정하기]------------------------------");
        System.out.println("ID    : " + todo.getId());
        String title = Input.getLine("제목", todo.getTitle());
        String description = Input.getLine("설명", todo.getDescription());
        Boolean done = Input.confirm("완료여부", todo.isDone());
        System.out.println("-------------------------------------------");
        System.out.println();

        Todo updateTodo = (Todo) todo.clone();
        updateTodo.setTitle(title);
        updateTodo.setDescription(description);
        updateTodo.setDone(done);

        dao.update(updateTodo);
    }
}
