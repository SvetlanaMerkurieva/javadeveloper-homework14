package com.example.demo.entities;

import lombok.Getter;


@Getter
public class Note {
    private long id;
    private String title;
    private String content;

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note { " +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", content = '" + content + '\'' +
                '}';
    }
}
