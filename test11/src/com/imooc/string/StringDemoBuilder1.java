package com.imooc.string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringDemoBuilder1 {
    public static void main(String[] args){
        //定义一个字符串
        StringBuilder str=new StringBuilder("你好");
        //在你好后面添加内容，使其变成”你好，imooc！“
        //str.append("，");
        //str.append("imooc！");
        //System.out.println("str="+str);
        System.out.println("str="+str.append(",").append("imooc!"));

        //将字符串变成"你好,iMOOC!"
        //两种方式：
        //1.删除mooc，插入MOOC
        //System.out.println("第一种方式替换后："+str.delete(4,8).insert(4,"MOOC"));
        //直接代替mooc
        System.out.println("第二种方式替换后："+str.replace(4,8,("MOOC")));
    }
}
