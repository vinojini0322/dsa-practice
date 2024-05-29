package org.example.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 55, 65, 76, 87,};
        System.out.println(findFloorOfNumber(arr, 89));
    }

    //    Find target
    static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > mid) {
                start = mid + 1;
            } else if (target < mid) {
                end = mid - 1;
            }

        }
        return -1;
    }

    //    Find ceiling of number
    static int findCeilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    //    Find floor of number
    static int findFloorOfNumber(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target <= arr[0]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(target>arr[arr.length-1]){
            return arr[arr.length-1];
        }
        return arr[end];
    }
//
}
