package com.corndel.two_pointers.array_reverser;

public class ArrayReverser {
    public static int[] reverseBruteForce(int[] arr) {
        int[] reverse  = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - i - 1];
        }
        return reverse;
    }


    public static int[] reverseTwoPointers(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
        return arr;
    }

}
