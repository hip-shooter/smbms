package com.githup.mybatis.dao;

import com.githup.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /*
    * 查询所有用户
    * */
    List<User> findUser();

    User findUserByUserName(String name);
}
