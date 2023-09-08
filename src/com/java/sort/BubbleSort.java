package com.java.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums ={1000, 5000, 200, 15000, 700};
        bubbleSort1(nums);
        System.out.println(Arrays.toString(nums));
        bubbleSort2(nums);
        System.out.println(Arrays.toString(nums));

    }
    // ASCENDING ORDER
    static void bubbleSort1(int[] nums){
        for(int i=0;i<nums.length;i++){
            boolean swapped = false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }

    // DESCENDING ORDER
    static void bubbleSort2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j] > nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
