package com.imooc.string;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

public class StringDemo0 {

    public static void main(String[] args) {
        //定义一个字符串
        String str="java学习基础";
        //打印字符串的长度
        int a=str.length();
        System.out.println(a);
        //打印出“学”字
        System.out.println(str.charAt(4));
        //取出子串练习
        System.out.println(str.substring(3));
        System.out.println(str.substring(5,6));

    }
}
