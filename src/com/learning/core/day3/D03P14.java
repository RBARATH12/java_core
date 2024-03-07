package com.learning.core.day3;

import java.util.*;

public class D03P14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        
        System.out.println("Union: " + Arrays.toString(findUnion(arr1, arr2)));
        System.out.println("Intersection: " + Arrays.toString(findIntersection(arr1, arr2)));
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        int[] union = new int[set.size()];
        int i = 0;
        for (int num : set) {
            union[i++] = num;
        }
        Arrays.sort(union);
        return union;
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersectionList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersectionList.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] intersection = new int[intersectionList.size()];
        for (i = 0; i < intersectionList.size(); i++) {
            intersection[i] = intersectionList.get(i);
        }
        return intersection;
    }
}