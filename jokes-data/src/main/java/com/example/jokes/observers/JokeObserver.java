package com.example.jokes.observers;

import com.example.jokes.model.User;

public interface JokeObserver {
    void update(String title, String content, User user);
}
