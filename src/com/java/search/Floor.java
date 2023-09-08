package com.java.search;

import java.util.Scanner;

public class Floor {
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
        System.out.println(floor(arr,target));

    }
    static int floor(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target<arr[0]) {
            return -1;
        }
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return arr[mid];
                }
            }
            return arr[end];
        }
        else{
            while(start <= end){
                int mid= (start+end)/2;
                if(target < arr[mid]){
                    start = mid+1;
                }
                else if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    return arr[mid];
                }
            }
            return arr[start];
        }
    }
}
