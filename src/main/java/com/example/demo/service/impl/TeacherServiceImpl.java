package com.example.demo.service.impl;


import com.example.demo.mapper.TeacherMapper;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "TeacherService")
public class TeacherServiceImpl implements TeacherService {


    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public int addTeacher(Teacher teacher) {

        return teacherMapper.insertSelective(teacher);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<Teacher> findAllTeacher(int pageNum, int pageSize) {
        return teacherMapper.selectAllTeacher();
    }

    @Override
    public Object findALLTeacherService(int pageNum, int pageSize) {
        return teacherMapper.selectAllTeacher();
    }
}
