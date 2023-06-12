package com.blog.dao.userInfo;

import com.blog.entity.UserInfo;
import com.blog.repository.UserInfoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserInfoDaoImpl implements UserInfoDao {

    private final UserInfoRepository repository;

    public UserInfoDaoImpl(UserInfoRepository repository) {
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
