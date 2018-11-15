package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args){
        //用arraylist存储编程语言的名称，并且输出
        List list = new ArrayList();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("Swift");
        //输出列表中的元素的个数
        System.out.println("列表中元素的个数为："+list.size());
        //遍历输出所有的编程语言
        System.out.println("****************************");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\n"+"****************************");
        System.out.println(list.get(3));
        list.remove(2);
        System.out.println("移除c++后的列表元素为");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("123456");
    }
}
