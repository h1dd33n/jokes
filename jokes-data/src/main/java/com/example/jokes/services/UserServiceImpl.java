package com.example.jokes.services;

import com.example.jokes.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserServiceImpl {
    public List<User> getAll();

    public User getUserbyId(Long id);

//    @Query("Select u FROM User u WHERE u.firstName = :#{firstName}")
    public User getUserByFirstName(String firstName);

//    @Query("Select u FROM User u WHERE u.lastName = :#{lastName}")
    public User getUserByLastName(String lastName);

    public void addUser(User user);

    public void deleteUser(Long id);
}
