package com.imooc.method;

public class MaxDemo {
    public void max(float a,float b){//有参无返回值
        float max;
        if(a>b){
            max=a;
        }else {
            max=b;
        }
        System.out.println("两个数中最大值为："+max);
    }

    public static void main(String[] args) {
        MaxDemo maxdemo=new MaxDemo();
        int a=6,b=8;
        maxdemo.max(a,b);
        float m=9.6f,n=8.6f;
        maxdemo.max(m,n);
    }
}
