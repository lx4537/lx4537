package com.imooc.string;

public class StringDemo1 {
    public  static void main(String[] args) {
        String str = new String("qwertyuiopasdfghjklzxcvbnmabcdefg");
        //查找字符“a”在字符串中第一次出现的位置
        System.out.println(str.indexOf("a"));
        //查找字符“a”在字符串中最后一次出现的位置
        System.out.println(str.lastIndexOf("d"));
        //在字符串中index值是8的位置开始，查找子串"a"第一次出现的位置
        System.out.println(str.indexOf("a",11));
    }
}
