package com.imooc.method;

public class Cat {
    private String name;
    private int age;
    public static int price;
    //创建get set方法
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return "我是一只叫"+this.name+"的臭弟弟";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0){
            this.age = age;
        }else{
            System.out.println("输入的年龄有误！");
        }

    }
}
