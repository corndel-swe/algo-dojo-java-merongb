package com.corndel.two_pointers.array_filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayFilter {

    public static int[] getDistinctNumbersBruteForce(int[] arr) {
            Set<Integer> set = new HashSet<>();

            for  (int i : arr) {
                set.add(i);
            }
            return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] getDistinctNumbersTwoPointers(int[] arr) {
        if (arr.length == 0) return new int[0];

        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }

        return Arrays.copyOf(temp, j);
    }

}
