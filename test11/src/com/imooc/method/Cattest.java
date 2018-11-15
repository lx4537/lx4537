package com.imooc.method;

public class Cattest {
    public static void main(String[] args) {
        Cat one =new Cat();
        one.setName("徐国钊");
        one.setAge(3);
        one.price=13;
        Cat.price=2000;
        //静态成员访问方式 对象.变量
        System.out.println(one.getName()+"卖屁股卖了"+one.price+"块钱");
        //System.out.println("年龄："+one.getAge()+"岁");
        //java的封装
    }
}
