package com.java.mathdsa;
 import java.util.*;
public class ShiftOperator {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(1<<(n-1));
        System.out.println(leftShift(n));
        System.out.println(rightShift(n));
    }
    // This left function will double the value
    public static int leftShift(int n){
        return n << 1;
    }
//    this rightShift will divide the value by 2
    public static int rightShift(int n){
        return n >>1;
    }
}
