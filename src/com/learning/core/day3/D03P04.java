package com.learning.core.day3;

import java.util.HashSet;

public class D03P04 {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        HashSet<Integer> set = new HashSet<>();
        int firstRepeating = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (set.contains(array[i])) {
                firstRepeating = array[i];
            } else {
                set.add(array[i]);
            }
        }

        if (firstRepeating != -1) {
            System.out.println("First repeating element: " + firstRepeating);
        } else {
            System.out.println("No repeating element found.");
        }
    }
}