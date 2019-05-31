package com.newbie.provideruser.controller;

import com.newbie.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.simple.SimpleDiscoveryProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;


@RestController
@RequestMapping("/user")
public class UserController {
    Log log = LogFactory.getLog(this.getClass());

    @RequestMapping("/getUserInfo")
    public String getUserInfo(User user, HttpServletRequest request){
        String message = "用户名：";
        if(user == null || user.getUsername() == null){
            message += "简小六";
        }else {
            message += user.getUsername();
        }
        String url = " 请求url = "+request.getRequestURL();
        log.info(message);
        log.info(url);
        Enumeration<String> enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()){
            String key = enumeration.nextElement();
            String value = request.getParameter(key);
            log.info("请求参数： key = "+key+" , value = "+value);
        }
        message += "  ,  "+url;
        return message;
    }
}
