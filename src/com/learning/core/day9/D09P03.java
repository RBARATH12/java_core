package com.learning.core.day9;

import java.util.Scanner;



public class D09P03{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

        int n = scanner.nextInt();

        

        int[] arr = new int[n];

        

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }

        

        int x = scanner.nextInt();

  

        int index = linearSearch(arr, x);

        

        if (index != -1) {

            System.out.println("Element is Present");

        } else {

            System.out.println("Element is not Present");

        }

        

        scanner.close();

    }

    public static int linearSearch(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {

                return i; // Return the index if element found

            }

        }

        return -1; // Return -1 if element not found

    }

}

