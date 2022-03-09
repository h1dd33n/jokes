package com.example.jokes.model.subjects;

import com.example.jokes.observers.JokeObserver;

public interface JokeSubject {
    void registerObserver(JokeObserver o);
    void removeObserver(JokeObserver o);
    void notifyObservers();
}
