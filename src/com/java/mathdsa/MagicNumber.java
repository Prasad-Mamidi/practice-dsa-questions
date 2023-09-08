package com.java.mathdsa;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(MagicNumber(6,5));
    }
    public static int MagicNumber(int n,int base){
        int ans =0;
        while(n>0){
            int last = n&1;
            n= n>>1;
            ans+=last*base;
            base = base*5;
        }
        return ans;
    }
}
