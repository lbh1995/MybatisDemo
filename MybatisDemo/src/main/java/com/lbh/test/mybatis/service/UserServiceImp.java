package com.lbh.test.mybatis.service;

import com.lbh.test.mybatis.Model.User;
import com.lbh.test.mybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getUserByID(int id){
        return userMapper.getUserByID(id);
    }
}
