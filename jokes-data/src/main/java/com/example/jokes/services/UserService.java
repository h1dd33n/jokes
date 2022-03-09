package com.example.jokes.services;

import com.example.jokes.model.User;
import com.example.jokes.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserService implements UserServiceImpl{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public User getUserbyId(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
//        return Optional.empty();
    }

    @Override
    public User getUserByFirstName(String firstName) {
        return userRepository.getUserByFirstName(firstName);
    }

    @Override
    public User getUserByLastName(String lastName) {
        return userRepository.getUserByLastName(lastName);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = getUserbyId(id);
        userRepository.delete(user);
    }
}
