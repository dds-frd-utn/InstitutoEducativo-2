package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/users",method = RequestMethod.GET, produces = "application/json")
    public List<User> getUser(){
        return userService.findAllUser();
    }

    @RequestMapping(value="/users/{id}",method = RequestMethod.GET, produces = "application/json")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @RequestMapping(value="/users",method = RequestMethod.POST, produces = "application/json")
    public User addUser(User User){
        return userService.saveUser(User);
    }

    @RequestMapping(value="/users",method = RequestMethod.PUT, produces = "application/json")
    public String updateUser(User User){
        return userService.updateUser(User);
    }

}
