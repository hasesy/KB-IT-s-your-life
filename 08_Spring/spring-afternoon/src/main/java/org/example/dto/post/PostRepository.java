package org.example.dto.post;

import lombok.RequiredArgsConstructor;
import org.example.mapper.PostMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepository {
    private final PostMapper postMapper;

    // 게시글 전체 조회
    public List<PostDto> findAll() {
        return postMapper.findAll();
    }

    // 게시글 조건 조회
    public List<PostDto> findByCondition(String title, String content) {
        return postMapper.findByCondition(title, content);
    }

    // 게시글 삭제
    public int delete(Long id) {
        return postMapper.delete(id);
    }

    // 게시글 추가
    public int save(String title, String content) {
        return postMapper.save(title, content);
    }
}
