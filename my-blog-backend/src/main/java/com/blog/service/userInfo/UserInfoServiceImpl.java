package com.blog.service.userInfo;

import com.blog.entity.UserInfo;
import com.blog.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    private final UserInfoRepository repository;

    public UserInfoServiceImpl(UserInfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserInfo getAll() {
        return null;
    }

    @Override
    public UserInfo getUserInfo(String id) {
        return null;
    }

    @Override
    public UserInfo findByMobileNumber(String number) {
        return null;
    }

}
