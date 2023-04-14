package com.example.springsecurityjwt.service.impl;

import com.example.springsecurityjwt.entity.User;
import com.example.springsecurityjwt.enums.Role;
import com.example.springsecurityjwt.exception.ServiceException;
import com.example.springsecurityjwt.repository.UserRepository;
import com.example.springsecurityjwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class userServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        user.setRole(Role.USER);
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        Optional<User> opt = findById(id);
        if (opt.isEmpty()) {
            throw new ServiceException("The User is not found");
        }
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
