package org.example.controller.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.post.PostDto;
import org.example.dto.post.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/post/v1")
public class PostController {
    private final PostRepository postRepository;
    private String context = "/post";

    // 게시글 목록 보기
    @GetMapping("/show")
    public String postList(HttpServletRequest request, Model model) {
        log.info("=========> 게시글 목록 페이지 호출, " + request.getRequestURI());

        List<PostDto> list = postRepository.findAll();
        model.addAttribute("postList", list);

        return context + "/post-show";
    }

    // 게시글 검색
    @GetMapping("/search")
    public String postSearch(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            HttpServletRequest request, Model model) {
        log.info("==============> 게시글 검색 기능 호출, " + request.getRequestURI());

        List<PostDto> searchedList = postRepository.findByCondition(title, content);

        model.addAttribute("postList", searchedList);

        return context + "/post-show";
    }

    // 게시글 삭제
    @PostMapping("/delete")
    public String postDelete(@RequestParam("id") String id,
                             HttpServletRequest request) {
        log.info("=================> 게시글 삭제 기능 호출, " + request.getRequestURI());

        long postId = Long.parseLong(id);
        int affectedRows = postRepository.delete(postId);

        if (affectedRows > 0) log.info("삭제 성공");

        return "redirect:/post/v1/show";
    }

    // 게시글 추가 페이지 요청
    @GetMapping("/new")
    public String postNew(HttpServletRequest request) {
        log.info("================> 게시글 추가 페이지 호출, " + request.getRequestURI());

        return context + "/post-new";
    }

    // 게시글 추가 기능 컨트롤러
    @PostMapping("/new")
    public String postSave(@RequestParam("title") String title,
                           @RequestParam("content") String content,
                           HttpServletRequest request) {
        log.info("=============> 게시글 추가 기능 호출, " + request.getRequestURI());

        postRepository.save(title, content);

        return "redirect:/post/v1/show";
    }

    // 게시글 수정 페이지 호출


    // 에러 강제 발생
    @GetMapping("/error")
    public String error(HttpServletRequest request) {
        log.info("=================> 강제 에러 발생, " + request.getRequestURI());

        throw new RuntimeException("의도적으로 발생시킨 예외");
    }
}
