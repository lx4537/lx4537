package com.imooc.string;

public class StringDemo3 {
    public static void main(String[] args){
        //== 和equals方法的区别
        //定义三个字符串，内容都是imooc
        String str1="imooc";
        String str2="imooc";
        String str3= new String("imooc");
        System.out.println("str1和str2内容是否相同？"+str1.equals(str2));
        System.out.println("str2和str3内容是否相同？"+str2.equals(str3));
        System.out.println("str1和str2地址是否相同？"+(str1==str2));
        System.out.println("str2和str3地址是否相同？"+(str2==str3));

    }
}
