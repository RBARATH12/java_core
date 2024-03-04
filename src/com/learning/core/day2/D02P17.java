package com.learning.core.day2;
import java.util.Scanner;

public class D02P17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        printNumbers(n);
    }

    public static void printNumbers(int n) {
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing all numbers
    }
}
