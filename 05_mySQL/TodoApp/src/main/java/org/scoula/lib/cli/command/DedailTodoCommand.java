package org.scoula.lib.cli.command;

import org.scoula.lib.cli.dao.TodoDao;
import org.scoula.lib.cli.dao.TodoListDao;
import org.scoula.lib.cli.domain.Todo;
import org.scoula.lib.cli.ui.Input;

public class DedailTodoCommand implements Command {
    TodoDao dao = TodoListDao.getInstance();

    @Override
    public void execute() {
        int id = Input.getInt("Todo id : ");
        Todo todo = dao.getTodo(id);

        System.out.println("[Todo 상세보기]----------------------------");
        System.out.println("ID      : " + todo.getId());
        System.out.println("제목     : " + todo.getTitle());
        System.out.println("설명     : " + todo.getDescription());
        System.out.println("완료여부: " + todo.isDone());
        System.out.println("등록일   : " + todo.getRegDate());
        System.out.println("------------------------------------------");
        System.out.println();
    }
}
