package com.java.search;

import java.util.Arrays;

public class RowColumnSortedSearch {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};


        System.out.println(Arrays.toString(search(array,7)));
        System.out.println(Arrays.toString(search(array,10)));
        System.out.println(Arrays.toString(search(array,13)));

    }
    static int[] search(int[][] array , int target){
        int row = 0;
        int col= array[0].length-1;
        while (row < array.length && col >= 0) {
            if(array[row][col]==target){
                return new int[]{row,col};
            }
            if(array[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
