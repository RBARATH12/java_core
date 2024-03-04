package com.learning.core.day2;

import java.util.Scanner;

public class D02P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1; // Any number raised to the power of 0 is 1
        } else if (exponent == 1) {
            return base; // Any number raised to the power of 1 is the number itself
        } else {
            double result = 1;
            boolean isNegativeExponent = exponent < 0;
            exponent = Math.abs(exponent); // Convert negative exponent to positive
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return isNegativeExponent ? 1 / result : result;
        }
    }
}