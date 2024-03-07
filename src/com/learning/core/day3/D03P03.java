package com.learning.core.day3;

public class D03P03{
    public static void main(String[] args) {
        int[] a = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        // 1. Compute the sum of elements indices from 0 to 14 and store it at element 15
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += a[i];
        }
        a[15] = sum;

        // 2. Compute the average of all numbers and store it at element 16
        double average = (double) sum / 18; // Total sum divided by number of elements (18)
        a[16] = (int) average;

        // 3. Identify the smallest value from the array and store it at element 17
        int min = a[0];
        for (int i = 1; i < 18; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        a[17] = min;

        // Display the updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}