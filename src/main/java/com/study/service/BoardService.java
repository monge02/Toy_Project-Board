package com.study.service;

import com.study.domain.Board;
import com.study.repository.BoardRepository;
import com.study.repository.SearchCond;
import com.study.repository.UpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public Board save(Board board) {
        return boardRepository.save(board);
    }

    public void update(Long boardId, UpdateDto updateParam) {
        boardRepository.update(boardId, updateParam);
    }

    public Optional<Board> findById(Long id) {
        return boardRepository.findById(id);
    }

    public List<Board> findAll(SearchCond cond) {
        return boardRepository.findAll(cond);
    }

}
