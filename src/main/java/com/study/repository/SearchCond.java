package com.study.repository;

import lombok.Data;

@Data
public class SearchCond {

    private String userName;
    private String title;

    public SearchCond() {
    }

    public SearchCond(String userName, String title) {
        this.userName = userName;
        this.title = title;
    }
}
