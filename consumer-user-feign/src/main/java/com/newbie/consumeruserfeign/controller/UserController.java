package com.newbie.consumeruserfeign.controller;

import com.newbie.consumeruserfeign.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.newbie.domain.User;

@RestController
@SuppressWarnings("all")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/feign/user/get",method = RequestMethod.GET)
    public String getUserInfo(User user){
        return userService.getUserInfo(user);

    }

}
