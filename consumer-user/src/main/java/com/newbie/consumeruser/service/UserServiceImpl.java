package com.newbie.consumeruser.service;

import com.newbie.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements IUserService{
    Log log = LogFactory.getLog(this.getClass());

    @Autowired
    RestTemplate restTemplate;

    String providerPath = "http://provider-user";

    /**
     * 作为服务消费者，去调用provider-user提供的服务接口
     * @param user
     * @return
     */
    @Override
    public String getUserInfo(User user) {
        String url = this.providerPath + "/user/getUserInfo";
        if(user != null){
            url += "?username="+user.getUsername();
        }
        String result = restTemplate.getForObject(url.toString(),String.class);
        log.info("getUserInfo()------,调用provider-user提供的服务接口");
        log.info("---------请求地址："+url);
        log.info("---------返回结果："+result);
        return result;
    }
}
