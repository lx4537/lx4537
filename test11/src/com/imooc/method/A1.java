package com.imooc.method;

public class A1 {
    public int area(){
        int length=10;
        int width=20;
        int area=length*width;
        return area;
    }
    public static void main(String[] args) {
        A1 a=new A1();
        a.area();
        System.out.println("面积："+a.area());
    }
}
