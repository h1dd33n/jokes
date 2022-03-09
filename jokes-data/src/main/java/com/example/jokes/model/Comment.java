package com.example.jokes.model;

import java.time.LocalDate;

public class Comment extends BaseEntity{
    private String content;
    private LocalDate dateAdded;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
}
