package com.java.recursion;

public class numPrint {

    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
