package com.learn.model;

public class Subject {
    //成员属性：学科名称 学科标号 学制年限
    private String subjectName;
    private String subjectNo;
    private int subjectLife;

    public Subject(){

    }

    //带参构造当中实现对属性的全部赋值
    public Subject(String subjectName,String subjectNo,int subjectLife){
        this.SetSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    public  void SetSubjectName(String subjectName){
        this.subjectName=subjectName;
    }
    public String getSubjectName() {
        return this.subjectName;
    }
    public String getSubjectNo() {
        return subjectNo;
    }
    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }
    public int getSubjectLife() {
        return subjectLife;
    }
    public void setSubjectLife(int subjectLife) {
        if(subjectLife>0)
            this.subjectLife = subjectLife;
        else
            System.out.println("输入的学制年限有误！");
    }

    public String info(){
        String str ="专业信息如下：\n专业名称："+this.getSubjectName()+"\n专业编号:"+this.getSubjectNo()+"\n专业学制年限:"+this.getSubjectLife();
        return str;
    }
}
