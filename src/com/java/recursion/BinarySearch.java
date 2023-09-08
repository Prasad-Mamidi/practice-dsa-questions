package com.java.recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1, 5 , 9 , 15 ,16,21,25};
        int start = 0;
        int end = arr.length-1;
        int index=search(arr,16,start,end);
        System.out.println(index);
    }
    static int search(int[] arr,int target,int start,int end){

        while(start <= end){
            int mid = (start+(end-start)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid] > target ){
                return search(arr,target,start,mid-1);
            }
            else{
                return search(arr,target,mid+1,end);
            }
        }
        return -1;
    }
}
