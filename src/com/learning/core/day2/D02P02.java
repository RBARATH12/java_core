package com.learning.core.day2;
import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        System.out.println("Even numbers less than or equal to " + n + ":");
        listEvenNumbers(n);
    }

    public static void listEvenNumbers(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }

}
