package com.java.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {4,-5,1,2,0,411,-1223,36};
        selectionsort(numbers);
        System.out.println(Arrays.toString(numbers));
        selectionSort2(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    // sorting of array with O(N**N) time complexity
    static void selectionsort(int[] numbers) {
        for(int i=0;i<numbers.length;i++){
            // this is to keep skipping the already sorted elements at the end
            int lastIndex = numbers.length-i-1;
            int maxIndex = findMaxIndex(numbers,0,lastIndex);
            swap(numbers,maxIndex,lastIndex);
        }
    }
     // This method gives the maximum element index value
    static int findMaxIndex(int[] numbers,int start,int lastIndex){
        int max = start;
        for(int index=start;index<=lastIndex;index++) {
            if (numbers[index] > numbers[max]) {
                max = index;
            }
        }
        return max;
    }
    // this method replaces the last indexes with maximum elements
    static void swap(int[] numbers,int maxIndex, int lastIndex) {
        int temp = numbers[lastIndex];
        numbers[lastIndex]= numbers[maxIndex];
        numbers[maxIndex]= temp;
    }

    /* Here I am going to write the code for sorting the array in descending order*/

    static void selectionSort2(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int lastIndex = numbers.length-i-1;
             int minIndex = findMinIndex(numbers,0,lastIndex);
              swap2(numbers,lastIndex,minIndex);
        }
    }
    // this will help us to fetch the minimum element respecting index
    static int findMinIndex(int[] numbers,int start,int lastIndex){
        int min = start;
        for(int index=start;index<=lastIndex;index++){
            if(numbers[index] < numbers[min]){
                min = index;
            }
        }
        return min;
    }
    // this method will swap the last index element with minimum index elements
    //  to sort the array in descending order
    static void swap2(int[] numbers,int minIndex,int lastIndex){
        int temp = numbers[lastIndex];
        numbers[lastIndex]=numbers[minIndex];
        numbers[minIndex] = temp;
    }
}
