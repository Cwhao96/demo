package com.example.demo.service;

import com.example.demo.model.Teacher;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
public interface TeacherService {

    int addTeacher(Teacher teacher);

    List<Teacher> findAllTeacher(int pageNum, int pageSize);

    Object findALLTeacherService(int pageNum, int pageSize);
}
