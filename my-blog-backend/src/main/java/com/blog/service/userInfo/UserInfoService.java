package com.blog.service.userInfo;

import com.blog.entity.UserInfo;

import java.util.Optional;

public interface UserInfoService {
    UserInfo getAll();
    UserInfo getUserInfo(String id);
    UserInfo findByMobileNumber(String number);

}
