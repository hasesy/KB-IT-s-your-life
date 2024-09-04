package org.scoula.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Log4j
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardMapper mapper;

    @Override
    public List<BoardVO> getList() {
        return mapper.getList();
    }

    @Override
    public BoardVO get(Long no) {
        return mapper.get(no);
    }

    @Override
    public void create(BoardVO board) {
        mapper.create(board);
    }

    @Override
    public BoardVO update(BoardVO board) {
        mapper.update(board);
        return get(board.getNo());
    }

    @Override
    public BoardVO delete(Long no) {
        BoardVO board = get(no);
        mapper.delete(no);
        return board;
    }

}
