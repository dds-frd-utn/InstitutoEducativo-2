package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> findAllUser();

    public Optional<User> findUserById(Long id);

    public User saveUser(User newUser);

    public String deleteUser(Long id);

    public String updateUser(User user);

}
