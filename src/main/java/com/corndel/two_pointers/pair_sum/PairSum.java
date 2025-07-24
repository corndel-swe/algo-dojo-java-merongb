package com.corndel.two_pointers.pair_sum;

public class PairSum {
    public static boolean hasPairSumBruteForce(int[] arr, int target) {

        for  (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean hasPairSumTwoPointers(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                return true;
            }   else if (arr[i] + arr[j] > target) {
                j--;
            }   else if (arr[i] + arr[j] < target) {
                i++;
            }
        }
        return false;
    }
}
