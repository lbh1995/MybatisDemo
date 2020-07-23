package com.lbh.test.mybatis.controller;

import com.lbh.test.mybatis.Model.User;
import com.lbh.test.mybatis.service.UserService;
import com.lbh.test.mybatis.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserShow {
    @Autowired
    private UserService userService;
    @GetMapping("/getUser")
    public User getUser(){
        return userService.getUserByID(1);
    }
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
