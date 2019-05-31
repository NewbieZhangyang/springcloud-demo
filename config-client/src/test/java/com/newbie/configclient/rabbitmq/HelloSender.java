package com.newbie.configclient.rabbitmq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    Log log = LogFactory.getLog(this.getClass());

    //rabbitTemplate 是 Spring Boot 提供的默认实现
    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 生产一条消息，并加入到"hello"队列
     * @param content
     */
    public void send(String content){
        if (content == null || "".equals(content)) {
            content = "content is null";
        }
        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_NAME,content);
        log.info("生产一条消息：queue = "+RabbitConfig.QUEUE_NAME+" , content = "+content);
    }

}
