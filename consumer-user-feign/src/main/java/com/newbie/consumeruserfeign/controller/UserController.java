package com.newbie.consumeruserfeign.controller;

import com.newbie.consumeruserfeign.service.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.newbie.domain.User;

@RestController
@SuppressWarnings("all")
public class UserController {

    Log log = LogFactory.getLog(this.getClass());

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUserInfo(User user){
        log.info("服务消费者：UserController.getUserInfo(user)");
        if(user != null){
            log.info("接收参数：username = "+user.getUsername());
        }
        String message = "我是Consumer-user-feign项目：";
        return message + userService.getUserInfo(user);

    }

}
