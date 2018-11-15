package com.imooc.method;

public class FacDemo {
    public int fac(int n) {
        int s=1;
        for(int i=1;i<=n;i++){
            s=s*i;
        }
        return s;
    }

    public static void main(String[] args) {
        FacDemo facdemo=new FacDemo();
        System.out.println("3的阶乘等于="+facdemo.fac(3));
        int sum=0;
        for(int i=1;i<=5;i++){
            int q =facdemo.fac(i);
            sum=sum+q;
        }
            System.out.println("1!+2!+3!+4!+5!="+sum);

    }
}
