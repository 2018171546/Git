package com.example.service;


import com.example.entity.User;

import java.util.List;

public interface UserService {

    // 新增用户
    boolean saveUser(User user);

    // 更改用户
    boolean updateUser(User user);

    // 删除用户
    boolean deleteUser(long id);

    // 根据用户名查询用户
    User getUser(String username);

    List<User> findsUser(String username);

    // 查询所有用户
    List<User> ListUsers();

}
