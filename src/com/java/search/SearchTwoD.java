package com.java.search;

import java.util.Arrays;

public class SearchTwoD {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5},
                {-11,44,0,-1},
                {5,10,20,25,30}
        };
       for(int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("--------");
        int[] start=linearSearch1(arr,44);
        System.out.println(Arrays.toString(start));
        System.out.println("--------");
        int element =linearSearch2(arr,44);
        System.out.println(element);
        int max = max(arr);
        System.out.println(max);
        int min = min(arr);
        System.out.println(min);
    }



    private static int[] linearSearch1(int[][] arr, int i) {
        if(arr.length==0) {
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==i){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int linearSearch2(int[][] arr, int i) {
        if(arr.length==0) {
            return -1;
        }
        for(int[] array1 : arr){
            for(int ele:array1){
                 if(ele==i){
                     return ele;
                 }
            }
        }
        return -1;
    }


    // to find the max element in array
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] array1: arr){
            for(int value:array1){
                if(value>max){
                    max =value;
                }
            }
        }
        return max;
    }

    // to find min element in 2D array
    private static int min(int[][] arr) {
        int min=Integer.MAX_VALUE;
        for(int[] array1:arr){
            for(int value:array1){
                if(value < min){
                    min=value;
                }
            }
        }
        return min;
    }

}
