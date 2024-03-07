package com.learning.core.day2;
import java.util.Scanner;

public class D02P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the reverse pyramid: ");
        int rows = scanner.nextInt();

        printReversePyramid(rows);
    }

    public static void printReversePyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}