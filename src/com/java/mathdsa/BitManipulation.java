package com.java.mathdsa;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BitManipulation {
    public static void main(String[] args) {
//        System.out.println(countSetBits(14));
        System.out.println(negativeOfNumber(6));
        System.out.println(Integer.toBinaryString(negativeOfNumber(6)));
    }


    static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n&1)==1)
                count++;
            n=n>>1;
        }
        return count;
    }

   public static int lengthBit(int n,int b){
       return (int)(Math.log(n)/Math.log(b))+1;
    }
    public static String EvenOrOdd(int n){
        return (n&1)==1?"Odd":"Even";
    }
    public static int findBit(int n,int i){
        return (n&(1<<(i-1)))!=0?1:0;
    }
    public static int setBit(int n,int i){
        return n|(1<<(i-1));
    }
    public static int resetBit(int n,int i){
        return n&(~(1<<(i-1)));
    }
    public static int negativeOfNumber(int n){
        return ~(n)+1;
    }
    public static  int singleExist(int... arr){
       Map<Integer , Integer > map = new HashMap<Integer,Integer>();
       for(int num: arr){
           if(map.containsKey(num)){
               map.put(num,map.get(num)+1);
           }
           else{
               map.put(num,1);
           }
       }
        System.out.println(map);
//       Set<Map.Entry<Integer,Integer>> set=map.entrySet();
       Set<Integer> set= map.keySet();
       for(int i:set){
           if(map.get(i)==1)
               return i;
       }
       return -1;
    }
    public static int pascalRowSum(int n){
        return 1<<(n-1);
    }
}
