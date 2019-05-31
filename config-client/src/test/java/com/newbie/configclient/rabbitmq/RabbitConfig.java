package com.newbie.configclient.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public final static String QUEUE_NAME = "hello";
    /**
     * 队列配置
     * @return
     */
    @Bean
    public Queue Queue(){
        return new Queue("hello");
    }
}
