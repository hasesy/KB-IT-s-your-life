package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.MemberDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class MemberShowContollerV1 {
    private MemberDtoListV1 memberList = MemberDtoListV1.getInstance(); // 싱글톤 패턴을 위한 코드

    @GetMapping("/member/show")
    public String process(HttpServletRequest request, HttpServletResponse response) {
        log.info("========> 회원 목록 조회 페이지 호출, /member/show");

        request.setAttribute("memberList", memberList.getList());
        return "member-show";
    }
}
