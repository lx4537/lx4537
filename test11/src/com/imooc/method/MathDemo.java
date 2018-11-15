package com.imooc.method;

public class MathDemo {
    public int plus(int m,int n){
        return m+n;
    }
    public double plus(double m,double n){
        return m+n;
    }
    public int plus(int[] arr){
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MathDemo a=new MathDemo();
        int m=20,n=30;
        int[] arr={1,2,3,4,5};
        System.out.println(a.plus(m,n));
        System.out.println(a.plus(5.3,2.3));
        System.out.println(a.plus(arr));
    }
}
