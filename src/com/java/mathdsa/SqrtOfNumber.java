package com.java.mathdsa;

public class SqrtOfNumber {
    public static void main(String[] args) {
        System.out.printf("%.3f",perfectSqrt(50));
        System.out.println();
        System.out.println(perfectSqrt(50));
    }




    static double perfectSqrt(int n){
        int s=0;
        int e=n;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid*mid==n)
                return mid;
            if(mid*mid > n)
                e=mid-1;
            else{
                s=mid+1;
            }
        }
        double root=0.0;
        double incr =0.1;
        for(int i=0;i<3;i++){
            while(root*root <=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
