package com.example.demo.controller;


import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/teacher")
public class TeacherController{
    @Autowired
    private TeacherService teacherService;
    @ResponseBody

    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addTeacher(Teacher teacher){

        return teacherService.addTeacher(teacher);

    }
    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllTeacher(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return teacherService.findALLTeacherService(pageNum,pageSize);
    }

}


