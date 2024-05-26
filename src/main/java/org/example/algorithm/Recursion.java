package org.example.algorithm;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,6,8};
        System.out.println(findElement(arr,44 ,0));
    }

    //    Sum of digits
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    //    Reverse numbers
    public static void reverseNum(int n) {
        int sum = 1;
        if (n == 0) {
            return;
        }
        int mod = n % 10;
        sum = sum * 10 + mod;

        reverseNum(n / 10);
        System.out.println(sum);
    }

    //    Print numbers from n -> 1
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    //    Print numbers 1 -> n
    public static void printNumsAsc(int num) {
        if (num == 0) {
            return;
        }
        printNumsAsc(num - 1);
        System.out.println(num);
    }

//    Print name to n times
    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Mithani");
        printName(n - 1);
    }

    //    Print sum of n numbers
//    Ex: n=3 -> 1 + 2 + 3 = 6
    static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNumbers(n - 1);
    }

    //    Reverse an array
    static int[] reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArray(arr, start + 1, end - 1);
    }

    //    Check whether the string is palindrome or not
    static boolean isPalindrome(String word, int start, int end) {
        if (word.length() == 1) {
            return true;
        }
        if (start >= end) {
            return true;
        }
        if (String.valueOf(word.charAt(start)).equals(String.valueOf(word.charAt(end)))) {
            return isPalindrome(word, start + 1, end - 1);
        } else {
            return false;
        }
    }

//    Count zeros in a number
    static int countZeros(int num, int count) {
        if (num == 0) {
            return count;
        }
        int rem = num % 10;
        if (rem == 0) {
            return countZeros(num / 10, count + 1);
        } else {
            return countZeros(num / 10, count);
        }
    }

    //    Reverse number
    static void reverseNum(int num, int rev) {
        if (num == 0) {
            System.out.println(rev);
            return;
        }
        rev = rev * 10 + num % 10;
        reverseNum(num / 10, rev);
    }
//    Check whether array is sorted or not
    static boolean isSorted(int[] arr,int i){
        if (i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return isSorted(arr,i+1);
        }else {
            return false;
        }
    }
//    Find an element
static int i = 0;
    static int findElement(int[] arr, int element ,int index){

        if(index==arr.length){
            return -1;
        }
        if(arr[index]==element){
            return index;
        }else {
            return findElement(arr,element,index+1);
        }
    }
}
