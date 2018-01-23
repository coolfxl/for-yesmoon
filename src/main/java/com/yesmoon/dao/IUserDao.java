package com.yesmoon.dao;

import java.util.List;

import com.yesmoon.pojo.User;

public interface IUserDao {
    List<User> findUsers();
}