package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean saveUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUserById(user);
    }

    @Override
    public boolean deleteUser(long id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public User getUser(String username) {
        return userMapper.gerUserByUsername(username);
    }

    @Override
    public List<User> findsUser(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public List<User> ListUsers() {
        return userMapper.listUsersAll();
    }
}
