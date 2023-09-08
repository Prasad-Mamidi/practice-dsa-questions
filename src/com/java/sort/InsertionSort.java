package com.java.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {-5, -2, -9, -1, -7};
        insertionSort1(arr1);
        System.out.println(Arrays.toString(arr1));
        insertionSort2(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    // The first approach is for ascending order
    static void insertionSort1(int[] arr1){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr1[j] < arr1[j-1]){
                    swap(arr1,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    // this approach is for descending order
    static void insertionSort2(int[] arr1){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr1[j] > arr1[j-1]){
                    swap(arr1,j-1,j);
                }
                else{
                    break;
                }
            }
        }

    }
    static void swap(int[] arr1,int previous , int current){
        int temp = arr1[previous];
        arr1[previous]=arr1[current];
        arr1[current]=temp;
    }
}
