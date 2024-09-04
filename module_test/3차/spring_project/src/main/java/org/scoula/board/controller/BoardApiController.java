package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
@Slf4j
public class BoardApiController {

    //@RequiredArgsConstructor 어노테이션이 생성자를 만들어주고 
    //final로 선언된 변수에자동주입됨.
    private final BoardService service;

    /**
     *
     * 문제 4번 : 게시판 전체 목록을 검색해서
     *            json array로 전송할 수 있는
     *            컨트롤러 메서드 코드 구현
     */

    @GetMapping("/list")
    public ResponseEntity<List<BoardVO>> list() {
        return ResponseEntity.ok(service.getList());
    }

    /**
     *
     * 문제 5번 : 주소에 포함된 no파라메터 값을 추출하여
     *           no의 값을 조건으로 db로 부터 검색해온
     *           게시판 상세정보를 json로 전송할 수 있는
     *           컨트롤러 메서드 코드 구현
     */

    @GetMapping("/{no}")
    public ResponseEntity<BoardVO> get(@PathVariable("no") Long no) {
        return ResponseEntity.ok(service.get(no));
    }
}
