package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//迭代器的使用
public class WordDemo {
    public static void main(String[] args){
        Set set =new HashSet();
        set.add("blue");
        set.add("red");
        set.add("white");
        set.add("yellow");
        set.add("black");
        System.out.println("集合里面的元素：");
        //在集合里面插入一个新的单词；插入相同的元素不会报错但是系统直接忽略这次插入
        set.add("red1");
        Iterator it =set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
