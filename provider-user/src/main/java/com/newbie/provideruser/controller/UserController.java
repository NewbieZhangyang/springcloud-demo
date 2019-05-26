package com.newbie.provideruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.simple.SimpleDiscoveryProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.newbie.provideruser.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUserInfo")
    public String getUserInfo(User user){
        String message = "用户名：";
        if(user == null || user.getUsername() == null){
            message += "简小六";
        }else {
            message += user.getUsername();
        }
        return message;
    }
}
