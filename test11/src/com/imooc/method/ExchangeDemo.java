package com.imooc.method;

public class ExchangeDemo {
    public void Exchange(int a,int b){
        int temp;
        System.out.println("交换前：a="+a+",b="+b);
        temp=a;a=b;b=temp;
        System.out.println("交换后：a="+a+",b="+b);
    }
    public void Exchangetest(){
        int m=1,n=6;
        System.out.println("交换前：m="+m+",n="+n);
        Exchange(m,n);
        System.out.println("交换后：m="+m+",n="+n);
    }
    public static void main(String[] args) {
        ExchangeDemo ed=new ExchangeDemo();
       ed.Exchangetest();
    }
}
