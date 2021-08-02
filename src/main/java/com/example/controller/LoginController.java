package com.example.controller;

import com.example.common.CommonResult;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User userLogin){

        User userMysql = userService.getUser(userLogin.getUsername());

        CommonResult commonResult = new CommonResult();
        if(userMysql!=null) {
            if (userMysql.getPassword().equals(userLogin.getPassword())) {
                commonResult.setCode(200);
                commonResult.setData(userLogin.getUsername());
                commonResult.setMessage("登录成功");
                return commonResult;
            }
        }
        commonResult.setCode(404);
        commonResult.setData("测试");
        commonResult.setMessage("用户名或密码错误");
        return commonResult;
    }



}
