package com.java.mathdsa;

public class NewtonRaphson {
    public static void main(String[] args){
        double sqrt = sqrt(40);
        System.out.printf("%.4f",sqrt);
        System.out.println();
        System.out.printf("%.4f",SqrtOfNumber.perfectSqrt(40));


    }
    static double sqrt(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }

        return root;
    }
}
