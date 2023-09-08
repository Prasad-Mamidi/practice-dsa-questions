package com.java.search;

public class RotatedSearchCount {
    public static void main(String[] args){
        int[] nums={4,5,6,1,2,3};
        int count=rotateCount(nums);
        System.out.println(count);

    }
    static int rotateCount(int[] nums){
        int peakIndex= peak(nums);
        if(peakIndex !=-1){
            return peakIndex+1;
        }
        return -1;
    }
    static int peak(int[] nums){
        int start =0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[mid+1]){
                return mid;
            }
            if(nums[mid]>nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] < nums[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
