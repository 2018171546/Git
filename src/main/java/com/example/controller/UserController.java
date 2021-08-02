package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/do/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        System.out.println("新增数据：");
        if(user.getId()==0||user.getPassword()==""||user.getUsername()==""||user.getEmail()==""){
            return false;
        }
        User userMysql = userService.getUser(user.getUsername());
        if(userMysql!=null){
            return false;
        }
        return userService.saveUser(user);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public boolean updateUser(@RequestBody User user){
        System.out.println("更新数据：");
        if(user.getId()==0||user.getPassword()==""||user.getUsername()==""||user.getEmail()==""){
            return false;
        }
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public boolean deleteUser(@RequestBody User user){
        System.out.println("删除数据：");
        return userService.deleteUser(user.getId());
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public List<User> findUser(@RequestBody User user){
        System.out.println("查找数据：");
        System.out.println(user.getUsername());
        String username = "%"+user.getUsername()+"%";
        return userService.findsUser(username);
    }

    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<User> finAllUser(){
        System.out.println("查找所有数据：");
        return userService.ListUsers();
    }
}
