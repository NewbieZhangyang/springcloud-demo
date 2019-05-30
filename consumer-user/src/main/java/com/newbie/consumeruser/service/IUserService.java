package com.newbie.consumeruser.service;

import com.newbie.domain.User;

public interface IUserService {
    String getUserInfo(User user);
    String fallback(User user);
}
