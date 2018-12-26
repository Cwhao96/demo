package com.example.demo.model;

public class Teacher {
    private Integer teacherId;

    private String  teacherName;

    private String teacherSex;

    private Integer teacherTel;

    public Integer getTeacherId(){
        return teacherId;
    }

    public void setTeacherId(Integer teacherId){
        this.teacherId= teacherId;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public void setTeacherName(String teacherName){
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String geTeacherSex(){
        return teacherSex;
    }

    public void setTeacherSex(String teacherSex) {
        this.teacherSex = teacherSex == null ? null : teacherSex.trim();
    }

    public Integer getTeacherTel(){
        return teacherTel;
    }

    public void setTeacherTel(Integer teacherTel){
        this.teacherTel = teacherTel;
    }
}
