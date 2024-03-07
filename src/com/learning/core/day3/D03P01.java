package com.learning.core.day3;

import java.util.Scanner;

public class D03P01 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display length of string
        System.out.println("Length of string: " + inputString.length());

        // Display string in uppercase
        System.out.println("Uppercase string: " + inputString.toUpperCase());

        // Check if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        // Compare string with its reverse
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
