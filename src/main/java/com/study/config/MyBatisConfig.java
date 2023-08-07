package com.study.config;

import com.study.repository.BoardRepository;
import com.study.repository.mybatis.BoardMapper;
import com.study.repository.mybatis.MybatisRepository;
import com.study.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final BoardMapper boardMapper;

    @Bean
    public BoardService boardService() {
        return new BoardService(boardRepository());
    }

    @Bean
    public BoardRepository boardRepository() {
        return new MybatisRepository(boardMapper);
    }
}
