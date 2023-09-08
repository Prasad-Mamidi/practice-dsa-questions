package com.java.search;
import java.util.*;
public class SortedTwoDSearch {
    public static void main(String[] args) {
        int[][] array ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        //int[] indexes=searchArray(array,10);
        int[] indexes=searchArray(array,3);

        System.out.println(Arrays.toString(indexes));
       // System.out.println(searchArray(array,3));
    }
    static int[] searchArray(int[][] array, int target){
        int row=array.length;
        int col = array[0].length;
        int left = 0;
        int right = row*col-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int mid_row =mid/col;
            int mid_col = mid%col;
            int arrayMid=array[mid_row][mid_col];
            if(target < arrayMid){
                right = mid -1;
            }
            else if(target > arrayMid){
                left = mid+1;
            }
            else{
                return new int[]{mid_row,mid_col};
            }
        }
        return new int[]{-1,-1};
    }
}
