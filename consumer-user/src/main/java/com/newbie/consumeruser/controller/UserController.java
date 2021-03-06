package com.newbie.consumeruser.controller;

import com.netflix.discovery.converters.Auto;
import com.newbie.consumeruser.service.IUserService;
import com.newbie.consumeruser.service.UserServiceImpl;
import com.newbie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/user")
    public String getUserInfo(User user){
        String message = "我是Consumer-user项目：";
        return message + userService.getUserInfo(user);
    }
}
