package com.example;

public class ArraySum {

    public int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        ArraySum obj = new ArraySum();
        System.out.println("Sum of array elements: "
                + obj.findSum(arr));
    }
}
