package com.java.mathdsa;

public class HcfAndLcm {
    public static void main(String[] args) {
        System.out.println(gcd(12,24));
//        System.out.println(lcm(40,100));
    }
    static int gcd(int num1,int num2){
        if(num1==0)
            return num2;
        return gcd(num2%num1,num1);
    }
    static int lcm(int num1,int num2){
        return num1*num2/gcd(num1,num2);
    }
}
