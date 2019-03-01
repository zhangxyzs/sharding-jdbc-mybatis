package com.zhangxy.sharding.service.impl;

import com.zhangxy.sharding.entity.Student;
import com.zhangxy.sharding.mapper.StudentMapper;
import com.zhangxy.sharding.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Student实现
 *
 * @author zhangxy
 * @date 2019/03/01
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    public StudentMapper studentMapper;

    public boolean insert(Student student) {
        return studentMapper.insert(student) > 0 ? true : false;
    }

}
