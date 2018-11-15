package com.learn.model;

public class Student {
    //成员属性：学号 姓名 性别 年龄
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;

    public Student() {

    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName) ;
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if((studentAge>100)||(studentAge<10)) {
            System.out.println("输入的年龄有误！");
        }else{
            this.studentAge = studentAge;
        }
    }
    public String introduction(){
        String str="学生信息如下：\n学号："+getStudentNo()+"\n姓名："+getStudentName()+"\n性别："+getStudentSex()+"\n年龄："+getStudentAge();
        return str;
    }
}
