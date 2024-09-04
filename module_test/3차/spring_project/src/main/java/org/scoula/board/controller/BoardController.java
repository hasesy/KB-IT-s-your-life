package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    //@RequiredArgsConstructor 어노테이션이 생성자를 만들어주고 final로 선언된 변수에 자동주입됨.
    final private BoardService service;

    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("list", service.getList());
    }

    @GetMapping("/create")
    public void create(){
    }

    @PostMapping("/create")
    public String create(BoardVO board) {
        service.create(board);
        return "redirect:/";
    }

    /*
     *
     * 문제 3번 : get요청을 처리할 수 있는 메서드 정의
     *           webapp/WEB-INF/views/get.jsp에 모델 속성 정보를 출력해야함.
     * */

    @GetMapping("/get")
    public void get(@RequestParam("no") Long no, Model model) {
        BoardVO board = service.get(no);
        model.addAttribute("board", board);
    }


    @GetMapping("/update")
    public void update(@RequestParam("no") Long no, Model model) {
        model.addAttribute("board", service.get(no));
    }

    @PostMapping("/update")
    public String update(BoardVO board) {
        service.update(board);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("no") Long no) {
        service.delete(no);
        return "redirect:/";
    }
}
