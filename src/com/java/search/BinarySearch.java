package com.java.search;

public class BinarySearch {
    public static void main(String[] args) {
        //int[] arr={2,4,8,16,32,64,128,256,512,1024};
        int[] arr={1,3,7,9,14,19,45};
        System.out.println(binarySearch1(arr,14));
        int[] arr1 ={1024,512,256,128,64,32,16,8,4,2};
        System.out.println(binarySearch2(arr1,128));

    }
    //return index of the target element
    //return -1 if the desired element is not found
    //this approach is for ascending sorted array
    static int binarySearch1(int[] arr,int target){
        int start = 0;
        int end=arr.length-1;
//        int count=0;
        while(start <= end){
            // middle index of an array
//            count++;
//            System.out.println(count);
            int mid=(start+end)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    // for discending ordered array
    static int binarySearch2(int[] arr1,int target){
        int start =0;
        int end =arr1.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target < arr1[mid]){
                start=mid+1;
            }
            else if(target > arr1[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
