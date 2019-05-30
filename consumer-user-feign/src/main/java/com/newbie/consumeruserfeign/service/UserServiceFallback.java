package com.newbie.consumeruserfeign.service;

import com.newbie.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallback implements IUserService {
    Log log = LogFactory.getLog(this.getClass());

    @Override
    public String getUserInfo(User user) {
        log.info("请求失败，进入熔断器处理");
        return "请求失败，使用断路器Hystrix熔断服务";
    }
}
