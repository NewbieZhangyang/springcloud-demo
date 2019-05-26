package com.newbie.eurekaclient.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 定义一个Controller类，以json格式进行响应
 */
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @RequestMapping("")
    public String helloWorld(@RequestParam(value = "name",defaultValue = "newbie")String name){
        String message = "Hello World. Welcome : "+name;
        return message;
    }

}
