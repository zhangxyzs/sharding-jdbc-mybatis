package com.zhangxy.sharding.mapper;

import com.zhangxy.sharding.entity.Student;

import java.util.List;

/**
 * Student 数据库接口
 *
 * @author zhangxy
 * @date 2019/03/01
 **/
public interface StudentMapper {
    Integer insert(Student s);

    List<Student> findAll();

    List<Student> findByStudentIds(List<Integer> studentIds);
}
