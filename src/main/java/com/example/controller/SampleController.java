//package com.example.controller;
//
//import com.example.entity.User;
//import com.example.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@EnableAutoConfiguration
//public class SampleController {
//
//    @Autowired
//    private UserService userService;
//    @RequestMapping("/")
//    @ResponseBody
//    //@RequestMapping(value = "/userAll", method = RequestMethod.GET)
//    public List<User> finAllUser(){
//        System.out.println("查找所有数据：");
//        return userService.ListUsers();
//    }
//
////    public static void main(String[] args) throws Exception {
////        SpringApplication.run(SampleController.class, args);
////    }
//}
