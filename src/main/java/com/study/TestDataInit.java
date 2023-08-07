package com.study;

import com.study.domain.Board;
import com.study.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

//@Slf4j
//@RequiredArgsConstructor
//public class TestDataInit {
//
//    private final BoardRepository boardRepository;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void initData() {
//        log.info("test data init");
//        boardRepository.save(new Board("test1", "test2", "test3"));
//    }
//}
