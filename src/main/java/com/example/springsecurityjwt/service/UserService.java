package com.example.springsecurityjwt.service;

import com.example.springsecurityjwt.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);
    List<User> findAll();
    Optional<User> findById(Integer id);
    void deleteById(Integer id);
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
}
