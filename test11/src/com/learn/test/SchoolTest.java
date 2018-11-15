package com.learn.test;

import com.learn.model.Student;
import com.learn.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        //测试subject
        Subject sub1=new Subject("计算机科学与应用","J0001",4);
        System.out.println(sub1.info());
        System.out.println("===============================");
        //测试student
        Student stu1=new Student("S01","张三","男",1);


        System.out.println(stu1.introduction());
    }
}
