package org.scoula.board.service;

import org.scoula.board.domain.BoardVO;

import java.util.List;

public interface BoardService {
    List<BoardVO> getList();

    BoardVO get(Long no);

    void create(BoardVO board);

    BoardVO update(BoardVO board);

    BoardVO delete(Long no);
}
