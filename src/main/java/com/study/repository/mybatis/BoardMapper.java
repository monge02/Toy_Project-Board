package com.study.repository.mybatis;

import com.study.domain.Board;
import com.study.repository.SearchCond;
import com.study.repository.UpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoardMapper {

    void save(Board board);

    void update(@Param("id") Long number, @Param("updateParam") UpdateDto updateParam);

    Optional<Board> findById(Long id);

    List<Board> findAll(SearchCond searchCond);
}
