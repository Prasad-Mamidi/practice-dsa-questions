package com.java.mathdsa;

public class xorInRage {
    public static void main(String[] args) {

        System.out.println(findXor(3));
        System.out.println(findXor(9));
        System.out.println(findXorInCertainRange(3,9));
    }

    static int findXor(int n){
        int status = n%4;
       int value= switch(status){
//            case 0 -> System.out.println(n);
//            case 1 -> System.out.println(1);
//            case 2 -> System.out.println(n+1);
//            default ->System.out.println(n); 
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n+1;
            default ->0;
       };
       return value;
    }
    static int findXorInCertainRange(int start,int end){
        return findXor(end)^findXor(start-1);
    }
}
