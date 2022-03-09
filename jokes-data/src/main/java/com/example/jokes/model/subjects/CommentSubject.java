package com.example.jokes.model.subjects;

import com.example.jokes.observers.CommentObserver;

public interface CommentSubject {
    void registerObserver(CommentObserver o);
    void removeObserver(CommentObserver o);
    void notifyObservers();
}
