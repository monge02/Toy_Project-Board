package com.study.repository.mybatis;

import com.study.domain.Board;
import com.study.repository.BoardRepository;
import com.study.repository.SearchCond;
import com.study.repository.UpdateDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MybatisRepository implements BoardRepository {

    private final BoardMapper boardMapper;

    @Override
    public Board save(Board board) {
        log.info("boardMapper class={}", boardMapper.getClass());
        boardMapper.save(board);
        return board;
    }

    @Override
    public void update(Long id, UpdateDto updateParam) {
        boardMapper.update(id, updateParam);
    }

    @Override
    public Optional<Board> findById(Long id) {
        return boardMapper.findById(id);
    }

    @Override
    public List<Board> findAll(SearchCond cond) {
        return boardMapper.findAll(cond);
    }
}
