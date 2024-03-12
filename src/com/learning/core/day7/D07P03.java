package com.learning.core.day7;

import java.util.Scanner;
import java.util.Stack;

public class D07P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);
        
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String inputString) {
        Stack<Character> stack = new Stack<>();
        
        
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        
        StringBuilder reversedStringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStringBuilder.append(stack.pop());
        }
        
        return reversedStringBuilder.toString();
    }
}