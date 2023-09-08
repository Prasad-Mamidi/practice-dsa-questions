package com.java.mathdsa;

public class PowerOfAny {

    public static void main(String[] args) {
        System.out.println(pow(3,6));
    }
    public static int pow(int base,int expo){
        int ans=1;
        while(expo >0){
            if((expo&1)==1) {
                ans*=base;
            }
            base *= base;
            expo = expo >>1;
        }
        return ans;
    }
}
