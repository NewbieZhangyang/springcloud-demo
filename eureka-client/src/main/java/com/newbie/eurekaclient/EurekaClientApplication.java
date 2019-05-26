package com.newbie.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 向Eureka Server注册（暴露）服务接口
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {
    @Value("${server.port}")
    String port;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
