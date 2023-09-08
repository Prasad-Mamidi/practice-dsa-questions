package com.java.search;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int[] arr = new int[in.nextInt()];
        System.out.println("enter the elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the target element");
        int target = in.nextInt();
        System.out.println(ceilOfNum(arr,target));
    }
    static int ceilOfNum(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target > arr[end]){
            return -1;
        }
        boolean asc= arr[start]<arr[end];
        if(asc) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if(target > arr[mid]) {
                    start = mid + 1;
                }
                else{
                    return arr[mid];
                }
            }
            return arr[start];
        }
        else{
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if(target < arr[mid]) {
                    start = mid + 1;
                }
                else{
                    return arr[mid];
                }
            }
            return arr[end];
        }
    }
}
