package com.lbh.test.mybatis.service;

import com.lbh.test.mybatis.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getUserByID(int id);
}
