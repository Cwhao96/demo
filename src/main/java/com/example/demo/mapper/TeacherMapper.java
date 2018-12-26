package com.example.demo.mapper;

import com.example.demo.model.Teacher;

import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacher_id);
    int insert(Teacher record);
    int insertSelective(Teacher record);
    Teacher selectByPrimaryKey(Integer teacher_id);
    int updateByPrimaryKeySelective(Teacher record);
    int updateByPrimaryKey(Teacher record);
    List<Teacher> selectAllTeacher();
}
