package com.example.demo.service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public User findUserByName(String name){
        return userRepository.findByName(name);
    }

    @Override
    public User saveUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public String deleteUser(Long id) {
        if(userRepository.findById(id) != null){
            userRepository.deleteById(id);
            return "OK";
        }
        return "Error, el id no existe";
    }

    @Override
    public String updateUser(User user) {
        if(userRepository.findById(user.getId()) != null){
            userRepository.save(user);
            return "OK";
        }
        return "Error, el id no existe";
    }
}
