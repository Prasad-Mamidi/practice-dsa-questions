package com.java.search;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        int i = maximumWealth(accounts);
        System.out.println(i);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] customer : accounts) {
           int balanceSum = 0;
            for (int bank : customer) {
                balanceSum += bank;
            }
            if (balanceSum > max) {
                System.out.println(balanceSum);
                max = balanceSum;

            }
        }
        return max;

    }
}