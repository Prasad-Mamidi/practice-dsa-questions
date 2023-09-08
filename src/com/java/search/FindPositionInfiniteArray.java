package com.java.search;

public class FindPositionInfiniteArray {
    public static void main(String[] args) {
        int[] arr ={2,5,7,9,12,15,19,34,65,87,123,778,999,1234};
        int index=findIndex(arr,65);
        System.out.println(index);
    }
    static int findIndex(int[] arr,int target){
        int start =0;
        int end=1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start, int end){
        while(start <= end){
            int mid = (start+end)/2;
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
}
