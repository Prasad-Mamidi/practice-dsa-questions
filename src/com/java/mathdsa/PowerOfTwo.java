package com.java.mathdsa;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerTwo(24));
        System.out.println(isPowerTwo(25));
        System.out.println(isPowerTwo(2));
        System.out.println(isPowerTwo(0));
        System.out.println(isPowerTwo(1));
    }
    static boolean isPowerTwo(int n){
        if(n==0)
            return false;
        return ((n & (n-1))==0)?true:false;
    }
}
