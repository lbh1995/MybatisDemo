package com.lbh.test.mybatis.dao;

import com.lbh.test.mybatis.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUser();

    User getUserByID(int id);
}
