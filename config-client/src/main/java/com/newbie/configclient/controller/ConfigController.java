package com.newbie.configclient.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    Log log = LogFactory.getLog(this.getClass());

    @Value("${foo}")
    String foo;

    @Value("${username}")
    String username;

    @Value("${title}")
    String title;

    @RequestMapping(value = "/config")
    public String getConfigInfo(){
        String message = "配置中心客户端，从服务端获取参数: ";
        message += " foo = "+foo;
        message += " ,username = "+username;
        message += " , title = "+title;
        log.info(message);
        return message;
    }

}
