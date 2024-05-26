package org.example.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("set " + Arrays.toString(new List[]{powerSet(arr)}));
////        Arrays.sort(arr);
//        System.out.println("\n" + Arrays.toString(arr) + "\n");
//        System.out.println("Find largest value: " + largestInt(arr));
//        System.out.println("Find largest value by sorting: " + largestIntBySorting(arr));
//        System.out.println("Find second largest value by finding largest first: " + secondLargestElement(arr));
//        System.out.println("Find second largest value optimal: " + secondLargestOptimal());
//        removeDuplicate(arr);
//        System.out.println("Find second largest and second smallest value optimal: " + Arrays.toString(secondLargestAndSmallest(arr)));

    }

    // 1.   Compare adjacent elements
    public static int largestInt(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    // 2.   Sort
    public static int largestIntBySorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 1];
    }

    // 3. Find second-largest element by finding largest first
    public static int secondLargestElement(int[] arr) {
        int max = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > secondLargest && arr[j] < max) {
                secondLargest = arr[j];
            }
        }
        return secondLargest;
    }

    // 4.   Find second largest optimal
    public static int secondLargestOptimal() {
        int[] arr = {55, 2, 43, 22, 13, 32, 6, 35, 67, 21, 22};
        int max = arr[0];
        int second = -1;
        for (int j : arr) {
            if (j > max) {
                second = max;
                max = j;
            }
        }
        return second;
    }

//    5. Return second largest and second smallest

    public static int[] secondLargestAndSmallest(int[] arr) {
        int secondSmall = -1;
        int secondLarge = -1;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
//            Second smallest
            if (min > arr[i]) {
                secondSmall = min;
                min = arr[i];
            }
//
        }
        return new int[]{secondLarge, secondSmall};
    }

    //  7.  Check whether array is sorted
    public static boolean isSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    //    8. Remove duplicate from sorted array
    public static void removeDuplicate(int[] arr) {
        int i = 0;
        int[] temp = new int[arr.length];
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] != arr[j + 1]) {
                System.out.println(arr[i]);
                temp[i++] = arr[j];
            }
        }
        temp[i] = arr[arr.length - 1];
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }

    //    Power set
    public static List<List<Integer>> powerSet(int[] arr) {

            List<List<Integer>> subSet = new ArrayList<>();
            int n = arr.length;

            // There are 2^n subsets
            for (int i = 0; i < (1 << n); i++) {
                List<Integer> set = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    // Check if j-th element is included in the i-th subset
                    if ((i & (1 << j)) != 0) {
                        set.add(arr[j]);
                    }
                }
                subSet.add(set);
            }

            return subSet;
        }

}
