package com.study.domain;

import lombok.Data;

@Data
public class Board {

    private Long id;

    private String userName;
    private String title;
    private String content;

    public Board() {
    }

    public Board(String userName, String title, String content) {
        this.userName = userName;
        this.title = title;
        this.content = content;
    }
}
