package org.scoula.lib.cli.command;

import org.scoula.lib.cli.dao.TodoDao;
import org.scoula.lib.cli.domain.Todo;
import org.scoula.lib.cli.ui.Input;
import org.scoula.lib.cli.dao.TodoListDao;

public class AddTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute() {
        System.out.println("[새 Todo 추가]-----------------------------");
        String title = Input.getLine("제목 : ");
        String description = Input.getLine("설명 : ");
        System.out.println("------------------------------------------");

        Todo todo = Todo.builder()
                .title(title)
                .description(description)
                .done(false)
                .build();
        dao.add(todo);

        System.out.println();
    }
}
