package com.zhangxy.sharding.service;

import com.zhangxy.sharding.entity.User;

import java.util.List;

/**
 * 用户接口
 */
public interface UserService {
    public boolean insert(User u);

    public List<User> findAll();

    public List<User> findByUserIds(List<Integer> ids);

    public void transactionTestSucess();

    public void transactionTestFailure() throws IllegalAccessException;

}
