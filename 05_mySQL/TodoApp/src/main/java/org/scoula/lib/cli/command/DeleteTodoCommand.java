package org.scoula.lib.cli.command;

import org.scoula.lib.cli.dao.TodoDao;
import org.scoula.lib.cli.dao.TodoListDao;
import org.scoula.lib.cli.ui.Input;

public class DeleteTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute() {
        int id = Input.getInt("삭제할 Todo Id : ");
        dao.delete(id);

        System.out.println();
    }
}
