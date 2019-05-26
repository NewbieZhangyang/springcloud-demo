package com.newbie.consumeruserfeign.service;

import com.newbie.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(value = "provider-user")
public interface IUserService {
    @RequestMapping(value = "/user/getUserInfo",method = RequestMethod.GET)
    String getUserInfo(User user);
}
