package com.example.jokes.model;

import com.example.jokes.model.subjects.JokeSubject;
import com.example.jokes.observers.JokeObserver;

import java.util.ArrayList;
import java.util.List;

public class Joke extends BaseEntity implements JokeSubject {
    private List<JokeObserver> observers;
    private String title;
    private String content;
    private User author;

    public Joke() {
        this.observers = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public void registerObserver(JokeObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(JokeObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(JokeObserver observer : observers) {
            observer.update(title,content,author);
        }
    }
}
