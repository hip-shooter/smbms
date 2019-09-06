package com.githup.mybatis.dao;

import com.githup.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /*
    * 查询所有用户
    * */
    List<User> findUser();

    User findUserByUserName(String name);
    //根据角色ID和用户名查询用户
    User findUserByUserNameAndUserRole(User user);
    //根据map集合信息查询用户信息
    User findUserByMap(Map<String, Object> map);
    /*
    注解param 就可以注入到
     */
    User findUserByUserNameAndUserRole1(@Param("userName") String name, @Param("userRole")int role);
}
