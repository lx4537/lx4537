package com.imooc.string;

import java.io.UnsupportedEncodingException;

public class StringDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符串和byte数组之间的相互转换
        //定义一个字符串
        String str=new String("JAVA编程");
            byte[] arrs=str.getBytes("GBK");
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i] + " ");
        }
        String str1=new String(arrs,"GBK");
        System.out.println(str1);
    }
}
