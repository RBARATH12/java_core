package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers (invalid input for factorial)
        }
        if (number == 0 || number == 1) {
            return 1; // Factorial of 0 and 1 is 1
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
