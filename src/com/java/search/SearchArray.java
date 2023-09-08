package com.java.search;

import java.util.Scanner;

public class SearchArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the size of an array");
        int size= scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter"+i+"th element:");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the element to search");
        int element = scanner.nextInt();
        // first (index)
       int index= linearSearch(arr,element);
       System.out.println(index);
       // second (value)
        int ele = linearSearch2(arr,element);
        System.out.println(ele);
        //three (index b/w range)
        int ind = linearSearch3(arr,element);
        System.out.println(ind);
        
    }

    // search & returns the index of an array element
    static int linearSearch(int[] arr,int element){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]==element){
                return index;
            }
        }
        
        return -1;
    }
    // finds whether the element is there are not & returns the element
    static int linearSearch2(int[] arr,int element){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]==element){
                return element;
            }
        }

        return -1;
    }
    // finds the index of an element with in the range of start & end points
    static int linearSearch3(int[] arr,int element){
        System.out.println("Enter  the start and end index");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if(arr.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            if(arr[index]==element){
                return element;
            }
        }

        return -1;
    }
    
}
