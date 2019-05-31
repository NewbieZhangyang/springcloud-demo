package com.newbie.configclient.rabbitmq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {
    Log log = LogFactory.getLog(this.getClass());

    /**
     * 接收"hello"队列中的消息
     * @param hello
     */
    @RabbitHandler
    public void process(String hello){

        log.info("接收到一条消息：Receiver = "+hello);
    }


}
