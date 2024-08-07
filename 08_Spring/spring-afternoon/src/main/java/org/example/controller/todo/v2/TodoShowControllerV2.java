package org.example.controller.todo.v2;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.TodoDtoListV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class TodoShowControllerV2 {
    private TodoDtoListV2 todoDtoList;

    @Autowired
    public TodoShowControllerV2(TodoDtoListV2 todoDtoList) {
        this.todoDtoList = todoDtoList;
    }

    @GetMapping("/todo/v2/show")
    public String todoShow(HttpServletRequest request, Model model) {
        log.info("========> 할 일 목록 조회 페이지 호출, " + request.getRequestURI());

        model.addAttribute("memberList", todoDtoList.getList());
        return "todo-show2";
    }
}
