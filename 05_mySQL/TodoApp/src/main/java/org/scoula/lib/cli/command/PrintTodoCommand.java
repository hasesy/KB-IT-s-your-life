package org.scoula.lib.cli.command;


import org.scoula.lib.cli.dao.TodoDao;
import org.scoula.lib.cli.dao.TodoListDao;
import org.scoula.lib.cli.domain.Todo;

public class PrintTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute() {
        for (Todo todo : dao.getList()) {
            String line = "%2d] %s".formatted(todo.getId(), todo.getTitle());
            System.out.println(line);
        }
        System.out.println();
    }
}
