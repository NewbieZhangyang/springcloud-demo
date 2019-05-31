package com.newbie.configclient;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.newbie.configclient.rabbitmq.HelloSender;

@SpringBootTest
@RunWith(SpringRunner.class)
@SuppressWarnings("all")
public class Application{
    Log log = LogFactory.getLog(this.getClass());
    @Autowired
    HelloSender helloSender;

    @Test
    public void testRabbitmq(){
        log.info("测试RabbitMQ，向队列\"hello\"插入一条消息");
        String content = "我是谁？你是一条新生产的消息。" ;
        helloSender.send(content);
    }
}