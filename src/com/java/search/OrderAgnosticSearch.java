package com.java.search;

public class OrderAgnosticSearch {
    static void println(int index){
        System.out.println(" The target element is found at "+index);
    }
    public static void main(String[] args) {
        int[] arr={2,4,8,16,32,64,128,256,512,1024};
        println(orderAgnostic(arr,32));
        int[] arr1 ={1024,512,256,128,64,32,16,8,4,2};
        println(orderAgnostic(arr1,64));
    }
    // In this approach first we find the order of array is determined then element index will be fetched
    static int orderAgnostic(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean asc = arr[start]<arr[end];
            while(start<=end){
                int mid = (start+end)/2;
                if(target == arr[mid]){
                    return mid;
                }
                if(asc){
                    if(target < arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
                else{
                    if(target < arr[mid]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
            return -1;
    }
}
