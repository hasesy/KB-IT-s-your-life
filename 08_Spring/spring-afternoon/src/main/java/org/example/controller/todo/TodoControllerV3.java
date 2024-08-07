package org.example.controller.todo;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequestMapping("/todo/v3")
public class TodoControllerV3 {
    private final TodoDtoListV2 todoDtoList;

    @Autowired
    public TodoControllerV3(TodoDtoListV2 todoDtoList) {
        this.todoDtoList = todoDtoList;
    }

    @GetMapping("/form")
    public String todoForm() {
        log.info("=========> 할 일 추가 페이지 호출, /todo/v3/form");
        return "todo-form3";
    }

    @PostMapping("/form/save")
    public String todoSave(@RequestParam("todo") String todo, Model model) {
        log.info("===========> 할 일 추가 Request 호출, /todo/v3/form/save");

        todoDtoList.addList(todo);

        model.addAttribute("todoList", todoDtoList.getList());

        return "todo-show3";
    }

    @GetMapping("/show")
    public String todoShow(Model model) {
        log.info("========> 할 일 목록 조회 페이지 호출, /todo/v3/show");

        model.addAttribute("memberList", todoDtoList.getList());
        return "todo-show3";
    }
}
