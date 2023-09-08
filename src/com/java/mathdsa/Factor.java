package com.java.mathdsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Factor {
    public static void main(String[] args) {
         factor1(36);
        System.out.println();
        factor2(36);
    }
    static void factor1(int n){
        for(int index=1;index<=n;index++){
            if(n%index==0){
                System.out.print(index+" ");
            }
        }
    }
    static void factor2(int n){
        List<Integer> list = new ArrayList<Integer>();
        for(int index=1;index*index<=n;index++){
            if(n%index==0){
                if(index==n/index)
                    System.out.print(index+" ");
                else{
                    System.out.print(index+" ");
                    list.add(n/index);
                }

            }
        }
        ListIterator<Integer> itr =list.listIterator(list.size());
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }

    }
}
