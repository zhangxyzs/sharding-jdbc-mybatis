package com.zhangxy.sharding.mapper;

import com.zhangxy.sharding.entity.User;

import java.util.List;

/**
 * User 数据库接口类
 *
 * @author zhangxy
 * @date 2019/03/01
 **/
public interface UserMapper {
    Integer insert(User u);

    List<User> findAll();

    List<User> findByUserIds(List<Integer> userIds);
}
