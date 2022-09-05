package com.cascade_save.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cascade_save.domain.User;
import com.cascade_save.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User tempUser) {
        return userRepository.save(tempUser);
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

}
