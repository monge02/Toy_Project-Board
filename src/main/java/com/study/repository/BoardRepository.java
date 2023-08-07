package com.study.repository;

import com.study.domain.Board;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {

    Board save(Board board);

    void update(Long id, UpdateDto updateParam);

    Optional<Board> findById(Long id);

    List<Board> findAll(SearchCond cond);
}
