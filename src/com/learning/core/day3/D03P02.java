package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from 1 to 40
        System.out.println("Enter a number in the range of 1 to 40:");
        int userInput = scanner.nextInt();
        while (userInput < 1 || userInput > 40) {
            System.out.println("Invalid input! Enter a number in the range of 1 to 40:");
            userInput = scanner.nextInt();
        }

        // Array of five integers ranging from 1 to 40
        int[] array = {5, 12, 20, 30, 40};

        // Check if userInput is present in the array
        boolean bingo = false;
        for (int i = 0; i < array.length; i++) {
            if (userInput == array[i]) {
                bingo = true;
                break;
            }
        }

        // Display message
        if (bingo) {
            System.out.println("Bingo! The number " + userInput + " is present in the array.");
        } else {
            System.out.println("The number " + userInput + " is not present in the array.");
        }

        scanner.close();
    }
}
