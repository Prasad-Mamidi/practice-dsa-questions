package com.java.recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibonanci1(10));
        System.out.println(fibonanci2(10));
    }
    static int fibonanci1(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonanci1(n-1)+fibonanci1(n-2);
    }
    static int fibonanci2(int n){
        return (int)(Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5));
//        return (int)Math.pow(1.6180,n);
    }
}
