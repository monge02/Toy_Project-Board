package com.study.repository;

import lombok.Data;

@Data
public class UpdateDto {

    private String title;
    private String content;

    public UpdateDto() {
    }

    public UpdateDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
