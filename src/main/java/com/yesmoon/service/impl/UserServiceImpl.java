package com.yesmoon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yesmoon.dao.IUserDao;
import com.yesmoon.pojo.User;
import com.yesmoon.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findUsers() {
        List<User> users = userDao.findUsers();
        return users;
    }

}
